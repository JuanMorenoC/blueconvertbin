package blueconvertbin.octal;

import java.util.ArrayList;

import blueconvertbin.entity.Number;

public class ConvertOctalToBinary {
	
	private Number n = null;
	private ArrayList<Integer> listNumbersInOctal = null;

	public ConvertOctalToBinary() {
		// TODO Auto-generated constructor stub
	}
	
	public ConvertOctalToBinary(int number) {
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
		for(int i=0;i<listNumbersInOctal2.size();i++) {
			auxNumber = listNumbersInOctal2.get(i);
			if(auxNumber == 0) {
				resultBinary += "000";
			} else if(auxNumber == 1) {
				resultBinary += "001";
			} else if(auxNumber == 2) {
				resultBinary += "010";
			} else if(auxNumber == 3) {
				resultBinary += "011";
			} else if(auxNumber == 4) {
				resultBinary += "100";
			} else if(auxNumber == 5) {
				resultBinary += "101";
			} else if(auxNumber == 6) {
				resultBinary += "110";
			} else if(auxNumber == 7) {
				resultBinary += "111";
			}
		}
		return resultBinary;
	}
}
