import java.util.Scanner;

public class ValentinesContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 121){
            System.out.println("Likely");
        }
        else{
            System.out.println("Unlikely");
        }
        sc.close();
    }
}
