import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int count = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b > a){
                count++;
            }
            int c = sc.nextInt();
            if(c > a){
                count++;
            }
            int d = sc.nextInt();
            if(d > a){
                count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
