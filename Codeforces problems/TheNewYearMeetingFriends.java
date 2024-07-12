import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n[] = new Integer[3];
        for (int i = 0; i < 3; i++) {
            n[i] = sc.nextInt();
        }
        Arrays.sort(n, Collections.reverseOrder());
        System.out.println((n[0]-n[1])+(n[1]-n[2]));
        sc.close();
    }
}
