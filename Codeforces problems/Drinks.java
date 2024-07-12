//You Just had to find the average of the all the drinks and you made such a complex code
import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a[] = new double[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<100){
                sum += a[i]/100;
            }
            else{
                sum += 1;
            }
        }
        System.out.println((sum/(double)n)*100);
        sc.close();
    }
}
