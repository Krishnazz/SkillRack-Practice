package dailyChellange;
import java.io.*;
import java.util.*;
public class Second_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int len=String.valueOf(n).length();
		int[] a=new int[len];
		int i=0;
		while(n!=0) {
			a[i]=n%10;
			n=n/10;
			i++;
		}
		Arrays.sort(a);
		if(a.length<=2)
			System.out.print(-1);
		else
			System.out.print(a[a.length-2]);
	}

}
