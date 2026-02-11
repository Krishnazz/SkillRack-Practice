package average;
import java.util.Scanner;

public class LCM_3Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		int result=lcm(lcm(a,b),c);
		System.out.println(result);
	}
	public static int lcm(int a,int b) {
		return a*b/gcd(a,b);
	}
	public static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		int t=0;
		while(b!=0) {
			t=b;
			b=a%b;
			a=t;
		}
		return a;
	}

}
