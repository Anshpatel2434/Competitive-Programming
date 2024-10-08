import java.util.*;
import java.io.*;

public class BouquetEasy {
    static final Random random = new Random();
    static FastReader in = new FastReader();
    static long mod = 1000000007L;
    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        int t = in.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        loop:
        while (t-- > 0) {
            solve(out);
        }

    }

    private static void solve(PrintWriter out) {

        int n = in.nextInt();
        long m = in.nextLong();
        long[] arr = new long[n];
        Map<Long, Long> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            freq.put(arr[i], freq.getOrDefault(arr[i], 0L) + 1);
        }

        List<Long> keys = new ArrayList<>(freq.keySet());
        Collections.sort(keys, Collections.reverseOrder());

        long max = Integer.MIN_VALUE;
        for (int i = 0; i < keys.size()-1; i++) {
            long currNum = keys.get(i), currFreq = freq.get(currNum);
            long nextNum = keys.get(i+1), nextFreq = freq.get(nextNum);
            if(Math.abs(currNum - nextNum) <= 1){
                for (int j = 1; j <= currFreq; j++) {
                    if(currNum * j <= m){
                        long rem = m - (currNum * j);
                        long req = Math.min(nextFreq, rem / nextNum);
                        long sum = (currNum * j) + (req * nextNum);
                        if(sum <= m){
                            max = Math.max(max, sum);
                        }
                    }
                    else{
                        long req = m / currNum;
                        max = Math.max(max, req * currNum);
                    }
                }
            }
            else{
                if(currFreq * currNum <= m){
                    max = Math.max(currFreq * currNum, max);
                }
                else{
                    long reqFlowers = m / currNum;
                    max = Math.max(max, reqFlowers * currNum);
                }
            }
        }

        //for last num
        long lastNum = keys.getLast();
        long lastFreq = freq.get(lastNum);
        if(lastFreq * lastNum <= m){
            max = Math.max(lastFreq * lastNum, max);
        }
        else{
            long reqFlowers = m / lastNum;
            max = Math.max(max, reqFlowers * lastNum);
        }

        out.println(max);
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