import java.util.Scanner;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String arr[] = s.split(" ");
            String a = arr[0];
            String b = arr[1];
            char temp = a.charAt(0);
            a = b.charAt(0) + a.substring(1, a.length());
            b = temp + b.substring(1, b.length());
            System.out.println(a + " "+ b);
        }

    }
}
