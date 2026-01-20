package easy;
import java.util.*;
import java.io.*;
public class Commonchar {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		char a[]=str1.toCharArray();
		char b[]=str2.toCharArray();
		int count=0;
		//char c[]=new char[(a.length+b.length)/2];
		
		a=isduplicate(a);
		b=isduplicate(b);
		//System.out.print(a);
		//System.out.print(b);
		if(a.length>=b.length)
		{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==' ')
				   continue;
				{
				if(a[i]==b[j])
				 {
			       count++;
				  }
				}
			}
		 }
		System.out.print(count);
		}
		else
		{
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					if(b[i]==' ')
					   continue;
					{
					if(b[i]==a[j])
					 {
						//System.out.print(b[i]);
				       count++;
					  }
					}
				}
			}
			System.out.print(count);
		}
		
	}
	public static char[] isduplicate(char[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=' ';
				}
			}
		}
		return a;
	}
}
