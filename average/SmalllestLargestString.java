package average;
import java.util.*;
public class SmalllestLargestString {
    
    public static void main(String[] args) {
        String str= "u cant see me";
        String[] a=str.split("\\s+");
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        String smallest="",largest="";
        for(int i=0;i<a.length;i++){
            if(a[i].length()<min){
                min=a[i].length();
                smallest=a[i];
            }
            if(a[i].length()>max){
                max=a[i].length();
                largest=a[i];
            }
        }
        System.out.println(largest +" "+smallest);
    }
    
}
