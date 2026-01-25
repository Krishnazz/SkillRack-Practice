package average;
import java.util.*;

public class FirstletterUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char a[]=str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			a[0]=Character.toUpperCase(a[0]);
			if(a[i]==' ')
			{
				a[i+1]=Character.toUpperCase(a[i+1]);
			}
		}
		System.out.print(a);
		
     }       
	}


