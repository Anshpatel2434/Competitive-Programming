import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "";
        int ans[] = new int[n];
        for (int i = 1; i <= n; i++) {
            int in = sc.nextInt();
            ans[in-1]=i;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print((i==ans.length-1)? ans[i]: ans[i]+" ");
        }
        sc.close();
    }
}
