import java.util.*;
import java.io.*;

public class IncreaseDecreaseCopy {
    static final Random random = new Random();
    static FastReader in = new FastReader();
    static long mod = 1000000007L;
    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String args[]) throws IOException {
        int t = in.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        loop:
        while (t-- > 0) {
            solve(out);
        }

    }

    private static void solve(PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n + 1; i++) {
            b[i] = in.nextInt();
        }

        ArrayList<Long> notInBetween = new ArrayList<>();
        long operation = 0;
        boolean inBetweenPresent = false;

        for (int i = 0; i < n; i++) {
            if((b[n] >= b[i] && b[n] <= a[i]) || (b[n] <= b[i] && b[n] >= a[i])){
                inBetweenPresent = true;
            }
            else{
                long distFromA = Math.abs(a[i] - b[n]);
                long distFromB = Math.abs(b[i] - b[n]);
                notInBetween.add(Math.min(distFromA, distFromB));
            }
            operation += Math.abs(a[i] - b[i]);
        }
        if(inBetweenPresent){
            out.println(operation + 1);
        }
        else{
            out.println(Collections.min(notInBetween) + 1 + operation);
        }

        out.flush();
    }

    static long sumTillNumber(long a) {
        return (a * (a + 1)) / 2;
    }

    static int max(int a, int b) {
        if (a < b)
            return b;
        return a;
    }


    static void ruffleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int oi = random.nextInt(n), temp = a[oi];
            a[oi] = a[i];
            a[i] = temp;
        }
        Arrays.sort(a);
    }

    static <E> void print(E res) {
        System.out.println(res);
    }


    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }


    static int abs(int a) {
        if (a < 0)
            return -1 * a;
        return a;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] readintarray(int n) {
            int res[] = new int[n];
            for (int i = 0; i < n; i++) res[i] = nextInt();
            return res;
        }

        long[] readlongarray(int n) {
            long res[] = new long[n];
            for (int i = 0; i < n; i++) res[i] = nextLong();
            return res;
        }
    }

}




