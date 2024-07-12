import java.io.PrintWriter;
import java.util.Scanner;

public class DislikeOfThrees {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-->0)
        {
            solve(out);
        }
    }

    private static void solve(PrintWriter out) {
        int n = sc.nextInt();
        int count = 1, i=1;
        while(true) {
            if((i % 3 == 0) || (i % 10 == 3)) {
                i++;
            } else {
                if(count == n) {
                    System.out.println(i);
                    break;
                }
                i++;
                count++;
            }
        }
        out.flush();
    }
}
