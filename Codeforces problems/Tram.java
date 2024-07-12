import java.util.*;

public class Tram {
    int a=0,b=0;
    int numberOfPassengers = 0;

    int getNumberOfPassengers(){
        return this.numberOfPassengers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Tram stops[] = new Tram[n];
        for (int i = 0; i < n; i++) {
            stops[i] = new Tram();
            int a = sc.nextInt();
            int b = sc.nextInt();

            stops[i].a=a;
            stops[i].b=b;

            if(i == 0){
                stops[i].numberOfPassengers = b;
            }
            else{
                stops[i].numberOfPassengers = (stops[i-1].numberOfPassengers - stops[i].a) + stops[i].b;
            }
        }
        ArrayList<Tram> list = new ArrayList<>(Arrays.asList(stops));
        Tram ans = Collections.max(list, Comparator.comparing(Tram::getNumberOfPassengers));
        System.out.println(ans.numberOfPassengers);
        sc.close();
    }
}

// OR
//import java.util.Scanner;
//
//public class Tram {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int cap = 0;
//        int max = 0;
//        for(int i=1; i<=n; i++) {
//
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            if(i == 1) {
//                cap += b;
//            } else {
//                cap += (b-a);
//            }
//            if(cap > max) {
//                max = cap;
//            }
//        }
//        System.out.println(max);
//        }
//}
