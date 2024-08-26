import java.util.*;
import java.io.*;

public class FlippingGame {
    static final Random random = new Random();
    static FastReader in = new FastReader();
    static long mod = 1000000007L;
    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String args[]) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        solve(out);

    }

    private static void solve(PrintWriter out) {

        int n = in.nextInt();
        int[] arr = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(arr[i] == 1) count++;
        }

        int[] dp = new int[n];
        dp[0] = arr[0] == 1? -1 : 1;
        int max = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(arr[i] == 1? -1 : 1, dp[i-1] + (arr[i] == 1? -1 : 1));
            max = Math.max(max, dp[i]);
        }
        out.println(count+max);
        out.flush();
    }


    public static void ArrayInput(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }
    }

    public static void ArrayInput(long[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextLong();
            }
        }
    }

    public static void ArrayInput(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
    }

    public static void ArrayInput(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextLong();
        }
    }

    public static void ArrayInput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }

    //this is a method to find the xor till n without using the for loop in O(1)
    private static int XorTillNumber(int n) {
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0;
    }

    public static int SmallestDivisor(int n) {

        //this is an optimal method to find the smallest divisor of the number, in this method we iterate through all the divisor of n but in an optimal way i.e.
        //in this loop if the i is divisor of n then it's value will always be less than root(n) and the other divisor by which we are multiplying the i to get the n
        //it's value will always be greater than root(n) for this particular i
        //if there is no such i then it is prime number

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }

    static int[] decToBinary(long n) {
        // array to store binary number
        int[] binaryNum = new int[32];
        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = (int) n % 2;
            n = n / 2;
            i++;
        }
        return binaryNum;
    }

    //sliding window method to check bitwise OR of each sub array and compare it to the OR value of the arguments
    private static boolean slidingWindowOR(List<Integer> list, int k, int ORi) {
        int[] freqOneBit = new int[31];

        //checking for the 1st window
        for (int i = 0; i < k; i++) {
            int curr = list.get(i);

            for (int j = 30; j >= 0; j--) {
                if (curr >= (1 << j)) {
                    curr -= (1 << j);
                    freqOneBit[j]++;
                }
            }
        }

        int or2 = 0;
        for (int i = 0; i < freqOneBit.length; i++) {
            if (freqOneBit[i] > 0) or2 |= (1 << i);
        }

        if (or2 != ORi) {
            return false;
        }

        //now for all the other windows
        for (int i = 1; i < list.size() - k + 1; i++) {

            //deleting the one bits of the element that just left the window
            int last = list.get(i - 1);
            for (int j = 30; j >= 0; j--) {
                if (last >= (1 << j)) {
                    last -= (1 << j);
                    freqOneBit[j]--;
                    if (freqOneBit[j] == 0) {
                        or2 -= (1 << j);
                    }
                }
            }

            //adding the one bits present in the next element entering the window
            int newMember = list.get(i + k - 1);
            for (int j = 30; j >= 0; j--) {
                if (newMember >= (1 << j)) {
                    newMember -= (1 << j);
                    freqOneBit[j]++;
                    if (freqOneBit[j] == 1) {
                        or2 += (1 << j);
                    }
                }
            }

            if (or2 != ORi) {
                return false;
            }
        }
        return true;
    }

    public static List<Map.Entry<String, Integer>> sortByValueStringBubble(HashMap<String, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

        // Sort the list
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size() - 1; j++) {
                if (list.get(j).getValue() > list.get(j + 1).getValue()) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }


        int curr = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getValue() != list.get(curr).getValue()) {
                list = bubble(list, curr, i);
                curr = i;
            }
        }

        return list;
    }

    public static List<Map.Entry<String, Integer>> bubble(List<Map.Entry<String, Integer>> list, int s, int e) {
        for (int i = s; i < e; i++) {
            for (int j = i; j < s - 1; j++) {
                if (list.get(j).getKey().charAt(1) < list.get(j + 1).getKey().charAt(1)) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
        return list;
    }

    public static HashMap<String, Integer> sortByValueString(HashMap<String, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> map2) {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer>> list =
                new LinkedList<Map.Entry<Integer, Integer>>(map2.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

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


    static int logab(int a, int b) {
        return (int) (Math.log(a) / Math.log(b));
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