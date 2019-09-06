package de.afikri.warmup.utilities;

public class Integers {
	/**
	 * e.g. input = 54321 output = 12345
	 * @param input
	 * @return
	 */
	//Reverse an Integer value
	public int reverseIneger(int input) {
		int output = 0;
		
		do {
			//be aware if 10*output > Integer.max_value!!
			output = 10*output+input%10;
			input /=10;
		}while(input>0);
		
		
		return output;
	}

}
