package task2;

public class Call {
	public static double priceForAMinute = 0.5;

	private GSM caller;
	private GSM receiver;
	private int duration;

	public static double getPriceForAMinute() {
		return priceForAMinute;
	}

	public GSM getCaller() {
		return caller;
	}

	public GSM getReceiver() {
		return receiver;
	}

	public int getDuration() {
		return duration;
	}

	public Call(GSM caller, GSM receiver, int duration) {
		this.caller = caller;
		this.receiver = receiver;
		this.duration = duration;
	}

}
