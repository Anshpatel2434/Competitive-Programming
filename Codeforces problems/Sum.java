import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int max = 0;
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > b){
                int c = sc.nextInt();
                if(a > c){
                    checkSumFromThree(a, b, c);
                }
                else{
                    checkSumFromThree(c, a ,b);
                }
            }
            else{
                int c = sc.nextInt();
                if(b > c){
                    checkSumFromThree(b, a, c);
                }
                else{
                    checkSumFromThree(c, a, b);
                }
            }
        }
        sc.close();
    }

    private static void checkSumFromThree(int max, int a, int b) {
        System.out.println((a+b == max)? "YES": "NO");
    }
}
