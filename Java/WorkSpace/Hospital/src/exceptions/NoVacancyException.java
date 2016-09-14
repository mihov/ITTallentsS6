package exceptions;

public class NoVacancyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2724807822917655121L;
	
	public NoVacancyException() {
		
	}
	@Override
	public String getMessage() {
				return "No vacancy in this room.";
	}




}
