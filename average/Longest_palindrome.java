package Dailytest;
import java.io.*;
import java.util.*;
public class Longest_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String[] str=new String[n];
		s.nextLine();
		for(int i=0;i<n;i++) {
			str[i]=s.nextLine();
		}
		int max=0;
		for(int i=0;i<str.length;i++) {
		 StringBuilder b=new StringBuilder(str[i]);
		 if(str[i].equals(b.reverse().toString())) {   // <---need to convert string builder to string to perform equal operations
			 if(max<str[i].length())
				 max=str[i].length();
		 }
			 
		 
	}
		System.out.print(max);

}
}


///5%0D%0Aabcdefg%0D%0Aeye%0D%0Aengine%0D%0Amadam%0D%0Aenvironment
