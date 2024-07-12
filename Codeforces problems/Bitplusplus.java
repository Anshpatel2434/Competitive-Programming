import java.util.*;
class process{
    int x;
    void increment(){
        x++;
    }
    void decrement(){
        x--;
    }
}
public final class Bitplusplus {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        process p=new process();
        for(int i=1;i<=n;i++){
            String name=sc.nextLine();
            for(int j=0;j<name.length();j++){
                if((name.charAt(j)=='+'&&name.charAt(j+1)=='+')||(name.charAt(j)=='+'&&name.charAt(j-1)=='+')){
                p.increment();
                break;
            }
            if((name.charAt(j)=='-'&&name.charAt(j+1)=='-')||(name.charAt(j)=='-'&&name.charAt(j-1)=='-')){
                p.decrement();
                break;
            }
        }
    }
    System.out.println(p.x);
    sc.close();
}
}
