import java.util.Scanner;

public class AplusBAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            System.out.println((a % 10) + (a / 10));
        }
    }
}
