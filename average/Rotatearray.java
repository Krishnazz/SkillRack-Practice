package average;
import java.util.*;
public class Rotatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char a[]=str.toCharArray();
		int n=s.nextInt();
		for(int i=a.length-n;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		for(int i=0;i<a.length-n;i++)
		{
			System.out.print(a[i]);
		}
		
		
	}

}
