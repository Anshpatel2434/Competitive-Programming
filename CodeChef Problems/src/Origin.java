import java.util.Scanner;

public class Origin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            System.out.println(((n/9) * 45) + (sumTillNumber((n % 9))));
        }
    }
    static long sumTillNumber(long a) {
        return (a * (a + 1)) / 2;
    }
}
