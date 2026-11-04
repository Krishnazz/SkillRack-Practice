package dailyChellange;
import java.io.*;
import java.util.*;

public class UpperCase_Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		StringBuilder sb=new StringBuilder();
		sb.append(str1);
		sb.append(str2);
		System.out.print(sb);
		int[] a=new int[26];
		for(int i=0;i<sb.length();i++) {
			if(Character.isLowerCase(sb.charAt(i)))
				continue;
			else
				a[sb.charAt(i)-'A']++;	
		}
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=1) {
				count=-1;
				break;
			}
				
		}
		if(count==-1)
			System.out.print("no");
		else
			System.out.print("Yes");
	}

}
