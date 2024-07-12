import java.util.Scanner;

public class PoliceRecruits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int available = 0;
        int untreated = 0;
        for (int i = 0; i < n; i++) {
            int in = sc.nextInt();
            if(in == (-1) && available > 0){
                available--;
            }
            else if(in != (-1)) available += in;
            else{
                untreated++;
            }
        }
        System.out.println(untreated);
        sc.close();
    }
}