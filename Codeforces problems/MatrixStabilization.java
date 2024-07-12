import java.util.*;
import java.io.*;

public class MatrixStabilization {
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
        int m = in.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int newNum = isChangable(i, j, n, m, mat);
                if (newNum == -1) {
                    continue;
                } else {
                    mat[i][j] = newNum;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                out.print(mat[i][j] + " ");
            }
            out.println();
        }
        out.flush();
    }

    private static int isChangable(int row, int col, int n, int m, int[][] mat) {
        int currVal = mat[row][col];
        if (n == 1) {
            if (m == 1) {
                return currVal;
            } else {
                if (col == 0) {
                    if (checkValid(row, col + 1, n, m) && mat[row][col + 1] < currVal) {
                        System.out.println();
                        return Math.max(mat[row][col + 1], mat[row][col+1]);
                    }
                } else if (col == m - 1) {
                    if (checkValid(row, col - 1, n, m) && mat[row][col - 1] < currVal) {
                        return Math.max(mat[row][col - 1], mat[row][col-1]);
                    }
                } else {
                    if (checkValid(row, col + 1, n, m) && checkValid(row, col - 1, n, m) && mat[row][col + 1] < currVal && mat[row][col - 1] < currVal) {
                        return Math.max(mat[row][col - 1], mat[row][col + 1]);
                    }
                }
            }
        } else {
            if (m == 1) {
                if (row == 0) {
                    if (checkValid(row + 1, col, n, m) && mat[row + 1][col] < currVal) {
                        return Math.max(mat[row + 1][col], mat[row + 1][col]);
                    }
                } else if (row == n - 1) {
                    if (checkValid(row - 1, col, n, m) && mat[row - 1][col] < currVal) {
                        return Math.max(mat[row - 1][col], mat[row - 1][col]);
                    }
                } else {
                    if (checkValid(row - 1, col, n, m) && checkValid(row + 1, col, n, m) && mat[row + 1][col] < currVal && mat[row - 1][col] < currVal) {
                        return Math.max(mat[row - 1][col], mat[row + 1][col]);
                    }
                }
            } else {
                if (row == 0) {
                    if (col == 0) {
                        if (checkValid(row + 1, col + 1, n, m) && mat[row][col + 1] < currVal && mat[row + 1][col] < currVal) {
                            return Math.max(mat[row][col + 1], mat[row + 1][col]);
                        }
                    } else if (col == m - 1) {
                        if (checkValid(row + 1, col - 1, n, m) && mat[row][col - 1] < currVal && mat[row + 1][col] < currVal) {
                            return Math.max(mat[row][col - 1], mat[row + 1][col]);
                        }
                    } else {
                        if (checkValid(row + 1, col + 1, n, m) && checkValid(row + 1, col - 1, n, m) && mat[row][col + 1] < currVal && mat[row + 1][col] < currVal && mat[row][col - 1] < currVal) {
                            return Math.max(mat[row][col - 1], Math.max(mat[row][col + 1], mat[row + 1][col]));
                        }
                    }
                } else if (row == n - 1) {
                    if (col == 0) {
                        if (checkValid(row - 1, col + 1, n, m) && mat[row][col + 1] < currVal && mat[row - 1][col] < currVal) {
                            return Math.max(mat[row][col + 1], mat[row - 1][col]);
                        }
                    } else if (col == m - 1) {
                        if (checkValid(row - 1, col - 1, n, m) && mat[row][col - 1] < currVal && mat[row - 1][col] < currVal) {
                            return Math.max(mat[row][col - 1], mat[row - 1][col]);
                        }
                    } else {
                        if (checkValid(row - 1, col + 1, n, m) && checkValid(row - 1, col - 1, n, m) && mat[row][col + 1] < currVal && mat[row - 1][col] < currVal && mat[row][col - 1] < currVal) {
                            return Math.max(mat[row][col - 1], Math.max(mat[row][col + 1], mat[row - 1][col]));
                        }
                    }
                } else {
                    if (col == 0) {
                        if (checkValid(row + 1, col + 1, n, m) && checkValid(row - 1, col + 1, n, m) && mat[row][col + 1] < currVal && mat[row + 1][col] < currVal && mat[row - 1][col] < currVal) {
                            return Math.max(mat[row - 1][col], Math.max(mat[row][col + 1], mat[row + 1][col]));
                        }
                    } else if (col == m - 1) {
                        if (checkValid(row + 1, col - 1, n, m) && checkValid(row - 1, col - 1, n, m) && mat[row][col - 1] < currVal && mat[row + 1][col] < currVal && mat[row - 1][col] < currVal) {
                            return Math.max(mat[row - 1][col], Math.max(mat[row][col - 1], mat[row + 1][col]));
                        }
                    } else {
                        if (checkValid(row + 1, col + 1, n, m) && checkValid(row - 1, col - 1, n, m) && mat[row][col + 1] < currVal && mat[row + 1][col] < currVal && mat[row][col - 1] < currVal && mat[row - 1][col] < currVal) {
                            return Math.max(Math.max(mat[row][col - 1], mat[row - 1][col]), Math.max(mat[row][col + 1], mat[row + 1][col]));
                        }
                    }
                }
            }
        }

        return -1;
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
    private static boolean checkValid(int i, int j, int n, int m) {
        return (i >= 0 && i < n) && (j >= 0 && j < m);
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

}