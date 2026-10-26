package dailyChellange;
import java.io.*;
import java.util.*;

public class Key_room {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int maxRooms = 0;

        // Try opening from each room
        for (int start = 0; start < n; start++) {
            int count = 0;
            int current = start;
            boolean[] visited = new boolean[n];

            while (!visited[current]) {
                visited[current] = true;
                count++;
                current = a[current];
                if (current == start) {
                    break;
                }
            }

            maxRooms = Math.max(maxRooms, count);
        }

        System.out.println(maxRooms);
    }
}
