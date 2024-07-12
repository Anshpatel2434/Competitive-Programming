import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0, min = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int in = sc.nextInt();
            if(i == 0){
                max = in;
                min = in;
                continue;
            }
            if(in > max){
                count++;
                max = in;
            }
            else if(in < min){
                count++;
                min = in;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
