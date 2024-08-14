import java.io.*;
import java.util.*;


public class IncreasingSequenceWithFixedOR {
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
        long n = in.nextLong();
        List<Long> a = new ArrayList<>();

        for (long i = 62; i >= 0; i--) {
            long x = 1L << i;
            if ((x & n) == x && x != n) {
                a.add(n - x);
            }
        }

        a.add(n);
        System.out.println(a.size());
        for (long i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    static int maxSubArraySum(int a[]) {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here
                = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    // static void decToBinary(int n)
    // {
    //     // array to store binary number
    //     String s="";

    //     // counter for binary array
    //     while (n > 0) {
    //         // storing remainder in binary array
    //         s+= n % 2+"";
    //         n = n / 2;
    //     }

    // }


    static boolean isPrime(long n) {
        // Corner cases
        if (n <= 1) return false;
        if (n <= 3) return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    static long nextPrime(long N) {

        // Base case
        if (N <= 1)
            return 2;

        long prime = N;
        boolean found = false;

        // Loop continuously until isPrime returns
        // true for a number greater than n
        while (!found) {
            prime++;

            if (isPrime(prime))
                found = true;
        }

        return prime;
    }

    static boolean isPowerOfTwo(long x) {
                                                /* First x in the below expression is
                                                for the case when x is 0 */
        return x != 0 && ((x & (x - 1)) == 0);
    }

    static int setBitNumber(int n) {

        // To find the position of the
        // most significant set bit
        int k = (int) (Math.log(n) / Math.log(2));

        // To return the value of the number
        // with set bit at k-th position
        return 1 << k;
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

    static int[] decToBinary(long N) {
        // array to store binary number
        int[] binaryNum = new int[60];
        int count = 1;
        // counter for binary array
        int i = 0;
        long n = N;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = (int) n % 2;
            if (binaryNum[i] == 1) count++;
            n = n / 2;
            i++;
        }
        if (!isPowerOfTwo(N)){
            System.out.println(count);
        }

        return binaryNum;
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

class ListComparator<T extends Comparable<T>> implements Comparator<List<T>> {

    @Override
    public int compare(List<T> o1, List<T> o2) {
        return o1.get(0).compareTo(o2.get(0));
    }

}