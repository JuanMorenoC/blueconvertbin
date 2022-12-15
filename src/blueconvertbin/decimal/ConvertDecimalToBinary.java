package blueconvertbin.decimal;

import java.util.ArrayList;

import blueconvertbin.entity.Number;

public class ConvertDecimalToBinary {
	
	private Number n = null;
	private ArrayList<Integer> listNumbersInBinary = null;

	public ConvertDecimalToBinary() {
		// TODO Auto-generated constructor stub
	}

	public ConvertDecimalToBinary(int number) {
		// TODO Auto-generated constructor stub
		this.n = new Number(number);
		this.listNumbersInBinary = new ArrayList<>();
	}
	
	public String getResultInBinary() {
		String result = "";
		int numberDecimal = this.n.getNumber();
		while(numberDecimal > 0) {
			if(numberDecimal % 2 == 0) {
				this.listNumbersInBinary.add(0);
				numberDecimal = numberDecimal / 2;
			}
			if(numberDecimal % 2 == 1) {
				this.listNumbersInBinary.add(1);
				numberDecimal = numberDecimal / 2;
			}
		}
		for(int i=this.listNumbersInBinary.size()-1;i>=0;i--) {
			result += this.listNumbersInBinary.get(i);
		}
		return result;
	}
}
