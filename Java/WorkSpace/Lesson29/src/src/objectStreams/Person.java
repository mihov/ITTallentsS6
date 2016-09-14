package src.objectStreams;

import java.io.Serializable;

public class Person implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1032852711770874495L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 5253524073216659725L;
	private String name;
	private int age;
	private String gender;
	private int x;
	
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	
}
