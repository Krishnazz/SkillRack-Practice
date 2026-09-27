package Dailytest;
import java.io.*;
import java.util.*;
public class string_revmul3 {

	// Reverse a string and print characters at positions that are multiples of 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		for(int i=0;i<sb.length();i++)
		{
			if((i+1)%3==0)
			   System.out.print(sb.charAt(i));
		}
		                                                       /// passed******
	}

}
