package Dailytest;
import java.io.*;
import java.util.*;
public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int decimal=s.nextInt();
		String binary=Integer.toBinaryString(decimal);
		System.out.println(binary);
		
		// Binary to decimal
		
		int d=Integer.parseInt(binary,2);
		System.out.print(d);
	}

}
