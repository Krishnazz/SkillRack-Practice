package average;
import java.io.*;
import java.util.*;
public class Fourboxing {

	public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int[] freq=new int[26];
		for(int i=0;i<freq.length;i++)
		{
			freq[str.charAt(i)-'a']++;
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]==0)
			{
				System.out.print(str.charAt(i)+" ");
			}
		}
		s.close();		
	}

}
