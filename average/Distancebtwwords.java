package average;
import java.util.*;
public class Distancebtwwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1=s.nextLine();
		String str2=s.nextLine();
		String[] a=str.split("\\s");
		int start=0;
        int end=0;
        int min=0;
		for(int i=0;i<a.length;i++) {
			
				if(a[i].equals(str1))
					start=i;
				if(a[i].equals(str2))
					end=i;
				if(end-start<=min)
					min=end-start;
		}
		System.out.print(min);
				
	}

}
