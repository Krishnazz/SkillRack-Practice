package average;
import java.io.*;
import java.util.*;
public class Differential_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0,sum=2,o=3,count=0;
		System.out.print(sum+" ");
		while(i<=1000) {
			if(n==1)
		    	 break;
		     if(o%2!=0) {
		    	 sum=sum+o;
		    	 System.out.print(sum+" ");
		    	 count++;
		    	}
		     o++;
	    	 
		     i++;
		     
		     if(count==n-1)
		    	 break;
		}

	}

}
