package dailyChellange;
import java.io.*;
import java.util.*;
public class StringwithCharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			String str1=s.nextLine();
		    String str2=s.nextLine();
		    char ch=s.next().charAt(0);
		    int count1=0,count2=0;
		    for(int i=0;i<str1.length();i++)
		    {
		    	if(str1.charAt(i)==ch)
		    		count1+=1;
		    }
		    for(int i=0;i<str2.length();i++)
		    {
		    	if(str2.charAt(i)==ch)
		    		count2+=1;
		    }
		    if(count1>=count2)
		    	System.out.print(str1);
		    else
		    	System.out.print(str2);
	}

}
