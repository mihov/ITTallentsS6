package daemons;

public class Mefisto extends Thread{

	@Override
	public void run() {
	
		while(true){
			System.out.println("You`re too late!");
			
			System.out.println("Muhahahaha!");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
