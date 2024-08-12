import java.util.*;
import java.io.*;

public class BalancedShuffle {
    static final Random random = new Random();
    static FastReader in = new FastReader();
    static long mod = 1000000007L;
    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String args[]) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        String s = in.nextLine();

        List<Tuple> b = new ArrayList<>();
        int temp = 0;
        int j = 1;

        for (char i : s.toCharArray()) {
            b.add(new Tuple(temp, -j, i));
            j++;
            if (i == '(') {
                temp++;
            } else {
                temp--;
            }
        }

        // Sort the list based on the balance and then by the index in reverse order
        Collections.sort(b);

        StringBuilder result = new StringBuilder();
        for (Tuple tuple : b) {
            result.append(tuple.character);
        }

        System.out.println(result.toString());

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

class Tuple implements Comparable<Tuple> {
    int temp;
    int index;
    char character;

    Tuple(int temp, int index, char character) {
        this.temp = temp;
        this.index = index;
        this.character = character;
    }

    @Override
    public int compareTo(Tuple other) {
        if (this.temp != other.temp) {
            return Integer.compare(this.temp, other.temp);
        }
        return Integer.compare(this.index, other.index);
    }
}
