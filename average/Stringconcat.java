package average;
import java.util.*;
public class Stringconcat {
     public static void main(String args[])
     {
    	 Scanner s=new Scanner(System.in);
    	  String str1=s.nextLine();
    	  String str2=s.nextLine();
    	  char[] a=str1.toCharArray();
    	  char[] b=str2.toCharArray();
    	  if(a[0]<b[0])
    		  //System.out.print(str1+str2);
    		  System.out.println(str1.concat(str2));
    	  else
    		  System.out.print(str2+str1); 
     }
}
