package task2;

import org.jcp.xml.dsig.internal.dom.DOMCanonicalXMLC14N11Method;

public class GSM {
	public String model;
	private boolean hasSIMCard;
	private SIM simCard;
	public String simMobileNumber;

	public int outgoingCallsDuration = 0;
	public Call lastIncomingCall;
	public Call lastOutgoingCall;

	public boolean getHasSIMCard() {
		return this.hasSIMCard;
	}

	public void call(GSM receiver, int duration) {
		if (duration > 0 && this.getHasSIMCard() && receiver.getHasSIMCard() && !this.equals(receiver)) {
			this.outgoingCallsDuration += duration;
			this.lastOutgoingCall = new Call(this, receiver, duration);
			receiver.lastIncomingCall = this.lastOutgoingCall;

			System.out.println(this.simMobileNumber + " > Call > " + receiver.simMobileNumber + " [" + duration + "]");
		} else {
			System.out.println("Invalid Call!!!");
		}
	}

	public void insertSIMCard(SIM newSIMCard) {
		this.simCard = newSIMCard;
		this.hasSIMCard = true;
		this.simMobileNumber = this.simCard.getNumber();
		System.out.println(this.model + "> New SIM card inserted.");
		System.out.println(this.model + "> Your number is: " + this.simMobileNumber);
	}

	public void removeSIMCard() {
		this.simCard = null;
		this.hasSIMCard = false;
		this.simMobileNumber = "No number";
		System.out.println(this.model + "> SIM card remouved.");
		System.out.println(this.model + "> Your have no number.");
	}

	public double getSumForCall() {
		return this.outgoingCallsDuration * Call.getPriceForAMinute();
	}

	public void printInfoForTheLastOutgoingCall() {
		System.out.println(this.model + "> Last outgoing call to[" + this.lastOutgoingCall.getReceiver().simMobileNumber
				+ "] duration [" + this.lastOutgoingCall.getDuration() + "]");
	}

	public void printInfoForTheLastIncomingCall() {
		System.out.println(this.model + "> Last incoming call from[" + this.lastIncomingCall.getCaller().simMobileNumber
				+ "] duration [" + this.lastIncomingCall.getDuration() + "]");
	}
}
