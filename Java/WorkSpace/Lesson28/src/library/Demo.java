package library;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		Library biblioteka = new Library("Haskovo prison library");
		
		Reader yasen = new Reader("Yasen", 10);
		Reader jivko = new Reader("Jivko", 15);
		Reader nedko = new Reader("Nedko", 20);
		Reader krisi = new Reader("Krisi", 25);
		Reader bella = new Reader("Bella", 30);
		
		bella.start();
		yasen.start();
		jivko.start();
		nedko.start();
		krisi.start();
	}
}
