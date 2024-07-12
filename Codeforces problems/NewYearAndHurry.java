import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int minsToSolve = 0;
        int noOfSolved = 0;
        boolean allSolved = true;
        for (int i = 1; i <= n; i++) {
            minsToSolve += (i*5);
            if(240 - minsToSolve < k){
                noOfSolved = i-1;
                allSolved = false;
                break;
            }
        }
        if(allSolved){
            System.out.println(n);
        }
        else{
            System.out.println(noOfSolved);
        }
        sc.close();
    }
}
