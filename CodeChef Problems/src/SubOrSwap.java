import java.util.Scanner;

public class SubOrSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x > y){
                int temp = x;
                x = y;
                y = temp;
            }
            if(y % x == 0){
                System.out.println(x);
            }
            else{
                if(y % 2 != 0 && x % 2 == 0){
                    System.out.println(1);
                }
                else{
                    int ans = y % x;
                    System.out.println(ans);
                }
            }
        }
        sc.close();
    }
}
