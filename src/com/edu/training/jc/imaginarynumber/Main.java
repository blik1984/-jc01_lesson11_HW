package com.edu.training.jc.imaginarynumber;

//import com.edu.training.jc.fraction.Fraction;

public class Main {

	public static void main(String[] args) {
		
		ImaginaryNumber f1 = new ImaginaryNumber();
		ImaginaryNumber f2 = new ImaginaryNumber();
		
		f1.imaginaryPart = 3;
		f1.realPart = 11;
		f2.imaginaryPart = 99;
		f2.realPart = -8;
		printlnImaginaryNumber(f1);
		printlnImaginaryNumber(f2);
		ImaginaryNumber f3 = sum(f1,f2);
		printlnImaginaryNumber(f3);


	}
	static ImaginaryNumber sum(ImaginaryNumber x, ImaginaryNumber y) {
		ImaginaryNumber z = new ImaginaryNumber();
		z.imaginaryPart = x.imaginaryPart + y.imaginaryPart;
		z.realPart = x.realPart + y.realPart;
		return z;
	}
	static void printlnImaginaryNumber (ImaginaryNumber x) {
		String flag = new String();
		if(x.imaginaryPart>0) {
			flag = "+";
		}else if(x.imaginaryPart<0) {
			flag = "-";
		}
		System.out.println(x.realPart + flag + x.imaginaryPart + "i");
	}

}
