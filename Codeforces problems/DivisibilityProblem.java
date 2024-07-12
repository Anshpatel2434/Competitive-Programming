import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int que[][] = new int[n][2];
        int ans[] = new int[n];
        for (int i = 0; i < que.length; i++) {
            que[i][0] = sc.nextInt();
            que[i][1] = sc.nextInt();
            if (que[i][0] % que[i][1] == 0) {
                ans[i] = 0;
            }
            else{
                ans[i] = que[i][1] - que[i][0] % que[i][1];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        sc.close();
    }
}
