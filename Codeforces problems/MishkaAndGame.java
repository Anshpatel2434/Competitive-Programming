import java.util.Scanner;

public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cm = 0, cc = 0;
        for (int i = 0; i < a; i++) {
            int m = sc.nextInt();
            int c = sc.nextInt();
            if(m > c){
                cm++;
            } else if (c > m) {
                cc++;
            }
        }
        if(cm > cc){
            System.out.println("Mishka");
        } else if (cm < cc) {
            System.out.println("Chris");
        }
        else{
            System.out.println("Friendship is magic!^^");
        }
    }
}
