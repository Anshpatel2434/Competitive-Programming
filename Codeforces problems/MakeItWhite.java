import java.util.Scanner;

public class MakeItWhite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans[] = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            ans[i] = getLengthOfStrip(s,n);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        sc.close();
    }

    private static int getLengthOfStrip(String s, int n) {
        int firstIndex = s.indexOf('B');
        int lastIndex = s.lastIndexOf('B');
        if(firstIndex == lastIndex) return 1;
        String sub = s.substring(firstIndex, lastIndex+1);
        return sub.length();
    }
}
