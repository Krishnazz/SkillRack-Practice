package dailyChellange;
import java.io.*;
import java.util.*;
public class Max_abs_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int max=0;
		for(int i=1;i<n;i++)
		{
			if(Math.abs(a[i]-a[i-1])>max)
				max=Math.abs(a[i]-a[i-1]);
		}															//
		System.out.print(max);
	}

}
