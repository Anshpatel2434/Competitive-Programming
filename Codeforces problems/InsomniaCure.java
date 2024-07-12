import java.util.Scanner;

public class InsomniaCure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int remainders = 0, min = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        boolean vis[] = new boolean[a[4]];
        int count = 0;
        for (int i = 0; i < a[4]; i++) {
            if((i+1) % a[0] == 0 && !vis[i]){
                count++;
                vis[i] = true;
            }
            if((i+1) % a[1] == 0 && !vis[i]){
                count++;
                vis[i] = true;
            }
            if((i+1) % a[2] == 0 && !vis[i]){
                count++;
                vis[i] = true;
            }
            if((i+1) % a[3] == 0 && !vis[i]){
                count++;
                vis[i] = true;
            }

        }
        System.out.println(count);
        sc.close();
    }
}
