package daemons;

public class Hell {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Welcome to hell!");
		Mefisto mefisto = new Mefisto();
		mefisto.setDaemon(true);
		mefisto.start();
		Thread.sleep(1000);
		System.out.println("Bye hell! We will now exit");
	}
}
