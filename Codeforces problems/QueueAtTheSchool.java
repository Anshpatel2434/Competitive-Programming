import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        char c[] = s.toCharArray();
        for (int j = 1; j <= t; j++) {
            for (int i = 0; i < c.length; i++) {
                if(c[i]=='G' && i>0){
                    if(c[i-1]=='B'){
                        char temp = c[i-1];
                        c[i-1] = c[i];
                        c[i] = temp;
                    }
                    i+=1;
                }
            }
        }
        String ans = new String(c);
        System.out.println(ans);
        sc.close();
    }
}
