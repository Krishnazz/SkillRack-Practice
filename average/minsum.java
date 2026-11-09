package Dailytest;
import java.io.*;
import java.util.*;
public class minsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    String str=s.nextLine();
	    String[] a=str.split("\\s+");
	    int[] k=new int[a.length];
	    int[] b=new int[2];
	    for(int i=0;i<a.length;i++)
	    {
	    	 k[i]=Integer.parseInt(a[i]);
	    }
	    int min=Integer.MAX_VALUE,sum=0;
	    for(int i=0;i<k.length;i++)
	    {
	    	for(int j=i+1;j<k.length;j++)
	    	{
	    		sum=k[i]+k[j];
	    		if(min>sum && sum>0)
	    		{
	    			min=sum;
	    			b[0]=k[i];
	    			b[1]=k[j];
	    		}
	    		
	    	}
	    }
	    if (min!= Integer.MAX_VALUE) {
            System.out.println(b[0] + " " + b[1]);
          } 
	    else {
            System.out.println(-1);
        }
	    

	}

}
