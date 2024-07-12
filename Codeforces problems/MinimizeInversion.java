import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class MinimizeInversion{

    //FOR PRIME NUMBERS     TIME COMPLEXITY : N * log(log(N))
    public static int [] PrimeNumber(int n){

        boolean prime[] = new boolean[n+1];
        for(int j=2;(j*1l*j)<=n;j++){
            if(!prime[j]){
                for(int k=j+j; k*1l<=n; k+=j) prime[k]=true;
            }
        }
        int count=0;
        for(int j=2;j<=n;j++){
            if(!prime[j]) count++;
        }
        int arr[] = new int[count],t=0;
        for(int j=2;j<=n;j++){
            if(!prime[j]) {
                arr[t]=j;
                t++;
            }
        }
        return arr;
    }

    //FOR  FACTORS OF THE NUMBER        TIME COMPLEXITY : O(sqrt(N))
    public static void Factors(int n){
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                factors.add(i);
                if((n / i) != i) {
                    factors.add(n/i);
                }
            }
        }
    }

    //GCD OF TWO NUMBERS
    public static int gcd(int a, int b){
        if(a == 0){
            return b;
        }

        return gcd(b % a, a);
    }

    //LCM OF TWO NUMBERS
    public static long LCM(int a, int b){
        return  ((long) a * b) / gcd(a, b);
    }

    //Odd or Even
    public static boolean OddEven(int n){
        return (n & 1) == 1;
    }

    //    ith Bit of Binary Number
    public static int ithBit(int n){
        return n & (1 << n);
    }
    //    FOR TAKING FASTER INPUTS
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    //    Gives PRIME DIVISORS
    public static void PrimeDivisors(int n, ArrayList<Integer> primes){
        for(int i=2; i <= n; i++){
            while (n % i == 0){
                primes.add(i);
                n /= i;
            }
        }
    }

    static int MOD = 1000000007;

    public static int FindBits(int n){
        int bits = 0;
        while (n != 0){
            if((n & 1) != 0){
                bits++;
            }
            n >>= 1;
        }

        return bits;
    }
    public static void  Solve(FastReader fr, PrintWriter out) {
        int n = fr.nextInt();
        int [][] Seq = new int [n][2];

        for(int i=0; i<n; i++){
            Seq[i][0] = fr.nextInt();
        }

        for(int i=0; i<n; i++){
            Seq[i][1] = fr.nextInt();
        }

        Arrays.sort(Seq, Comparator.comparingInt(a -> a[0]));

        for(int i=0; i<n; i++){
            out.print(Seq[i][0] + " ");
        }

        out.println();
        for(int i=0; i<n; i++){
            out.print(Seq[i][1] + " ");
        }
        out.println();
        out.flush();
    }
    public static void main(String args[]) {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt();
        while (t-- > 0) {
            Solve(fr, out);
        }
    }
}

class Pair{
    int h;
    int idx;

    public Pair(int a, int b){
        this.h = a;
        this.idx = b;
    }
}