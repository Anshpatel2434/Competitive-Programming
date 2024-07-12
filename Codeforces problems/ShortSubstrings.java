import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ShortSubstrings {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) throws IOException {
        int t=sc.nextInt();
        sc.nextLine();
        PrintWriter out = new PrintWriter(System.out);
        loop:
        while(t-->0)
        {
            solve(out);
        }

    }

    private static void solve(PrintWriter out) {
        String s = sc.nextLine();
        int size = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            size++;
            if(size == 3){
                size = 1;
                continue;
            }
            else{
                ans += "" + s.charAt(i);
            }
        }
        out.println(ans);
        out.flush();
    }
}
