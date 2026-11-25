package Dailytest;
import java.util.*;

public class First_and_Third {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int originalN = s.nextInt();
        int n = originalN;
        ArrayList<Integer> al = new ArrayList<>();
        int rem = 0;
        while (n != 0) {
            rem = n % 10;
            al.add(rem);
            n /= 10;
        }
        int sum = al.get(al.size() - 1) + al.get(al.size() - 3);
        
        String str = Integer.toString(originalN);
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <i+3&&j<=str.length(); j++) {
                if(Integer.parseInt(str.substring(i,j))==sum)
                	count=1;
            }
        }
        if(count==1)
        	System.out.print("Yes");
        else
        	System.out.print("No");
    }
}
