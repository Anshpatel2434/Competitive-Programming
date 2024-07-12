import java.io.PrintWriter;
import java.util.Scanner;

public class CostOfTravelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int curx = 0, cury = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            out.println((Math.abs(x-curx)*a)+(Math.abs(y-cury)*b));
            curx = x;
            cury = y;
        }
        out.flush();
        sc.close();
    }
}
