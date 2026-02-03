package average;
import java.util.*;
public class NextPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),count=0;
		for(int i=1;i<=n;i++)
		{
		  if(n%i==0)
		  {
		     count++;
		    // break;
		  }
		}
	if(count==2)
		System.out.print(n);
	

}
}
