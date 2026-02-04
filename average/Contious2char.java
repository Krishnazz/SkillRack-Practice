package average;
import java.util.*;

public class Contious2char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s=new Scanner(System.in);
		  String str=s.nextLine();
		  char a=s.next().charAt(0); 
		  char b=s.next().charAt(0);
		  int count=0; 
		  char c[]=str.toCharArray();
		  for(int i=0;i<str.length()-1;i++)
		  { 
			  if(c[i]==a&&c[i+1]==b)
			  { 
				  count++; 
				  } 
			  } 
		  System.out.println(count); 
		  System.out.print(str.length());
		  } 

	}

