import java.io.PrintWriter;
import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        while(t-->0)
        {
            solve(out,sc);
        }
    }

    private static void solve(PrintWriter out, Scanner sc) {
        int a = sc.nextInt();
        int s = a/2;
        if(a%4 == 0){
            System.out.println("YES");
            int[] a1 = new int[s];
            int[] a2 = new int[s];
            int evco = 2;
            int odco = 1;
            for (int i = 0; i < s; i++) {
                System.out.print(evco+" ");
                evco+=2;
            }
            for (int i = 0; i < s; i++) {
                System.out.print((i == s-1)? (odco+s)+" ": odco+" ");
                odco+=2;
            }
            System.out.println();
        }
        else {
            System.out.println("NO");
        }
    }
}
