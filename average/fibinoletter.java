package Dailytest;
import java.util.*;
import java.io.*;
public class fibinoletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int[] a=new int[26];
		int[] b=new int[a.length];
		for(int i=0;i<str.length();i++) {
			a[str.charAt(i)-'a']++;
		}
		Arrays.sort(a);
		int x=0,y=1;
		b[0]=1;
		for(int i=1;i<b.length;i++)
		{
			 b[i]=x+y;
			x=y;
			y=b[i];
			
		}
		//aSystem.out.print(Arrays.toString(b));
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
				count=1;
		}
		if(count==1)
			System.out.print(true);
		else
			System.out.print(false);
		
		

	}

}
