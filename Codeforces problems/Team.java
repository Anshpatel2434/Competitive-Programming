import java.util.*;
public class Team{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans[][]=new int[n][3];
        for (int i=0;i<ans.length;i++) {
            for (int j=0;j<ans[i].length;j++) {
                ans[i][j] = sc.nextInt();
            }
        }
        int yes=0;
        for (int is[]:ans) {
                    int count1=0;
            for (int is2:is) {
                if(is2==1){
                    count1++;
                }
            }
            if(count1>1){
                yes++;
            }
        }
        System.out.println(yes);
        sc.close();
    }
}