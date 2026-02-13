package average;
import java.util.*;
public class Max_min {

	/*Add Max_min.java to implement logic for finding maximum and minimum values in an array*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		ArrayList<Integer> al=new ArrayList<>();
		int j=0;
		while(a.length!=1) {
			for(int i=2;i<n;i+=3) {
				al.add(Math.max(Math.max(a[i-2],a[i-1]),Math.max(a[i-1],a[i])));
			}
			
			for(int i=2;i<al.size();i+=3) {
				al.add(Math.min(Math.min(al.get(i-2),al.get(i-1)),Math.min(al.get(i-1),al.get(i))),j);
				j++;
			}
		}
		System.out.println(al);
		
		

	}

}
