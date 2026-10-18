package dailyChellange;
import java.util.*;
public class splitEvenLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] stringArray=str.split("\\s+");
		for(String i:stringArray) {
			if(i.length()%2==0&&i.length()!=2) {
				String[] a=splitfunction(i);
				System.out.print(a[0]+" "+a[1]+" ");
			}
			else {
				System.out.print(i+" ");
			}
		}

	}

	public static String[] splitfunction(String i) {
		// TODO Auto-generated method stub
		String[] a=new String[2];
		a[0]="";
		a[1]="";
		for(int k=0;k<i.length();k++) {
			if(k>=0&&k<i.length()/2) {
				a[0]+=i.charAt(k);
				//System.out.print(a[0]+" ");
			}
				
			else {
				
				a[1]+=i.charAt(k);
				//System.out.print(a[1]+" ");
			}
				
		}
		//System.out.println(a[0]+" "+a[1]);
		return a;
	}

}
