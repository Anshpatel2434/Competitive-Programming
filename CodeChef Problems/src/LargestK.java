import java.util.Scanner;

public class LargestK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int numberOf1Need = x-1;
            if(y < numberOf1Need) System.out.println(0);
            else if (y == numberOf1Need) {
                System.out.println(1);
            }
            else{
                int ans = y - (numberOf1Need - 1);
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
