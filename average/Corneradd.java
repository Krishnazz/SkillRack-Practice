package easy;
import java.io.*;
import java.util.*;
public class Corneradd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	    int a[][]=new int[n][n];
	    int sum=0;
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=0;j<a.length;j++)
	    	{
	    		a[i][j]=s.nextInt();
	    	}
	    }
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=0;j<a.length;j++)
	    	{
	    		if((i==0&&j==0)||(i==0&&j==a.length-1)||(i==a.length-1&&j==0)||(i==a.length-1&&j==a.length-1))
	    		{
	    			sum=sum+a[i][j];
	    		}
	    	}
	    }
	    System.out.println(sum);
	    
	}

}
