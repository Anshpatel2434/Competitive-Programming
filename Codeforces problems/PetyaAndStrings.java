import java.util.*;
public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int po=0,ne=0;
        if(s1.equals(s2)) System.out.println(0);
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>s2.charAt(i)){
                po++ ;
                break;
            } 
            if(s1.charAt(i)<s2.charAt(i)) {
                ne++;
                break;    
            }
        }
        if(po>0){
            System.out.println(1);
        }
        if(ne>0){
            System.out.println(-1);
        }
        sc.close();
    }
}
