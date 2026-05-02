package average;
import java.util.*;
public class ipv4AddressValidity {

    /*
         "127.0.0.1"  - Valid
          "266.2.9.34.12"  - Invalid
    */
	public static void main(String[] args) {
     //   Scanner s=new Scanner(System.in);
        String str="127.0.0.1";
        String[] a=str.split("\\.");
        int flag=0;
        for(int i=0;i<a.length;i++){
           int num= Integer.parseInt(a[i]);
           if(num>=0&&num<=255){
             flag+=1;
           }
        }
        if(flag==a.length){
            System.out.println("valid");
        }
        else{
            System.out.println("not valid");
        }
    }
}
