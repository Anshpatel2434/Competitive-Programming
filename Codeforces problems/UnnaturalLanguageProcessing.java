import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class UnnaturalLanguageProcessing  {
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
            int n = in.nextInt();
            String s = in.nextLine();
            solve(s, out, n);
        }

    }

    private static void solve(String s, PrintWriter out, int n) {
        ArrayList<Character> con = new ArrayList<>(Arrays.asList('b','c','d'));
        ArrayList<Character> vow = new ArrayList<>(Arrays.asList('a','e'));
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(i+3 == s.length() && con.contains(s.charAt(i))){
                out.print("" + s.charAt(i) + s.charAt(i+1) + s.charAt(i+2));
                i += 2;
            }
            else if(i+2 == s.length() && con.contains(s.charAt(i))){
                out.print("" + s.charAt(i) + s.charAt(i+1));
                i += 1;
            }
            else if(i+3 < s.length() && con.contains(s.charAt(i)) && vow.contains(s.charAt(i+1)) && con.contains(s.charAt(i+2)) && con.contains(s.charAt(i+3))){
                out.print("" + s.charAt(i) + s.charAt(i+1) + s.charAt(i+2) + ".");
                i += 2;
            }
            else if (i+2 < s.length() && con.contains(s.charAt(i)) && vow.contains(s.charAt(i+1))) {
                out.print("" + s.charAt(i) + s.charAt(i+1) + ".");
                i += 1;
            }
        }
        out.println();
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





