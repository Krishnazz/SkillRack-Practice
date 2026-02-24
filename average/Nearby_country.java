package Dailytest;
import java.io.*;
import java.util.*;
public class Nearby_country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
			str[i]=s.next();
		int count=0;
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<str.length;i++)
			al.add(str[i]);
		int k=10;
		while(k!=0) {
	     	for(int i=0;i<str.length-1;i++) {
		    	if(str[i].equals(str[i+1])) {
				al.remove(str[i]);
				al.remove(str[i+1]);
			 }
		}
		k--;
		}
			System.out.print(al.size());
	}

}
//5%0D%0AIndia Australia India India Australia