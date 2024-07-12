import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int curr = sc.nextInt();
            if(curr!=prev){
                prev = curr;
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
