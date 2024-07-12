import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, min = 0;
        int maxPos = 0, minPos = 0;
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if(i == 0){
                min = a[i];
                minPos = i;
            }
            if(a[i] > max){
                max = a[i];
                maxPos = i;
            }
            if(a[i] <= min){
                min = a[i];
                minPos = i;
            }
        }
        int ans = ((a.length-1)-minPos) + maxPos;
        if(minPos < maxPos){
            ans--;
        }
        System.out.println(ans);
        sc.close();
    }
}
