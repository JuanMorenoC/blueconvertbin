package blueconvertbin.decimal;

import java.util.ArrayList;

import blueconvertbin.entity.Number;

public class ConvertDecimalToHexadecimal {
	
	private Number n = null;
	private ArrayList<String> listNumbersInHexadecimal = null;

	public ConvertDecimalToHexadecimal() {
		// TODO Auto-generated constructor stub
	}
	
	public ConvertDecimalToHexadecimal(int number) {
		// TODO Auto-generated constructor stub
		this.n = new Number(number);
		this.listNumbersInHexadecimal = new ArrayList<>();
	}
	
	public String getResultInHexadecimal() {
		String result = "";
		int numberDecimal = this.n.getNumber();
		while(numberDecimal > 0) {
			if(numberDecimal % 16 == 10) {
				this.listNumbersInHexadecimal.add("A");
				numberDecimal = numberDecimal / 16;
			} else if(numberDecimal % 16 == 11) {
				this.listNumbersInHexadecimal.add("B");
				numberDecimal = numberDecimal / 16;
			} else if(numberDecimal % 16 == 12) {
				this.listNumbersInHexadecimal.add("C");
				numberDecimal = numberDecimal / 16;
			} else if(numberDecimal % 16 == 13) {
				this.listNumbersInHexadecimal.add("D");
				numberDecimal = numberDecimal / 16;
			} else if(numberDecimal % 16 == 14) {
				this.listNumbersInHexadecimal.add("E");
				numberDecimal = numberDecimal / 16;
			} else if(numberDecimal % 16 == 15) {
				this.listNumbersInHexadecimal.add("F");
				numberDecimal = numberDecimal / 16;
			} else {
				this.listNumbersInHexadecimal.add("" + numberDecimal % 16);
				numberDecimal = numberDecimal / 16;
			}
		}
		for(int i=this.listNumbersInHexadecimal.size()-1;i>=0;i--) {
			result += this.listNumbersInHexadecimal.get(i);
		}
		return result;
	}
}
