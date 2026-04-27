package average;
import java.util.*;
public class StringPositionCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String str="abc";
            int num=0;
            for(int i=0;i<str.length();i++){
               num+= str.charAt(i)-'a'+1;
            }
            System.out.println(num);

	}
}