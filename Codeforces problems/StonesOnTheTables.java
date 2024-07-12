import java.util.*;
public class StonesOnTheTables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int count=0;
        String s=sc.nextLine();
        for(int i=0;i<n;i++){
            // if(i==0){
            //     if(s.charAt(i)==s.charAt(i+1)){
            //         s=s.replace(s.charAt(i), '0');
            //         count++;
            //     }
            //     continue;
            // }
            if(i==n-1){
                // if(s.charAt(i)==s.charAt(i-1)){
                //     s=s.replace(s.charAt(i), '0');
                // }
                continue;
            }
            if(s.charAt(i)==s.charAt(i+1)){
                    count++;
                }
        }
        System.out.println(count);
        sc.close();
    }
}
