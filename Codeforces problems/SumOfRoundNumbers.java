import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> v = new ArrayList<>();
            String s = Integer.toString(n);
            for (int j = 0; j < s.length(); j++) {
                int curr = (n % 10) * (int)Math.pow(10,j);
                n = n/10;
                if(curr != 0){
                    v.add(curr);
                }
            }
            System.out.println(v.size());
            for (Integer num:v) {
                System.out.print(num+" ");
            }
        }
        sc.close();
    }
}
