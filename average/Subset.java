package Dailytest;
import java.util.*;
public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] a=str.split("\\s+");
		int count=0;
		for(int i=0;i<a[0].length()-Integer.parseInt(a[1])+1;i++)
		{
			
			
				    if(Integer.parseInt(str.substring(i,i+Integer.parseInt(a[1])))/100==0)
				         continue;
				   else {
					   if((Integer.parseInt(str.substring(i,i+Integer.parseInt(a[1]))))%Integer.parseInt(a[2])==0)
						   count+=1;
						   
						   
				   }
		}
		System.out.print(count);
		
		

	}

}
