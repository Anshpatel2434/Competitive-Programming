import java.util.*;
public class Nextround {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n+1];
        int yes=0;
        int kthscore=0;
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
            if(i==k){
                kthscore=a[i];
            }
        }
        for(int i=1;i<=n;i++){
            if(a[i]>=kthscore&&a[i]>0){
                yes++;
            }
        }
        System.out.println(yes);
        sc.close();
    }
}
