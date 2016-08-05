package shop;

import instruments.Instrument;

public class NoInstrumentExist extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoInstrumentExist(Instrument instr){
		System.err.println("Instrument "+instr.getName()+ " do not exist.");
	}
	
	

}
