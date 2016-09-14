package singleton;

public class TheSystem {
	private static final TheSystem instance = new TheSystem();

	private TheSystem() {
	}

	public static synchronized TheSystem getInstance() {

		return instance;
	}
}
