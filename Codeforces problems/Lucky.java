import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            int count = 0, sum1 = 0, sum2 = 0;
            for (int i = 0; i < s.length(); i++) {
                String temp = "" + s.charAt(i);
                int num = Integer.parseInt(temp);
                count++;
                if(count > 3){
                    sum2 += num;
                }
                else{
                    sum1 += num;
                }
            }
            System.out.println((sum1 == sum2)? "YES" : "NO");
        }
    }
}
