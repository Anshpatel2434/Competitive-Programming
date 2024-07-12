import java.util.Scanner;

public class oneplustwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        boolean flag = true;
        for (int i = 1; i < 500; i++) {
            sum+=i;
            if(a == sum){
                System.out.println("YES");
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("NO");
        sc.close();
    }
}
