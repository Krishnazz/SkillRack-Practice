package average;
import java.util.*;
import java.io.*;
public class Diagonaldiff {
    public static void main(String[]args)
    {
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	int a[][]=new int[n][n];
    	int sum1=0,sum2=0;
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			a[i][j]=s.nextInt();
    		}
    	}
    	for(int i=0;i<n;i++)
    	{
    				sum1+=a[i][i];
    				System.out.println(a[i][i]);
    	}
    	System.out.print(sum1);
    	for(int i=0;i<n;i++)
    	{
                	  System.out.println(a[i][n-1-i]);
    	}
    	System.out.print(sum2);
    }
}
