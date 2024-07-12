
import java.util.*;
import java.io.*;
public class TwoOutOfThree  {
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
        int[] a = new int[n];
        int[] b = new int[n];
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> indexes = new HashMap<>();


        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if(freq.containsKey(a[i])){
                int f = freq.get(a[i]);
                freq.put(a[i], ++f);
            }
            else{
                freq.putIfAbsent(a[i], 1);
            }
            if(indexes.containsKey(a[i])){
                indexes.get(a[i]).add(i);
            }
            else{
                ArrayList<Integer> al = new ArrayList<>();
                al.add(i);
                indexes.put(a[i],al);
            }
        }
//        System.out.println(freq.toString());
//        System.out.println(indexes);
        boolean case1Done = false;
        int repeatCount = 0;

        for (Integer in: freq.values()) {
//            System.out.println(in);
            if(in > 1){
                repeatCount++;
            }
        }


        for (int i = 0; i < n; i++) {
            if(freq.get(a[i]) > 1 && !case1Done){
                    addCase1(b,indexes.get(a[i]));
                    indexes.get(a[i]).clear();
                    case1Done = true;

            }
            else if (freq.get(a[i]) > 1) {
                    addCase2(b,indexes.get(a[i]));
                    indexes.get(a[i]).clear();

            }
            else{
                b[i] = 1;
            }
        }
        if(repeatCount == 0 || repeatCount == 1 || repeatCount == n){
            System.out.println(-1);
        }
        else if(repeatCount >= 2){
            for (int i = 0; i < n; i++) {
                System.out.print(b[i]+" ");
            }
            System.out.println();
        }
        else System.out.println(-1);
        out.flush();
    }

    private static void addCase2(int[] b, ArrayList<Integer> indexes) {
        for (int i = 0; i < indexes.size(); i++) {
            if(i == 0){
                b[indexes.get(i)] = 3;
            }
            else b[indexes.get(i)] = 1;
        }
    }

    private static void addCase1(int[] b, ArrayList<Integer> indexes) {
        for (int i = 0; i < indexes.size(); i++) {
            if(i == 0){
                b[indexes.get(i)] = 2;
            }
            else b[indexes.get(i)] = 1;
        }
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





