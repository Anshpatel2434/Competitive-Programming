import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] check = new int[2];
            int num1 = -1, num2 = -1;
            int getNum1Index = 0, getNum2Index = 0;
            for (int i = 0; i < a.length; i++) {
                if(i == 0){
                    num1 = a[i];
                    check[0] += 1;
                }
                if(a[i] == num1){
                    num1 = a[i];
                    getNum1Index = i;
                    check[0] += 1;
                }
                else{
                    num2 = a[i];
                    getNum2Index = i;
                    check[1] += 1;
                }
            }
            if(check[0] > check[1]){
                System.out.println(getNum2Index+1);
            }
            else {
                System.out.println(getNum1Index+1);
            }
        }
        sc.close();
    }
}
