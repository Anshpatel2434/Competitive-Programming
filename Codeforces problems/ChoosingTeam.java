import java.util.Scanner;

public class ChoosingTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int team = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a + k <= 5){
                count++;
            }
            if(count == 3){
                team++;
                count = 0;
            }
        }
        System.out.println(team);
        sc.close();
    }
}
