import java.io.PrintWriter;
import java.util.*;

public class MedianOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        loop:
        while(t-->0)
        {
            solve(out, sc);
        }
        out.close();
    }

    private static void solve(PrintWriter out, Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0,min = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(i == 0){
                min = a[i];
            }
            if(a[i] > max ){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
            al.add(a[i]);
        }
        Collections.sort(al);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i],Collections.frequency(al,a[i]));
        }
        int mid = (int)(Math.ceil((double)n/2));
        if((a[mid-1] == min || a[mid-1] == max)){
            if(map.get(a[mid-1])<=2 && n <= 2){
                out.println(map.get(a[mid-1]));
            }
            else{
                out.println(map.get(a[mid-1])-1);
            }
        }
        else{
            out.println(map.get(a[mid-1]));
        }
    }
}
