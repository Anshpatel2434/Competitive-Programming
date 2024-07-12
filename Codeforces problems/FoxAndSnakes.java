import java.util.Scanner;

public class FoxAndSnakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char c[][] = new char[n][m];
        boolean writeLast = false;
        for (int i = 0; i < c.length; i++) {
            if(i % 2 != 0){
                writeLast = !writeLast;
            }
            for (int j = 0; j < c[i].length; j++) {
                if(i % 2 == 0){
                    System.out.print("#");
                }
                else{
                    if(writeLast && j == c[i].length - 1){
                        System.out.print("#");
                    }
                    else if (!writeLast && j == 0) {
                        System.out.print("#");
                    }
                    else{
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
