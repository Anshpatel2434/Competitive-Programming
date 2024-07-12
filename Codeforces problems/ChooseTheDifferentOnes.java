import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.*;
import java.io.*;

public class ChooseTheDifferentOnes {
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        String ans[] = new String[t];
////        for (int i = 0; i < t; i++) {
////            int n = sc.nextInt();
////            int m = sc.nextInt();
////            int k = sc.nextInt();
////            ArrayList<Integer> a = new ArrayList<>();
////            ArrayList<Integer> b = new ArrayList<>();
////            int prev = 0;
////            for (int j = 0; j < n; j++) {
////                int num = sc.nextInt();
////                if(num <= k){
////                    if(prev != num){
////                        a.add(num);
////                        prev = num;
////                    }
////                }
////            }
////            prev = 0;
////            for (int h = 0; h < m; h++) {
////                int num = sc.nextInt();
////                if(num <= k){
////                    if(prev != num){
////                        b.add(num);
////                        prev = num;
////                    }
////                }
////            }
////            ans[t] = checkBothArrays(a, b, k);
////        }
////    }
////
////    private static String checkBothArrays(ArrayList<Integer> a, ArrayList<Integer> b, int k) {
////        ArrayList<Integer> dup = new ArrayList<>();
////            if(a.size() == b.size()){
////                for (int i = 0; i < a.size(); i++) {
////                    if(b.contains(a.get(i))){
////                        dup.add(a.get(i));
////                    }
////                }
////                for (int i = 0; i < dup.size(); i++) {
////                    if(a.size() > 3){
////                        if(a.contains(dup.get(i))){
////                            a.remove(Integer.valueOf(dup.get(i)));
////                        }
////                    }
////                    else if (b.size() > 3) {
////                        if(b.contains(dup.get(i))){
////                            b.remove(Integer.valueOf(dup.get(i)));
////                        }
////                    }
////                }
////                int count = 0;
////                for (int i = 1; i <= k; i++) {
////                    if(a.contains(i) || b.contains(i)){
////                        count++;
////                    }
////                }
////                if(count == k){
////                    return "YES";
////                }
////            }
////            if(a.size() > b.size()){
////
////            }
////    }
//}
    static FastReader in=new FastReader();
    static final Random random=new Random();
    static long mod=1000000007L;
    static HashMap<String,Integer> map=new HashMap<>();

    public static void main(String args[]) throws IOException {
        int t=in.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        loop:
        while(t-->0)
        {
            solve(out);
        }

    }

    private static void solve(PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];

        int[] har1 = new int[k+1];
        int[] har2 = new int[k+1];
        int diff1=0,diff2=0,dupCount=0;

        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            if(a[i]<=k && har1[a[i]]==0) har1[a[i]]++;
        }
        for(int i=0;i<m;i++)
        {
            b[i]=in.nextInt();
            if(b[i]<=k && har2[b[i]]==0) har2[b[i]]++;
        }

        for(int i=0;i<n;i++)
        {
            if(a[i]<=k)
            {
                if(har1[a[i]]==1 && har2[a[i]]==1)
                {
                    dupCount++;
                    har1[a[i]]++;
                    har2[a[i]]++;
                }
                else if(har1[a[i]]==1)
                {
                    diff1++;
                    har1[a[i]]++;
                }
            }
        }

        for(int i=0;i<m;i++)
        {
            if(b[i]<=k)
            {
                if(har2[b[i]]==1)
                {
                    diff2++;
                    har2[b[i]]++;
                }
            }
        }



        if(diff1 + diff2 + dupCount != k){
            out.println("No");
        }
        else if (diff1 > k/2 || diff2 > k/2) {
            out.println("No");
        }
        else {
            out.println("Yes");
        }


        out.flush();
    }


    static int max(int a, int b)
    {
        if(a<b)
            return b;
        return a;
    }


    static void ruffleSort(int[] a) {
        int n=a.length;
        for (int i=0; i<n; i++) {
            int oi=random.nextInt(n), temp=a[oi];
            a[oi]=a[i]; a[i]=temp;
        }
        Arrays.sort(a);
    }

    static < E > void print(E res)
    {
        System.out.println(res);
    }


    static  int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }

    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }


    static int abs(int a)
    {
        if(a<0)
            return -1*a;
        return a;
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }

        int [] readintarray(int n) {
            int res [] = new int [n];
            for(int i = 0; i<n; i++)res[i] = nextInt();
            return res;
        }
        long [] readlongarray(int n) {
            long res [] = new long [n];
            for(int i = 0; i<n; i++)res[i] = nextLong();
            return res;
        }
    }

}





