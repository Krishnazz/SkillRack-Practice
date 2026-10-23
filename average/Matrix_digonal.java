package dailyChellange;
import java.io.*;
import java.util.*;
public class Matrix_digonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
			}
		}
		int x=s.nextInt();
		int y=s.nextInt();
		int i=0;
		for(int k=0;k<r+c-1;k++) {
			for(int j=0;j<=k;j++) {
				 i=k-j;
				 if(i<r&&j<c)
					 System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
