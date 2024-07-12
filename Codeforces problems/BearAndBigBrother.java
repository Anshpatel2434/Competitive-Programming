import java.util.*;
public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count=0;
        while(n1<=n2){
            n1*=3;
            n2*=2;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
