import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '.'){
                ans += "0";
                continue;
            }
            else if (s.charAt(i) == '-' && i != s.length()-1 && s.charAt(i+1) == '.') {
                ans += "1";
                i++;
                continue;
            }
            else if (s.charAt(i) == '-' && i != s.length()-1 && s.charAt(i+1) == '-') {
                ans += "2";
                i++;
                continue;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
