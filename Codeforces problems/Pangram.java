import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        s = s.toLowerCase();
        Set<Character> set = new HashSet<>();
        char c[] = s.toCharArray();
        for (char ch: c) {
            set.add(ch);
        }
        int count = 0;
        for (char ch:
             set) {
            if(ch >= 97 && ch <= 122) {
                count++;
                if(count == 26){
                    break;
                }
            }
        }
        if(count == 26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
