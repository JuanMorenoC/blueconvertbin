package blueconvertbin.hexadecimal;

import java.util.ArrayList;

import blueconvertbin.decimal.ConvertDecimalToBinary;
import blueconvertbin.entity.NumberHexadecimal;

public class ConvertHexadecimalToBinary {
	
	private NumberHexadecimal n = null;
	private ArrayList<String> listNumbersInHexadecimal = null;
	private ConvertDecimalToBinary cbd = null; 

	public ConvertHexadecimalToBinary() {
		// TODO Auto-generated constructor stub
	}
	
	public ConvertHexadecimalToBinary(String number) {
		this.n = new NumberHexadecimal(number);
		this.listNumbersInHexadecimal = new ArrayList<>();
	}
	
	public String getResultInBinary() {
		String result = "";
		String numberHexadecimal = this.n.getNumber();
		for(int i=0;i<numberHexadecimal.length();i++){
			this.listNumbersInHexadecimal.add(numberHexadecimal.substring(i,i+1));
        }
		result = getBinary(this.listNumbersInHexadecimal);
		return result;
	}

	private String getBinary(ArrayList<String> listNumbersInHexadecimal2) {
		String resultBinary = "";
		String auxNumber = "";
		for(int i=0;i<listNumbersInHexadecimal2.size();i++) {
			auxNumber = listNumbersInHexadecimal2.get(i);
			if(auxNumber.equals("A")) {
				this.cbd = new ConvertDecimalToBinary(10);
				resultBinary += this.cbd.getResultInBinary();
			} else if(auxNumber.equals("B")) {
				this.cbd = new ConvertDecimalToBinary(11);
				resultBinary += this.cbd.getResultInBinary();
			} else if(auxNumber.equals("C")) {
				this.cbd = new ConvertDecimalToBinary(12);
				resultBinary += this.cbd.getResultInBinary();
			} else if(auxNumber.equals("D")) {
				this.cbd = new ConvertDecimalToBinary(13);
				resultBinary += this.cbd.getResultInBinary();
			} else if(auxNumber.equals("E")) {
				this.cbd = new ConvertDecimalToBinary(14);
				resultBinary += this.cbd.getResultInBinary();
			} else if(auxNumber.equals("F")) {
				this.cbd = new ConvertDecimalToBinary(15);
				resultBinary += this.cbd.getResultInBinary();
			} else {
				this.cbd = new ConvertDecimalToBinary(Integer.parseInt(auxNumber));
				resultBinary += this.cbd.getResultInBinary();
			}			
		}
		return resultBinary;
	}

}
