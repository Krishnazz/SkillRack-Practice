package average;
import java.util.*;
public class Consonant_ {

	/*Add Consonant_.java to implement logic for counting the number of consonants in each word of a given string and store the counts in an array*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] str1=str.split("//s+");
		int count=0;
		int[] n=new int[str1.length];
		for(int i=0;i<str1.length;i++) {
			count=0;
			char[] a=str1[i].toCharArray();
			for(int j=0;j<a.length;j++) {
				if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
					continue;
				else
					count+=1;
			}
			n[i]=count;
		}
		System.out.print(Arrays.toString(n));

	}

}
