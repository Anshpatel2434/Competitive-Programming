import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int countA=0,countD=0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='A'){
                countA++;
            }
            if(s.charAt(i)=='D'){
                countD++;
            }
        }
        if(countD>countA){
            System.out.println("Danik");
        } else if (countA>countD) {
            System.out.println("Anton");
        }
        else System.out.println("Friendship");
        sc.close();
    }
}
