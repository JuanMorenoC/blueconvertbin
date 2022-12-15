package blueconvertbin.binary;

import java.util.ArrayList;

import blueconvertbin.entity.Number;

public class ConvertBinaryToHexadecimal {
	
	private Number n = null;
	private ArrayList<String> listNumbersInBinary = null;
	private ArrayList<String> listNumbersInBinaryCorrect = null;
	private ConvertBinaryToDecimal cbd = null;

	public ConvertBinaryToHexadecimal() {
		// TODO Auto-generated constructor stub
	}
	
	public ConvertBinaryToHexadecimal(int number) {
		// TODO Auto-generated constructor stub
		this.n = new Number(number);
		this.listNumbersInBinary = new ArrayList<>();
		this.listNumbersInBinaryCorrect = new ArrayList<>();
	}
	
	public String getResultInHexadecimal() {
		String result = "";
		String numberBinary = String.valueOf(this.n.getNumber());
		String auxNumberBinary = "";
		for(int i=numberBinary.length()-1;i>=0;i--){
			auxNumberBinary += numberBinary.substring(i,i+1);
            if(auxNumberBinary.length() == 4){
                this.listNumbersInBinary.add(auxNumberBinary);
                auxNumberBinary = "";
            }
        }
		if(auxNumberBinary != "") {
			this.listNumbersInBinary.add(auxNumberBinary);
		}
		for(int j=0;j<this.listNumbersInBinary.size();j++){
            String cadena = this.listNumbersInBinary.get(j);
            String invertida = "";
            for (int k = cadena.length() - 1; k >= 0; k--) {
			    invertida += cadena.charAt(k);
		    }
		    this.listNumbersInBinaryCorrect.add(invertida);
        }
		result = getHexadecimal(this.listNumbersInBinaryCorrect);
		return result;
	}

	private String getHexadecimal(ArrayList<String> listNumbersInBinaryCorrect2) {
		String resultHexadecimal = "";
		String auxNumber = "";
		for(int i=listNumbersInBinaryCorrect2.size()-1;i>=0;i--) {
			this.cbd = new ConvertBinaryToDecimal(Integer.parseInt(listNumbersInBinaryCorrect2.get(i)));
			auxNumber = this.cbd.getResultInDecimal();
			if(auxNumber.equals("10")) {
				resultHexadecimal += "A";
			} else if(auxNumber.equals("11")) {
				resultHexadecimal += "B";
			} else if(auxNumber.equals("12")) {
				resultHexadecimal += "C";
			} else if(auxNumber.equals("13")) {
				resultHexadecimal += "D";
			} else if(auxNumber.equals("14")) {
				resultHexadecimal += "E";
			} else if(auxNumber.equals("15")) {
				resultHexadecimal += "F";
			} else {
				resultHexadecimal += auxNumber;
			}
		}
		return resultHexadecimal;
	}
}
