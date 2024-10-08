import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i] > max) max = a[i];
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (max - a[i]);
        }
        System.out.println(sum);
        sc.close();
    }
}
