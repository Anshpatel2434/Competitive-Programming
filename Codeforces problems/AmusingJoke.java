import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        s += sc.nextLine();
        s += sc.nextLine();
        String sh = sc.nextLine();
        checkValidString(s,sh);
        sc.close();
    }

    private static void checkValidString(String s, String sh) {
        char c[] = sh.toCharArray();
        List<Character> al = new ArrayList<>();
        for (char ch:
             c) {
            al.add(ch);
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(al.contains(s.charAt(i))){
                int index = al.indexOf(s.charAt(i));
                char r = al.remove(index);
                count ++;
            }
        }
        if(count == s.length() && al.size() == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
