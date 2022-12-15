package blueconvertbin.binary;

import java.util.ArrayList;

import blueconvertbin.entity.Number;

public class ConvertBinaryToOctal {
	
	private Number n = null;
	private ArrayList<String> listNumbersInBinary = null;
	private ArrayList<String> listNumbersInBinaryCorrect = null;
	private ConvertBinaryToDecimal cbd = null;

	public ConvertBinaryToOctal() {
		// TODO Auto-generated constructor stub
	}
	
	public ConvertBinaryToOctal(int number) {
		this.n = new Number(number);
		this.listNumbersInBinary = new ArrayList<>();
		this.listNumbersInBinaryCorrect = new ArrayList<>();
	}
	
	public String getResultInOctal() {
		String result = "";
		String numberBinary = String.valueOf(this.n.getNumber());
		String auxNumberBinary = "";
		for(int i=numberBinary.length()-1;i>=0;i--){
			auxNumberBinary += numberBinary.substring(i,i+1);
            if(auxNumberBinary.length() == 3){
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
		result = getOctal(this.listNumbersInBinaryCorrect);
		return result;
	}

	private String getOctal(ArrayList<String> listNumbersInBinaryCorrect2) {
		String resultHexadecimal = "";
		String auxNumber = "";
		for(int i=listNumbersInBinaryCorrect2.size()-1;i>=0;i--) {
			this.cbd = new ConvertBinaryToDecimal(Integer.parseInt(listNumbersInBinaryCorrect2.get(i)));
			resultHexadecimal += this.cbd.getResultInDecimal();
		}
		return resultHexadecimal;
	}
}
