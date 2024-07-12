//Or you could have simply used set and subtracted the length of the set from 4 and your answer is ready

import java.util.Scanner;
//652588203 931100304 931100304 652588203

public class IsYourHorshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            if (i==3){
                s += Integer.toString(a);
            }
            else{
                s += Integer.toString(a);
                s += " ";
            }
        }
        String a[] = s.split(" ");
        int count = 0 , max = 0, repeat=0;
        for (int i = 0; i < a.length; i++) {
            count = 0;
            for (int j = i+1; j < a.length; j++) {
                if (a[i].equals(a[j])){
                    count++;
                    if(count == max){
                        repeat++;
                    }
                    if(count>max){
                        max = count;
                    }
                }
            }
        }
        if(repeat>0) System.out.println(max+1);
        else System.out.println(max);
        sc.close();
    }
}
