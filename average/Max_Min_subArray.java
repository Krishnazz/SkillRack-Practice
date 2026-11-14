package Dailytest;
import java.io.*;
import java.util.*;
public class Max_Min_subArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int l=s.nextInt();
	    int max=Integer.MIN_VALUE;
	    int min=Integer.MAX_VALUE;
	    int[] maxsub=new int[l];
	    int[] minsub=new int[l];
	    
		for(int i=0;i<=n-l;i++) {
//			for(int j=i+1;j<n;j++) {
				 int[] subArray = Arrays.copyOfRange(a, i, i+l);
				 int sum=0;
				 for(int k=0;k<subArray.length;k++) {
					// System.out.print(subArray[k]+" ");
					 sum+=subArray[k];
					 
				 }
				// System.out.print(sum);
				 //System.out.println();
				 if(max<sum) {
					 max=sum;
					 maxsub=subArray.clone();
				 }
				 if(min>sum) {
					 min=sum;
					 minsub=subArray.clone();
				 }
				 
			}
		
		for(int i=0;i<maxsub.length;i++)
			System.out.print(maxsub[i]+" ");
		System.out.println();
		for(int i=0;i<minsub.length;i++)
			System.out.print(minsub[i]+" ");
		}

	}


