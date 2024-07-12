import java.util.*;
import java.io.*;
public class YetnotherrokenKeoard  {
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
        String str = in.nextLine();
//        int addUpper = 0, addLower = 0;
//        StringBuilder sb = new StringBuilder();
////        String ans = "";
//        for (int i = s.length()-1; i >= 0 ; i--) {
//            if(s.charAt(i) == 'b'){
//                addLower += 1;
////                if(i != s.length() -1 && s.charAt(i + 1) == 'b'){
////                    addLower --;
////                }
//                continue;
//            }
//            if(s.charAt(i) == 'B') {
//                addUpper += 1;
////                if(i != s.length() -1 && s.charAt(i + 1) == 'B'){
////                    addUpper --;
////                }
//                continue;
//            }
//            if(Character.isLowerCase(s.charAt(i)) && addLower > 0){
//                addLower--;
//                continue;
//            }
//            if(Character.isUpperCase(s.charAt(i)) && addUpper > 0){
//                addUpper--;
//                continue;
//            }
//            if(Character.isLowerCase(s.charAt(i)) && addLower == 0){
//                sb.insert(0,s.charAt(i));
//                continue;
//            }
//            if(Character.isUpperCase(s.charAt(i)) && addUpper == 0){
//                sb.insert(0,s.charAt(i));
//                continue;
//            }
//        }
//        out.println(sb);
        Stack<Integer> small = new Stack<>();
        Stack<Integer> capital = new Stack<>();

        char [] arr = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            if(arr[i] == 'b'){
                if(!small.isEmpty()){
                    int idx = small.pop();
                    arr[idx] = '#';
                }
                arr[i] = '#';
            } else if(arr[i] == 'B'){
                if(!capital.isEmpty()){
                    int idx = capital.pop();
                    arr[idx] = '#';
                }
                arr[i] = '#';
            } else {

                if(arr[i] >= 'a' && arr[i] <= 'z'){
                    small.push(i);
                } else {
                    capital.push(i);
                }
            }

        }

        StringBuilder SB = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(arr[i] != '#'){
                SB.append(arr[i]);
            }
        }

        out.println(SB.toString());
        out.flush();
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




