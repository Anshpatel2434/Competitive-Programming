import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int noOf100 = n/100;
        int noOf20 = 0;
        int noOf10 = 0;
        int noOf5 = 0;
        int noOf1 = 0;
        n = n - (noOf100*100);
        if(n != 0){
            noOf20 = n/20;
            n = n - (noOf20 * 20);
        }
        if(n != 0){
            noOf10 = n/10;
            n = n - (noOf10 * 10);
        }
        if(n != 0){
            noOf5 = n/5;
            n = n - (noOf5 * 5);
        }
        if(n != 0){
            noOf1 = n;
        }
        System.out.println(noOf100+noOf20+noOf10+noOf5+noOf1);
        sc.close();
    }
}
