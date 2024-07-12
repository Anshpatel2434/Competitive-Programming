import java.util.*;
import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;
public class HelpfullMaths {
    public static void main(String[] args) throws PatternSyntaxException{
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split("\\+"); //|--->> Because + is a special symbol which is used for other purposes too.Hence write it like this
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            int num=Integer.parseInt(a[i]);
            al.add(num);
        }
        al.sort(null);
        Object num[]=al.toArray();
        String ans="";
        for(int i=0;i<num.length;i++){
            if(i==num.length-1){
                ans+=num[i];
            }
            else ans+=num[i]+"+";
        }
        System.out.println(ans);
        sc.close();
    }
}
