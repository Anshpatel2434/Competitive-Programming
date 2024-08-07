import java.util.Scanner;

public class YogurtSale1955 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = n * a;
            if(b < a * 2){
                ans = (n % 2 == 0)? (n/2) * b: ((n / 2) * b) + a;
            }
            System.out.println(ans);
        }
    }
}
