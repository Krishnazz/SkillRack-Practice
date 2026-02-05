package average;
import java.util.*;
public class Part4 {

	
	    public static void main(String[] args) {
			//Your Code Here.
			Scanner s=new Scanner(System.in);
			String str1=s.nextLine();
			String str2=s.nextLine();
			String str=" ";
			int len1=str1.length();
			int len2=str2.length();
			int minlength=Math.min(len1,len2);
			for(int i=1;i<=minlength;i++){
			    if(str1.substring(len1-i).equals(str2.substring(0,i))){
			      str=str1.substring(len1-i);
			    }
			}
			
			System.out.print(str);

}
}