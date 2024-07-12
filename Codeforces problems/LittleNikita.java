import java.util.Scanner;

public class LittleNikita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n % 2 == 0 && m % 2 == 0){
                System.out.println((m <= n)? "YES":"NO");
            }
            else if (n % 2 != 0 && m % 2 != 0){
                System.out.println((m <= n)? "YES":"NO");
            }
            else System.out.println("NO");
        }
    }
}
