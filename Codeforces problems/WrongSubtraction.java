import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        char characters[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        String s = String.valueOf(n);
        for (int i = 0; i < k; i++) {
            if (s.charAt(s.length() - 1) != characters[0]) {
                String lastCharacter = "" + s.charAt(s.length() - 1);
                int changeNumber = Integer.parseInt(lastCharacter);
                StringBuilder sb = new StringBuilder(s);

                sb.setCharAt(s.length() - 1, characters[changeNumber - 1]);
                s = sb.toString();
            } else {
                s = s.substring(0, s.length() - 1);
            }
        }
        System.out.println(s);
        sc.close();
    }
}
