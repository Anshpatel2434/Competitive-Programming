import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if(n%2==0){
            System.out.println(Math.round(n/2));
        }
        else{
            System.out.println(Math.round((-1)*((n+1)/2)));
        }
        sc.close();
    }
}