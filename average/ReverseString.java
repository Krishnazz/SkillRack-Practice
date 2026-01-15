package average;
import java.io.*;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] a=str.split("\\s+");
		for(int i=a.length-1;i>=0;i--)
		   System.out.print(a[i]+" ");

	}

}
