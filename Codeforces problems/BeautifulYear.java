import java.util.Scanner;

public class BeautifulYear {

    static boolean checkDistinctYear(int n){
        String sb = Integer.toString(n);
        int count = 0 ;
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i+1; j < sb.length(); j++) {
                if(sb.charAt(i)==sb.charAt(j)) count++;
            }
        }
        if(count>0) return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while (true){
            n++;
            if(checkDistinctYear(n)) {
                System.out.println(n);
                break;
            }
            else continue;
        }
        sc.close();
    }
}
