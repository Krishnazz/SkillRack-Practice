import java.io.*;
import java.util.*;
public class String_n_times {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine().toLowerCase();
		String str2=s.nextLine().toLowerCase();
		int k=s.nextInt();
		HashMap<Character,Integer> hs=new HashMap<>();
		int[] freq=new int[26];
		for(int i=0;i<str1.length();i++) {
			freq[str1.charAt(i)-'a']++;
		}

		for(int i=0;i<str1.length();i++) {
			hs.put(str1.charAt(i),freq[str1.charAt(i)-'a']*2);
		}
		
		HashMap<Character,Integer>freq2=new HashMap<>();
		for(int i=0;i<str2.length();i++) {
			char c=str2.charAt(i);
			freq2.put(c, freq2.getOrDefault(c,0)+1);
		}
		 boolean canForm = true;
	        for (Map.Entry<Character, Integer> entry : hs.entrySet()) {
	            char c = entry.getKey();
	            int requiredCount = entry.getValue();
	            int availableCount = freq2.getOrDefault(c, 0);
	            if (availableCount < requiredCount) {
	                canForm = false;
	                break;
	            }
	        }

	        // Print the result
	        if (canForm) {
	            System.out.println("YES");
	        } else {
	            System.out.println("NO");
	        }

	}

}
