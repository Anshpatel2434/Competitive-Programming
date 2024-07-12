
import java.util.*;
import java.io.*;
public class ThreeThreadlets  {
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
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int pos1 = 0, pos2 = 0, pos3 = 0;

        if(a >= b){
            if(a > c){
                pos1 = a;
                if(b > c){
                    pos2 = b;
                    pos3 = c;
                }
                else{
                    pos2 = c;
                    pos3 = b;
                }
            }
            else {
                pos1 = c;
                pos2 = a;
                pos3 = b;
            }
        }
        else{
            if(b > c){
                pos1 = b;
                if(a > c){
                    pos2 = a;
                    pos3 = c;
                }
                else{
                    pos2 = c;
                    pos3 = a;
                }
            }
            else{
                pos1 = c;
                pos2 = b;
                pos3 = a;
            }
        }
//        System.out.println(pos1);
//        System.out.println(pos2);
//        System.out.println(pos3);
        if(pos1 == pos2 && pos2 == pos3){
            System.out.println("YES");
            return;
        }
        if(pos1 % pos3 == 0 && pos2 % pos3 == 0 && ((pos1/pos3)-1) + ((pos2/pos3)-1) <= 3){
            System.out.println("YES");
            return;
        }
        else{
            System.out.println("NO");
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





