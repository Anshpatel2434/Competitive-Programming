import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String ans = "";
        for (int i = 1; i <= n; i++) {
            if(i%2 != 0){
                if(i == n){
                    ans += "I hate it ";
                }
                else{
                    ans += "I hate that ";
                }
            }
            else{
                if(i == n){
                    ans += "I love it ";
                }
                else{
                    ans += "I love that ";
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
