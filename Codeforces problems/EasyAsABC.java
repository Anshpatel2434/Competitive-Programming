import java.util.*;
import java.io.*;
public class EasyAsABC  {
    static FastReader in=new FastReader();
    static final Random random=new Random();
    static long mod=1000000007L;
    static HashMap<String,Integer>map=new HashMap<>();

    public static void main(String args[]) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        solve(out);
        out.close();

    }

//    private static void solve(PrintWriter out) {
//        String a = in.nextLine();
//        char[][] mat = new char[3][3];
//        boolean[][] vis = new boolean[3][3];
//        char first = 'D';
//        int row = -1, col = -1;
//        for (int i = 0; i < 3; i++) {
//            mat[0][i] = a.charAt(i);
//            if (mat[0][i] <= first) {
//                first = mat[0][i];
//                row = 0;
//                col = i;
//            }
//        }
//        String b = in.nextLine();
//        for (int i = 0; i < 3; i++) {
//            mat[1][i] = b.charAt(i);
//            if (mat[1][i] <= first) {
//                first = mat[1][i];
//                row = 1;
//                col = i;
//            }
//        }
//        String c = in.nextLine();
//        for (int i = 0; i < 3; i++) {
//            mat[2][i] = c.charAt(i);
//            if (mat[2][i] <= first) {
//                first = mat[2][i];
//                row = 2;
//                col = i;
//            }
//        }
////        out.println(first);
////        out.println(row);
////        out.println(col);
//        out.print("" + mat[row][col]);
//        vis[row][col] = true;
//        char find[] = {'A', 'B', 'C'};
//        int[] nextIndex = new int[2];
//
//        for (int i = 0; i < find.length ; i++) {
//            nextIndex = findAdjacent(mat, row, col, vis, find[i]);
//            if(nextIndex[0] != -1){
//                out.print(""+mat[nextIndex[0]][nextIndex[1]]);
//                break;
//            }
//        }
//        vis[nextIndex[0]][nextIndex[1]] = true;
////        System.out.println(nextIndex[0]);
////        System.out.println(nextIndex[1]);
//        for (int i = 0; i < find.length ; i++) {
//            int[] nextIndex1 = findAdjacent(mat, nextIndex[0], nextIndex[1], vis, find[i]);
//            if(nextIndex1[0] != -1){
//                out.print(""+mat[nextIndex1[0]][nextIndex1[1]]);
//                break;
//            }
//        }
////        int[] nextIndex = findAdjacent(mat, row, col, vis);
////        out.print(""+mat[nextIndex[0]][nextIndex[1]]);
////        vis[nextIndex[0]][nextIndex[1]] = true;
////        int[] nextIndex1 = findAdjacent(mat, nextIndex[0], nextIndex[1], vis);
////        out.print(""+mat[nextIndex1[0]][nextIndex1[1]]);
//
//    }
    private static void solve(PrintWriter out) {
        String a = in.nextLine();
        String b = in.nextLine();
        String c = in.nextLine();
        ArrayList<String> ans = new ArrayList<>();
        char[][] mat = {
                a.toCharArray(),
                b.toCharArray(),
                c.toCharArray()
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            for (int n = 0; n < 3; n++) {
                                if(isAdjacent(i, j, k , l, m, n) && (m != i || n != j)){
                                    ans.add("" + mat[i][j] + mat[k][l] + mat[m][n]);
                                }
                            }
                        }
                    }
                }
            }
        }
        Collections.sort(ans);
        System.out.println(ans.get(0));
    }

    private static boolean isAdjacent(int r1, int c1, int r2, int c2, int r3, int c3) {
        return ((Math.abs(r1 - r2) == 1 && Math.abs(c1 - c2) == 0) || (Math.abs(r1 - r2) == 0 && Math.abs(c1 - c2) == 1) || (Math.abs(r1 - r2) == 1 && Math.abs(c1 - c2) == 1))
                &&
                ((Math.abs(r3 - r2) == 1 && Math.abs(c3 - c2) == 0) || (Math.abs(r3 - r2) == 0 && Math.abs(c3 - c2) == 1) || (Math.abs(r3 - r2) == 1 && Math.abs(c3 - c2) == 1));
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




