package average;
import java.util.*;

/*  To calculate the minimum sum of the smallest elements in an array */
public class Min_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int m=s.nextInt();
			int a[]=new int[n];
			int sum=0;
			for(int i=0;i<n;i++)
				a[i]=s.nextInt();
			Arrays.sort(a);
			for(int i=0;i<m;i++)
				sum+=a[i];
			System.out.print(sum);
			
	}

}                      

