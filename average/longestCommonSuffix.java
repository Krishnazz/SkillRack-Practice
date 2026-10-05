package easy;
import java.io.*;
import java.util.*;
public class  longestCommonSuffix {

	// Given two strings, find the longest common suffix of the first string and prefix of the second string. If there is no common suffix and prefix, return an empty string.
	
	    public static void main(String[] args) {
			//Your Code Here.
			Scanner s=new Scanner(System.in);
			String str1=s.nextLine();
			String str2=s.nextLine();
			String str=" ";
			int len1=str1.length();
			int len2=str2.length();
			int minlength=Math.min(len1,len2);
			for(int i=1;i<=minlength;i++){
			    if(str1.substring(len1-i).equals(str2.substring(0,i))){
			      str=str1.substring(len1-i);
			    }
			}
			
			System.out.print(str);

}
}