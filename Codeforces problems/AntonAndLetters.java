import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(1, s.length()-1);
        String list[] = s.split(",");
        Set<String> set = new HashSet<>();
        for (String str:
             list) {
            str = str.trim();
            if(str.length()>0) set.add(str);
        }
        System.out.println(set.size());
        sc.close();
    }
}
