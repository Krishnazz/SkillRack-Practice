package Dailytest;
import java.io.*;
import java.util.*;
public class doubles_repeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<>();
		while(s.hasNextInt()) {
			int i=s.nextInt();
			al.add(i);
		}
		int k=2;
		for(int i=1;i<al.size();i++) {
			
			if(al.get(i-1)==al.get(i)) {
				al.set(i-1,al.get(i)*k);
				k=k*2;
				
			}
			else if(al.get(i-1)!=al.get(i)) {
				k=2;
			}
		}
		int sum=0;
		
		for(int i=0;i<al.size();i++)
			sum+=al.get(i);
		System.out.print(sum);
	}

}
