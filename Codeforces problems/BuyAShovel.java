import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int ans = findMinNum(p, r);
        System.out.println(ans);
        sc.close();
    }

    private static int findMinNum(int p, int r){
        for (int i = 1; i < 10; i++) {
            if ((i * p) % 10 == 0 || (i * p) % 10 == r) {
                return i;
            }
        }
        return 0;
//        if(p % 10 == r || p % 10 == 0){
//            return 1;
//        }
//        else if(p % r != 0 && p > r){
//            int mul = 1;
//            int ans = p;
//            while(ans % 10 != 0 && ans % 10 != r){
//                mul++;
//                ans = p * mul;
//            }
//            return mul;
//        }
//        else{
//            int mul = 1;
//            int ans = p;
//            while (ans % r != 0 || ans % 10 !=r) {
//                mul++;
//                ans = p * mul;
//            }
//            return mul;
        }
    }
