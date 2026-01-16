package average;
import java.util.*;
public class Oddlendigonal {

	/* To print the odd length diagonal elements of a string */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] a=str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-i-1)
			{
				System.out.print(a[i]);
				break;
			}
			System.out.print(a[i]);
			for(int j=i;j<a.length-i-2;j++)
			{
				System.out.print(" ");
			}
			System.out.print(a[a.length-i-1]);
			System.out.println();
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
				
			}
			
		}
		System.out.println();
		int mid=a.length/2;
		int f=1;
		
		while(f<=mid)
		{
			int u=mid-f;
			while(u>0)
			{
				System.out.print(" ");
				u--;
			}
			
			System.out.print(a[mid-f]);
			for(int i=mid-f;i<mid+f-1;i++)
			{
				System.out.print(" ");
			}
			System.out.print(a[mid+f]);
			
			
			System.out.println();
			f++;
			
		}
//		int mid=a.length/2;
//		System.out.println();
//		for(int r=0;r<a.length;r++)
//		{
//			for(int s1=mid-r-1;s1<mid+r+1;s1++)
//			  {
//				  System.out.print(" ");
//			  }
//			
//		  System.out.print(a[mid-r-1]);
//		  
//		
//		  for(int k=mid-r-1;k<mid+r+1;k++)
//			{
//				System.out.print(" ");
//				
//			}
//		  System.out.println(a[mid+r+1]);
//		  System.out.println();
//		 
		
    	}
	}



