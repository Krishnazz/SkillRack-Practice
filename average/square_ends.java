package dailyChellange;
import java.io.*;
import java.util.*;
public class square_ends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=String.valueOf(n);
		ArrayList<Integer> al=new ArrayList<>();
		int f=str.charAt(0)-'0';
		int l=str.charAt(str.length()-1)-'0';
		String res="";
		res+=(f*f);
		for(int i=1;i<str.length()-1;i++)
			res+=(str.charAt(i)-'0');
		res+=(l*l);
		
		System.out.print(Integer.parseInt(res));
	}

}
