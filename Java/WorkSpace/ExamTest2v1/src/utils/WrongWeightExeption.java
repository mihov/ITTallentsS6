package utils;

public class WrongWeightExeption extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WrongWeightExeption(String arg0) {
		super("This meal has wrong weight: " + arg0);
		// TODO Auto-generated constructor stub
	}

}
