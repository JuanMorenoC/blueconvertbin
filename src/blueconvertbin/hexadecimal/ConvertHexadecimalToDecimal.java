package blueconvertbin.hexadecimal;

import java.util.ArrayList;
import blueconvertbin.entity.NumberHexadecimal;

public class ConvertHexadecimalToDecimal {
	
	private NumberHexadecimal n = null;
	private ArrayList<String> listNumbersInHexadecimal = null;

	public ConvertHexadecimalToDecimal() {
		// TODO Auto-generated constructor stub
	}

	public ConvertHexadecimalToDecimal(String number) {
		this.n = new NumberHexadecimal(number);
		this.listNumbersInHexadecimal = new ArrayList<>();
	}
	
	public String getResultInBinary() {
		String result = "";
		String numberHexadecimal = this.n.getNumber();
		for(int i=0;i<numberHexadecimal.length();i++){
			this.listNumbersInHexadecimal.add(numberHexadecimal.substring(i,i+1));
        }
		result = getDecimal(this.listNumbersInHexadecimal);
		return result;
	}
	
	private String getDecimal(ArrayList<String> listNumbersInHexadecimal2) {
		String resultDecimal = "";
		String auxNumber = "";
		int auxOperator = 0;
		int k=listNumbersInHexadecimal2.size()-1;
		for(int i=0;i<listNumbersInHexadecimal2.size();i++) {
			auxNumber = listNumbersInHexadecimal2.get(i);
			if(auxNumber.equals("A")) {
				auxOperator += 10 * (int)Math.pow(16, k);
			} else if(auxNumber.equals("B")) {
				auxOperator += 11 * (int)Math.pow(16, k);
			} else if(auxNumber.equals("C")) {
				auxOperator += 12 * (int)Math.pow(16, k);
			} else if(auxNumber.equals("D")) {
				auxOperator += 13 * (int)Math.pow(16, k);
			} else if(auxNumber.equals("E")) {
				auxOperator += 14 * (int)Math.pow(16, k);
			} else if(auxNumber.equals("F")) {
				auxOperator += 15 * (int)Math.pow(16, k);
			} else {
				auxOperator += Integer.parseInt(auxNumber) * (int)Math.pow(16, k);
			}
			k--;
		}
		resultDecimal = String.valueOf(auxOperator);
		return resultDecimal;
	}
}
