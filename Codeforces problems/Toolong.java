import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        for(int i=0;i<s.length;i++){
            if(s[i].length()>10){
                String ans=""+s[i].charAt(0);
                System.out.println(ans+(s[i].length()-2)+s[i].charAt(s[i].length()-1));
            }
            else System.out.println(s[i]);
        }
        sc.close();
    }
}