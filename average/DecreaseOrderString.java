package average;
import java.util.*;
public class DecreaseOrderString {

	/* To sort and display characters in descending order */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] a=str.toCharArray();
//		for(int i=0;i<str.length();i++)
//			System.out.println(a[i]);
		Arrays.sort(a);
		//System.out.println(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
				a[i]='0';
		}
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]!='0')
			 System.out.print(a[i]);
		}

	}

}
