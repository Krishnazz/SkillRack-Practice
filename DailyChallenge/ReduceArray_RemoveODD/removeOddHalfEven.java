package ReduceArray_RemoveODD;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;


public class removeOddHalfEven {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            k = s.nextInt();
            if (k % 2 == 0) {
                al.add(k);
            }
        }

        while (al.size() > 0) {

            for (int i = al.size() - 1; i >= 0; i--) {
                if (al.get(i) % 2 == 0) {
                    al.set(i, al.get(i) / 2);
                } else {
                    al.remove(i);
                }

            }
            String r = al.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" "));

            System.out.print(r);
            System.out.println();
        }

    }

}
