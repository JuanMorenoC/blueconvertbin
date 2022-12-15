package blueconvertbin.octal;

import java.util.ArrayList;

import blueconvertbin.binary.ConvertBinaryToHexadecimal;
import blueconvertbin.entity.Number;

public class ConvertOctalToHexadecimal {
	
	private Number n = null;
	private ArrayList<String> listNumbersInOctal = null;
	private ArrayList<String> listNumbersInBinary = null;
	private ConvertOctalToBinary cob = null;
	private ConvertBinaryToHexadecimal cbh = null;

	public ConvertOctalToHexadecimal() {
		// TODO Auto-generated constructor stub
	}
	
	public ConvertOctalToHexadecimal(int number) {
		this.n = new Number(number);
		this.listNumbersInOctal = new ArrayList<>();
	}
	
	public String getResultInHexadecimal() {
		String result = "";
		String numberOctal = String.valueOf(this.n.getNumber());
		for(int i=0;i<numberOctal.length();i++){
			this.listNumbersInOctal.add(numberOctal.substring(i,i+1));
        }
		this.listNumbersInBinary = getBinary(this.listNumbersInOctal);
		result = getHexadecimal(this.listNumbersInBinary);
		return result;
	}
	
	private ArrayList<String> getBinary(ArrayList<String> listNumbersInHexadecimal2) {
		ArrayList<String> listNumbersInBinary2 = new ArrayList<>();
		for(int i=0;i<listNumbersInHexadecimal2.size();i++) {
			this.cob = new ConvertOctalToBinary(Integer.parseInt(listNumbersInHexadecimal2.get(i)));
			listNumbersInBinary2.add(this.cob.getResultInBinary());
		}
		return listNumbersInBinary2;
	}
	
	private String getHexadecimal(ArrayList<String> listNumbersInBinary3) {
		String resultOctal = "";
		String numberBinary = "";
		int auxNumber = 0;
		for(int i=0;i<listNumbersInBinary3.size();i++) {
			numberBinary += listNumbersInBinary3.get(i);
		}
		auxNumber = Integer.parseInt(numberBinary);
		this.cbh = new ConvertBinaryToHexadecimal(auxNumber);
		resultOctal = this.cbh.getResultInHexadecimal();
		return resultOctal;
	}

}
