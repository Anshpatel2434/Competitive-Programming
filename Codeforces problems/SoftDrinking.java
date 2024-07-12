import java.util.*;
public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int totalLiters = k*l;
        int totalSlices = c*d;
        int toastsByLiters = totalLiters/nl;
        int toastbBySlices = totalSlices;
        int toastbBySalts = p/np;
        int min = Math.min(toastsByLiters,(Math.min(toastbBySlices, toastbBySalts)));
        System.out.println(min/n);
        sc.close();
    }
}
