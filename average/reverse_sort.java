package Dailytest;
import java.io.*;
import java.util.*;
public class reverse_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			b[i]=reverse(a[i]);
			
		}
//		HashMap<Integer,Integer> mp=new HashMap<>();
//		for(int i=0;i<n;i++) {
//			mp.put(a[i],b[i]);
//		}
		Arrays.sort(b);

		

	}
	public static int reverse(int n) {
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}

}
