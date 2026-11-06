package Dailytest;
import java.io.*;
import java.util.*;

public class Bases {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int max = Integer.MIN_VALUE;
        
        // Find the highest face value in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int face = 0;
            if (Character.isDigit(ch)) {
                face = ch - '0';
            } else {
                face = ch - 'A' + 10;
            }
            if (max < face) {
                max = face;
            }
        }
        
        // Calculate the decimal equivalent
        int d = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int f = 0;
            if (Character.isDigit(ch)) {
                f = ch - '0';
            } else {
                f = ch - 'A' + 10;
            }
            d = d * (max + 1) + f;
        }
        
        System.out.print(d);
    }
}
