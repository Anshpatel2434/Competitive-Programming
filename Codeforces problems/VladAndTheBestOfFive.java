import java.util.Scanner;

public class VladAndTheBestOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            int countA = 0, countB = 0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == 'A') countA++;
                else countB++;
            }
            System.out.println((countA>countB)? 'A':'B');
        }
        sc.close();
    }
}
