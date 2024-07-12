import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int uc=0 , lc=0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLowerCase(s.charAt(i))){
                lc++;
            }
            if(Character.isUpperCase(s.charAt(i))){
                uc++;
            }
        }
        if(lc>uc || lc==uc){
            s=s.toLowerCase();
            }
        else{
            s=s.toUpperCase();
        }
        System.out.println(s);
        sc.close();
    }
}
