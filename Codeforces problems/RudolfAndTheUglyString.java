import java.util.*;
        import java.io.*;
public class RudolfAndTheUglyString  {
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
        String s = in.nextLine();
        int count = 0;
        String[] ug = {"mapie","map","pie"};
        for (int i = 1; i < n-1; i++) {
            String temp = s.charAt(i-1) + "" + s.charAt(i) + "" + s.charAt(i+1);
            if(i+3 < n){
                String t = temp + s.charAt(i+2) + "" + s.charAt(i+3);
                if(t.equals(ug[0])){
                    count++;
                    i+=3;
                    continue;
                }
            }
            if(temp.equals(ug[1])){
                count++;
                i+=1;
            }
            else if (temp.equals(ug[2])) {
                count++;
                i+=1;
            }
        }
        out.println(count);
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





