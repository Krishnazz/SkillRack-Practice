package dailyChellange;
import java.io.*;
import java.util.*;
public class N_rectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] l=new int[n];
		int[] b=new int[n];
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			l[i]=s.nextInt();
			b[i]=s.nextInt();
			a[i]=l[i]*b[i];	
		}
		Arrays.sort(a);
		for(int i=1;i<a.length;i++) {
			if(a[i-1]==a[i]) {
				if(l[i-1]>l[i])
					System.out.println(l[i-1]+" "+b[i-1]+" "+a[i]);
			}
			else
				System.out.println(l[i]+" "+b[i]+" "+a[i]);
		}
	}

}
