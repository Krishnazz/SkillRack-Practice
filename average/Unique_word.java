package others;
import java.io.*;
import java.util.*;
public class Unique_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] word=str.split("\\s+");
		int sum=0;
		for(int i=0;i<word.length-1;i++) {
			int flag=0;
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equals(word[j])){
					flag=1;
					word[j]="";
					
					break;
				}
			}
			if(flag==0)
				sum+=1;
		}
		System.out.print(sum);

	}

}
