package blueconvertbin.binary;

import java.util.ArrayList;

import blueconvertbin.entity.Number;

public class ConvertBinaryToDecimal {
	
	private Number n = null;
	private ArrayList<Integer> listNumbersInBinary= null;

	public ConvertBinaryToDecimal() {
		// TODO Auto-generated constructor stub
	}
	
	public ConvertBinaryToDecimal(int number) {
		// TODO Auto-generated constructor stub
		this.n = new Number(number);
		this.listNumbersInBinary = new ArrayList<>();
	}
	
	public String getResultInDecimal() {
		String result = "";
		String numberBinary = String.valueOf(this.n.getNumber());
		int sumNumber = 0;
		int i = 0;
        while(i < numberBinary.length()){
        	this.listNumbersInBinary.add(Integer.parseInt(numberBinary.substring(i, i+1)));
        	i++;
        }
        int k=0;
        for(int j=this.listNumbersInBinary.size()-1;j>=0;j--) {
        	sumNumber += (this.listNumbersInBinary.get(k) * Math.pow(2, j));
        	k++;
        }
        result = String.valueOf(sumNumber);
		return result;
	}

}
