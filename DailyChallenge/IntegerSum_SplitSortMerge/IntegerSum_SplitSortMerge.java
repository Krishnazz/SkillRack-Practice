package IntegerSum_SplitSortMerge;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntegerSum_SplitSortMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		int sum1=0,sum2=0;

		List<Integer> al = Arrays.stream(s1.split("[\\s|]+"))
		                         .map(Integer::parseInt)
		                         .sorted().toList();
		List<String> ab = Arrays.stream(s1.split("[\\s|]+"))
		                         .toList();
		        for(int i=0;i<ab.size();i+=2){
		          sum1+=Integer.parseInt(ab.get(i)+""+ab.get(i+1));
		          sum2+=Integer.parseInt(String.valueOf(al.get(i))+String.valueOf(al.get(i+1)));
		          
		        }
		        System.out.println(sum1);
		       System.out.println(sum2);
		System.out.println("*****"); 

	}

}
