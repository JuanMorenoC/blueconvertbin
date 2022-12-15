package blueconvertbin.hexadecimal;

import java.util.ArrayList;

import blueconvertbin.binary.ConvertBinaryToOctal;
import blueconvertbin.entity.NumberHexadecimal;

public class ConvertHexadecimalToOctal {
	
	private NumberHexadecimal n = null;
	private ArrayList<String> listNumbersInHexadecimal = null;
	private ArrayList<String> listNumbersInBinary = null;
	private ConvertHexadecimalToBinary chb = null;
	private ConvertBinaryToOctal cbo = null;

	public ConvertHexadecimalToOctal() {
		// TODO Auto-generated constructor stub
	}
	
	public ConvertHexadecimalToOctal(String number) {
		this.n = new NumberHexadecimal(number);
		this.listNumbersInHexadecimal = new ArrayList<>();
	}
	
	public String getResultInOctal() {
		String result = "";
		String numberHexadecimal = this.n.getNumber();
		for(int i=0;i<numberHexadecimal.length();i++){
			this.listNumbersInHexadecimal.add(numberHexadecimal.substring(i,i+1));
        }
		this.listNumbersInBinary = getBinary(this.listNumbersInHexadecimal);
		result = getOctal(this.listNumbersInBinary);
		return result;
	}
	
	private ArrayList<String> getBinary(ArrayList<String> listNumbersInHexadecimal2) {
		ArrayList<String> listNumbersInBinary2 = new ArrayList<>();
		for(int i=0;i<listNumbersInHexadecimal2.size();i++) {
			this.chb = new ConvertHexadecimalToBinary(listNumbersInHexadecimal2.get(i));
			listNumbersInBinary2.add(this.chb.getResultInBinary());
		}
		return listNumbersInBinary2;
	}
	
	private String getOctal(ArrayList<String> listNumbersInBinary3) {
		String resultOctal = "";
		String numberBinary = "";
		int auxNumber = 0;
		for(int i=0;i<listNumbersInBinary3.size();i++) {
			numberBinary += listNumbersInBinary3.get(i);
		}
		auxNumber = Integer.parseInt(numberBinary);
		this.cbo = new ConvertBinaryToOctal(auxNumber);
		resultOctal = this.cbo.getResultInOctal();
		return resultOctal;
	}

}
