import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double q[] = new double[4];
        double max = 0;
        for (int i = 0; i < 4; i++) {
            q[i] = sc.nextDouble();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 4; j++) {
                if(q[i] > q[j]){
                    double temp = q[i];
                    q[i] = q[j];
                    q[j] = temp;
                }
            }
        }
        double a = 0 , b = 0, c = 0;
        a = q[3] - q[2];
        b = q[3] - q[1];
        c = q[3] - q[0];

        System.out.println((int)a+" "+(int)b+" "+(int)c);
        sc.close();
    }
}
