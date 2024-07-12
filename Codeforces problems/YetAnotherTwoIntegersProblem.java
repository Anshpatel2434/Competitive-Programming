import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int max = Math.max(a,b);
            int min = Math.min(a,b);
            int ans = (max - min + 9) / 10;
            System.out.println(ans);
        }
        sc.close();
    }
}
