package average;
import java.util.*;

public class shiftOperator {

	
	    public static void main(String[] args) {

            String str1="7*2";
            String str2="1";
            int output=0;
            if(str2=="1"){
                int num1=Integer.parseInt(String.valueOf(str1.charAt(0)));
                    int num2=Integer.parseInt(String.valueOf(str1.charAt(2)));
               switch(str1.charAt(1)){
                   
                case '+':
                    output=num1-num2;
                    break;
                case '-':
                    output=num1+num2;   
                    break;
                case '*':
                    output=num1/num2;   
                    break;
                case '/':
                    output=num1*num2;
                    break;
                
               }
            }
            else{
                 int num1=Integer.parseInt(String.valueOf(str1.charAt(0)));
                    int num2=Integer.parseInt(String.valueOf(str1.charAt(2)));
                 switch(str1.charAt(1)){
                case '+':
                    output=num1+num2;
                    break;
                case '-':
                    output=num1-num2;   
                    break;
                case '*':
                    output=num1*num2;   
                    break;
                case '/':
                    output=num1/num2;
                    break;
                
               }
            }
            System.out.println(output);
        }
    }