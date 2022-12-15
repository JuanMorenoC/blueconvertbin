package blueconvertbin;

import blueconvertbin.binary.ConvertBinaryToDecimal;
import blueconvertbin.binary.ConvertBinaryToHexadecimal;
import blueconvertbin.binary.ConvertBinaryToOctal;
import blueconvertbin.decimal.ConvertDecimalToBinary;
import blueconvertbin.decimal.ConvertDecimalToHexadecimal;
import blueconvertbin.decimal.ConvertDecimalToOctal;
import blueconvertbin.hexadecimal.ConvertHexadecimalToBinary;
import blueconvertbin.hexadecimal.ConvertHexadecimalToDecimal;
import blueconvertbin.hexadecimal.ConvertHexadecimalToOctal;
import blueconvertbin.octal.ConvertOctalToBinary;
import blueconvertbin.octal.ConvertOctalToDecimal;
import blueconvertbin.octal.ConvertOctalToHexadecimal;

public class Operator {

	public Operator() {
		// main operator for conversions
		
		// converts from decimal to binary
		ConvertDecimalToBinary cdb = new ConvertDecimalToBinary(35631);
		printMessage(cdb.getResultInBinary());
		
		// converts from decimal to hexadecimal
		ConvertDecimalToHexadecimal cdh = new ConvertDecimalToHexadecimal(35631);
		printMessage(cdh.getResultInHexadecimal());
		
		// converts from decimal to octal
		ConvertDecimalToOctal cdo = new ConvertDecimalToOctal(35631);
		printMessage(cdo.getResultInOctal());
		
		// converts from binary to decimal
		ConvertBinaryToDecimal cbd = new ConvertBinaryToDecimal(110);
		printMessage(cbd.getResultInDecimal());
		
		// converts from binary to hexadecimal
		ConvertBinaryToHexadecimal cbh = new ConvertBinaryToHexadecimal(101100);
		printMessage(cbh.getResultInHexadecimal());
		
		// converts from binary to octal
		ConvertBinaryToOctal cbo = new ConvertBinaryToOctal(101100);
		printMessage(cbo.getResultInOctal());
		
		// converts from hexadecimal to binary
		ConvertHexadecimalToBinary chb = new ConvertHexadecimalToBinary("5D");
		printMessage(chb.getResultInBinary());
		
		// converts from hexadecimal to decimal
		ConvertHexadecimalToDecimal chd = new ConvertHexadecimalToDecimal("5F");
		printMessage(chd.getResultInBinary());
		
		// converts from hexadecimal to octal
		ConvertHexadecimalToOctal cho = new ConvertHexadecimalToOctal("8F");
		printMessage(cho.getResultInOctal());
		
		// converts from octal to binary
		ConvertOctalToBinary cob = new ConvertOctalToBinary(217);
		printMessage(cob.getResultInBinary());
		
		// converts from octal to decimal
		ConvertOctalToDecimal cod = new ConvertOctalToDecimal(217);
		printMessage(cod.getResultInBinary());
		
		// converts from octal to hexadecimal
		ConvertOctalToHexadecimal coh = new ConvertOctalToHexadecimal(154);
		printMessage(coh.getResultInHexadecimal());
	}
	
	public void printMessage(String result) {
		System.out.println(result);
	}

}
