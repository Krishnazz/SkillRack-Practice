package average;
import java.io.*;
import java.util.*;
public class encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=s.nextInt();
		char[] a=str.toCharArray();
		char[][] b=new char[str.length()/n][n];
		int count=0;
		for(int i=0;i<str.length()/n;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<n;j++)
				{
					b[i][j]=a[count];
					count++;
				}
			}
			else {
				for(int j=n-1;j>=0;j--)
				{
					b[i][j]=a[count];
					count++;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<str.length()/n;j++)
			{
				System.out.println(b[j][i]);
			}
		}
		
	}

}
