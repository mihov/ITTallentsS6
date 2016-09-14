package model.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import model.User;

public class UserDAO {
	private static UserDAO instance;
	
	private UserDAO(){}
	
	public synchronized static UserDAO getInstance(){
		if(instance == null){
			instance = new UserDAO();
		}
		return instance;
	}
	
	public Set<User> getAllUsers(){
		Set<User> users = new HashSet<User>();
		try {
			Statement st = DBManager.getInstance().getConnection().createStatement();
			ResultSet resultSet = st.executeQuery("SELECT username, name, password, email, address FROM users;");
			while(resultSet.next()){
				users.add(new User(	resultSet.getString("username"),
									resultSet.getString("name"),
									resultSet.getString("password"),
									resultSet.getString("email"),
									resultSet.getString("address")
									));
			}
		} catch (SQLException e) {
			System.out.println("Oops, cannot make statement.");
			return users;
		}
		System.out.println("Users loaded successfully");
		return users;
	}
	
	public void saveUser(User user){
		try {
			PreparedStatement st = DBManager.getInstance().getConnection().prepareStatement("INSERT INTO users (username, name, password, email, address) VALUES (?, ?, ?, ?, ?);");
			st.setString(1, user.getUsername());
			st.setString(2, user.getName());
			st.setString(3, user.getPassword());
			st.setString(4, user.getEmail());
			st.setString(5, user.getAddress());
			st.executeUpdate();
			System.out.println("User added successfully");
		} catch (SQLException e) {
			System.out.println("Oops .. did not save the user");
			e.printStackTrace();
		}
		
	}
	
}
