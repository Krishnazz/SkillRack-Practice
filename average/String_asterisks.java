package Dailytest;
import java.io.*;
import java.util.*;

// Given a string and an integer n, replace every nth character of the string with an asterisk (*) and print the modified string. Repeat this process n times, each time replacing the next nth character with an asterisk. If the length of the string is not a multiple of n, the last few characters will remain unchanged.
public class String_asterisks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		String str=s.nextLine();
		char[] a=str.toCharArray();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<str.length();j++) {
				if(j%n==i)
					a[j]='*';
				else {
	                a[j] = str.charAt(j);
	            }
			}
			System.out.println(Arrays.toString(a));
		}
		//System.out.println(Arrays.toString(a));
		n--;
	}
	

	
}


