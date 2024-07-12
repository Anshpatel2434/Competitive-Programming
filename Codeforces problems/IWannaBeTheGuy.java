import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean vis[] = new boolean[n];
        int count = 0;
        for (int i = 0; i < 2; i++) {
            int n1 = sc.nextInt();
            for (int j = 0; j < n1; j++) {
                int temp = sc.nextInt();
                if(vis[temp-1] == false){
                    vis[temp-1] = true;
                    count++;
                }
            }
        }
        if(count == n){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
        sc.close();
    }
}
