import java.util.*;
import java.io.*;
public class Forked  {
    static FastReader in=new FastReader();
    static final Random random=new Random();
    static long mod=1000000007L;
    static HashMap<String,Integer>map=new HashMap<>();

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
        int xk = in.nextInt();
        int yk = in.nextInt();
        int xq = in.nextInt();
        int yq = in.nextInt();
        if(a == b){
            int count = 0;
            ArrayList<ArrayList<Integer>> kPos = new ArrayList<>();
            //downwards movement first
            kPos.add(makePairs(b,a,xk,yk));
            kPos.add(makePairs(-b,a,xk,yk));

            //upwards movement first
            kPos.add(makePairs(b,-a,xk,yk));
            kPos.add(makePairs(-b,-a,xk,yk));

            ArrayList<ArrayList<Integer>> qPos = new ArrayList<>();
            //downwards movement first
            qPos.add(makePairs(b,a,xq,yq));
            qPos.add(makePairs(-b,a,xq,yq));

            //upwards movement first
            qPos.add(makePairs(b,-a,xq,yq));
            qPos.add(makePairs(-b,-a,xq,yq));

            for (ArrayList<Integer> temp: kPos) {
                if(qPos.contains(temp)){
                    count++;
                }
            }
            out.println(count);

        }
        else{
            int count = 0;
            ArrayList<ArrayList<Integer>> kPos = new ArrayList<>();
            //downwards movement first
            kPos.add(makePairs(b,a,xk,yk));
            kPos.add(makePairs(-b,a,xk,yk));

            //upwards movement first
            kPos.add(makePairs(b,-a,xk,yk));
            kPos.add(makePairs(-b,-a,xk,yk));

            //left movement first
            kPos.add(makePairs(-a,b,xk,yk));
            kPos.add(makePairs(-a,-b,xk,yk));

            //right movement first
            kPos.add(makePairs(a,b,xk,yk));
            kPos.add(makePairs(a,-b,xk,yk));

            ArrayList<ArrayList<Integer>> qPos = new ArrayList<>();
            //downwards movement first
            qPos.add(makePairs(b,a,xq,yq));
            qPos.add(makePairs(-b,a,xq,yq));

            //upwards movement first
            qPos.add(makePairs(b,-a,xq,yq));
            qPos.add(makePairs(-b,-a,xq,yq));

            //left movement first
            qPos.add(makePairs(-a,b,xq,yq));
            qPos.add(makePairs(-a,-b,xq,yq));

            //right movement first
            qPos.add(makePairs(a,b,xq,yq));
            qPos.add(makePairs(a,-b,xq,yq));

            for (ArrayList<Integer> temp: kPos) {
                if(qPos.contains(temp)){
                    count++;
                }
            }
            out.println(count);
        }
        out.flush();
    }

    private static ArrayList<Integer> makePairs(int a, int b, int xk, int yk) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(xk+a);
        temp.add(yk+b);
        return temp;
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




