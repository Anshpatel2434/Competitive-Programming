import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if(s.length()==t.length()){
            StringBuilder sb = new StringBuilder(s);
            sb = sb.reverse();
            String rev = sb.toString();
            if(rev.equals(t)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
