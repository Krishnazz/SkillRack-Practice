package Dailytest;
import java.io.*;
import java.util.*;
public class Decimal_to_octal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int decimal=s.nextInt();
		String octal=Integer.toOctalString(decimal);
		System.out.println(Integer.parseInt(octal));
		
		// Octal to Decimal
		int d=Integer.parseInt(octal,8);
		System.out.print(d);
	}

}
