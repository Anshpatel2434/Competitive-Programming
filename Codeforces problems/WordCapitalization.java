import java.util.*;
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=s.charAt(0);
        String rep=""+c;
        if(c>=65 && c<=91){
            System.out.println(s);
        }
        else if(c>=97 && c<=123){
            c-=32;
            String temp=""+c;
            s=s.replaceFirst(rep,temp);
            System.out.println(s);
        }
    }   
}
