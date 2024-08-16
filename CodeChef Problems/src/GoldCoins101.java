import java.util.Scanner;

public class GoldCoins101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x > y) System.out.println(a);
        else System.out.println(b);
    }
}
