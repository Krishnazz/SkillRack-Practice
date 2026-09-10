import java.io.*;
import java.util.*;
public class diagonal_inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=1;
		int start=0,end=n-1;
		for(int i=0;i<n;i++)
		{  // count+=1;
			for(int j=0;j<n;j++)
			{   
			    if(j==start||j==end) {
			    	System.out.print(count+" ");
			    	count+=1;
			    }
					
				else
					System.out.print("* ");
			  	
			}
			 
			start++;
			end--;
			System.out.println();
		}

	}

}
