import java.util.ArrayList;
import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        Integer sSum = 0, dSum = 0;
        boolean sTurn = true, dTurn = false;
        while(a.size() != 0){
            if(sTurn){
                if(a.getFirst() > a.getLast()){
                    sSum += a.getFirst();
                    a.removeFirst();
                }
                else{
                    sSum += a.getLast();
                    a.removeLast();
                }
                sTurn = false;
                dTurn = true;
            }
            else if(dTurn){
                if(a.getFirst() > a.getLast()){
                    dSum += a.getFirst();
                    a.removeFirst();
                }
                else{
                    dSum += a.getLast();
                    a.removeLast();
                }
                sTurn = true;
                dTurn = false;
            }
        }
        System.out.println(sSum +" "+dSum);
        sc.close();
    }
}
