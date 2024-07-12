import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            if(n >= 1900) System.out.println("Division 1");
            else if(n >= 1600) System.out.println("Division 2");
            else if(n >= 1400) System.out.println("Division 3");
            else System.out.println("Division 4");
        }
    }
}
