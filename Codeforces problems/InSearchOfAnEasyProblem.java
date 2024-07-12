import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int in = sc.nextInt();
            if(in!=0) count++;
        }
        System.out.println((count==0)? "EASY":"HARD");
        sc.close();
    }
}
