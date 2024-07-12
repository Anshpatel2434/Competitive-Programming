import java.util.*;
import java.io.*;

public class Game11 {
    static FastReader in = new FastReader();
    static final Random random = new Random();
    static long mod = 1000000007L;
    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String args[]) throws IOException {
        int t = in.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        loop:
        while (t-- > 0) {
            solve(out);
        }
        out.close();

    }

    private static void solve(PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        Stack<Long> bat = new Stack<>();
        Stack<Long> bow = new Stack<>();
        long score = 0;
        for (int i = 0; i < n; i++) {
            bat.add(in.nextLong());
        }
        for (int i = 0; i < m; i++) {
            bow.add(in.nextLong());
        }
        if (n < 4 || m < 4 || n + m < 11) {
            out.println(-1);
            return;
        }
        Collections.sort(bat);
        Collections.sort(bow);
        for (int i = 1; i <= 4; i++) {
            score += bat.pop() + bow.pop();
        }
        int k = 3;
        while (k != 0) {
            long bats = 0, bows = 0;
            if (!bat.isEmpty()) {
                bats = bat.peek();
            }
            if (!bow.isEmpty()) {
                bows = bow.peek();
            }
            if (bats > bows) {
                score += bat.pop();
            } else {
                score += bow.pop();
            }
            k--;
        }
        out.println(score);
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