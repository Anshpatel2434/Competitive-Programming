import java.io.PrintWriter;
import java.util.Scanner;

public class VerifyPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        loop:
        while(t-->0)
        {
            solve(out, sc);
        }

    }

    private static void solve(PrintWriter out, Scanner sc) {
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char prev = s.charAt(0);
        for (int i = 1; i < n; i++) {
            if(Character.isDigit(s.charAt(i)) && Character.isLetter(prev)){
                System.out.println("NO");
                return;
            }
            if(s.charAt(i) < prev){
                System.out.println("NO");
                return;
            }
            prev = s.charAt(i);
        }
        System.out.println("YES");
    }
}
