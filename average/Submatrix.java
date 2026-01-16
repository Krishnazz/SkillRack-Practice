package average;
import java.io.*;
import java.util.*;
public class Submatrix {

			/* To calculate the sum of elements in a specified submatrix */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		int x1=s.nextInt();
		int y1=s.nextInt();
		int x2=s.nextInt();
		int y2=s.nextInt();
		int sum=0;
		for(int i=x1;i<=x2;i++)
		{
			for(int j=y1;j<=y2;j++)
			{
				sum+=a[i][j];
			}
			
		}
		System.out.print(sum);
	}

}
