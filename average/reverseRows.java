package average;
import java.util.*;
public class reverseRows {

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
		for(int i=r-1;i>=0;i--) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
