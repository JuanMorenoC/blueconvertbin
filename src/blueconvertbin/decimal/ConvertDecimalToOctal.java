package blueconvertbin.decimal;

import java.util.ArrayList;

import blueconvertbin.entity.Number;

public class ConvertDecimalToOctal {
	
	private Number n = null;
	private ArrayList<Integer> listNumbersInOctal = null;

	public ConvertDecimalToOctal() {
		// TODO Auto-generated constructor stub
	}
	
	public ConvertDecimalToOctal(int number) {
		// TODO Auto-generated constructor stub
		this.n = new Number(number);
		this.listNumbersInOctal = new ArrayList<>();
	}
	
	public String getResultInOctal() {
		String result = "";
		int numberDecimal = this.n.getNumber();
		while(numberDecimal > 0) {
			this.listNumbersInOctal.add(numberDecimal % 8);
			numberDecimal = numberDecimal / 8;
		}
		for(int i=this.listNumbersInOctal.size()-1;i>=0;i--) {
			result += this.listNumbersInOctal.get(i);
		}
		return result;
	}

}
