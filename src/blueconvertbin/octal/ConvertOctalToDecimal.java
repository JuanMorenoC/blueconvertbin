package blueconvertbin.octal;

import java.util.ArrayList;

import blueconvertbin.entity.Number;

public class ConvertOctalToDecimal {
	
	private Number n = null;
	private ArrayList<Integer> listNumbersInOctal = null;

	public ConvertOctalToDecimal() {
		// TODO Auto-generated constructor stub
	}
	
	public ConvertOctalToDecimal(int number) {
		this.n = new Number(number);
		this.listNumbersInOctal = new ArrayList<>();
	}
	
	public String getResultInBinary() {
		String result = "";
		String numberOctal = String.valueOf(this.n.getNumber());
		for(int i=0;i<numberOctal.length();i++) {
			this.listNumbersInOctal.add(Integer.parseInt(numberOctal.substring(i, i+1)));
		}
		result = getBinary(this.listNumbersInOctal);
		return result;
	}
	
	private String getBinary(ArrayList<Integer> listNumbersInOctal2) {
		// TODO Auto-generated method stub
		String resultBinary = "";
		int auxNumber = 0;
		int sumNumber = 0;
		int k=listNumbersInOctal2.size()-1;
		for(int i=0;i<listNumbersInOctal2.size();i++) {
			auxNumber = listNumbersInOctal2.get(i);
			sumNumber += auxNumber * (int)Math.pow(8, k);
			k--;
		}
		resultBinary = String.valueOf(sumNumber);
		return resultBinary;
	}
}
