package dailyChellange;
import java.io.*;
import java.util.Scanner;

public class Integer_plus_pattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for (int i = 1; i <= n * 2 - 1; i++) {
            int count = n;
            for (int j = 1; j <= n * 2 - 1; j++) {
                System.out.print(count + " ");
                if (j < i)
                    count--;
                if (j >= (n * 2 - 1) - i)
                    count++;
            }
            System.out.println();
        }
    }
}
