import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char luckyDigits[] = {'4','7'};

        String s = sc.nextLine();
        int count = 0;
                for (int i = 0; i < s.length(); i++) {
                    for (char c: luckyDigits) {
                        if(c==s.charAt(i)){
                            count++;
                        }
                    }
                }
        if(count == 4 || count == 7){
            System.out.println("YES");
        }
        else System.out.println("NO");
        sc.close();
    }
}
