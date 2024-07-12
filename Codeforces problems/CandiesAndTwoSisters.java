import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            double c = sc.nextDouble();
            if(c % 2 == 0){
                ans[i] = (int)(c/2) - 1;
            }
            else if (c % 2 != 0) {
                ans[i] = (int)Math.floor(c/2);
            }
        }
        for (int a:
             ans) {
            System.out.println(a);
        }
        sc.close();
    }
}
