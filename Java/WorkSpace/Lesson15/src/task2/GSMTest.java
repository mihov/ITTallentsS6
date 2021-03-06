package task2;

public class GSMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SIM simCardMtel = new SIM("Mtel", "0887766550");
		SIM simCardViva = new SIM("ViVa", "0374445555");

		GSM sony = new GSM();
		sony.model = "T5";
		sony.insertSIMCard(simCardMtel);

		GSM samsung = new GSM();
		samsung.model = "Edge 7";
		samsung.insertSIMCard(simCardViva);

		samsung.call(sony, 10);

		sony.call(sony, 1);

		sony.call(samsung, 0);

		sony.call(samsung, 20);

		System.out.println("Sony call duration: " + sony.getSumForCall() + "lv.");
		System.out.println("Samsung call duration: " + samsung.getSumForCall() + "lv.");
		
		sony.printInfoForTheLastOutgoingCall();
		samsung.printInfoForTheLastOutgoingCall();
		
		sony.printInfoForTheLastIncomingCall();
		samsung.printInfoForTheLastIncomingCall();

	}

}
