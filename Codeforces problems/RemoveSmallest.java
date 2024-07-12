import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < a.length; j++) {
                a[j] = sc.nextInt();
            }
            checkLengthAfterRemoving(a, n);
        }
        sc.close();
    }

    private static void checkLengthAfterRemoving(int[] a, int n) {
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[j]-a[i] <= 1){
                    count ++;
                    break;
                } 
            }
        }
        if(count == a.length-1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
