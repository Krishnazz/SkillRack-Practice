package dailyChellange;
import java.io.*;
import java.util.*;
public class Perfect_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=Math.sqrt(n);i++) {
			System.out.println((int)Math.pow(i,2));
		}

	}

}
