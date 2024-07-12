import java.util.*;

public class NtarsisSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>();
        int k=sc.nextInt();
        int s[]=new int[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        for(int i=0;i<Math.pow(10,10000);i++){
            a.add(i, i+1);
        }
    }
}
