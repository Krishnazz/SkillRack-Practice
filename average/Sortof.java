package others;
import java.io.*;
import java.util.*;
public class Sortof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length-1;i++)
		{
			 if(a[i]>a[i+1])
			 {
				 int kalis=rev(a[i]);
				 if(kalis<a[i+1])
				 {
					 System.out.print(a[i]);
				 }
				 else
					 System.out.print(a[i+1]);
			 }
		}

	}
	public static int rev(int a)
	{
		int rev=0,c=a;
	 while(a!=0)
	 {
		
		int rem=a%10;
		rev=rev*10+rem;
		a=a/10;
	 }
	
	 return rev;
	}

}
