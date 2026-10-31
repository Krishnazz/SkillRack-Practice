package Dailytest;
import java.io.*;
import java.util.*;
public class SecondfromFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str11=s.nextLine();
		String str22=s.nextLine();
		String str1=str11.toLowerCase();
		String str2=str22.toLowerCase();
		int count=0;
		char[] a=str1.toCharArray();
		for(int i=0;i<str2.length();i++) {
			for(int j=0;j<str1.length();j++) {
				if(str2.charAt(j)==a[i]) {
					a[i]=' ';
				    count+=1;
				    break;
				}
			}
		}
		if(count==str2.length())
			System.out.print("YES");
		else
			System.out.print("NO");

	}

}
