package dailyChellange;
import java.util.*;
import java.io.*;
public class upperEven_lowerOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=1,count1=2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(count+" ");
				count+=2;
			}
			System.out.print(0);
			
			for(int j=n-1;j>i;j--)
			{
				System.out.print(" "+count1);
				count1+=2;
			}
			System.out.println();
		}
		
	}

}
