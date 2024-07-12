import java.util.*;
public class BoyorGirl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                if(c[i]==c[j] && i!=j && c[i]!='0'){
                    c[j]='0';
                }    
                else count++;
            }
        }
        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else System.out.println("IGNORE HIM!");
        sc.close();
    }
}
