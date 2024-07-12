import java.util.Scanner;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count1 = 0, count2 = 0, count3 = 0;
        int[] ind1 = new int[n];
        int[] ind2 = new int[n];
        int[] ind3 = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a == 1){
                ind1[count1] = i+1;
                count1++;
            }
            if(a == 2){
                ind2[count2] = i+1;
                count2++;
            }
            if(a == 3){
                ind3[count3] = i+1;
                count3++;
            }
        }
        int min = Math.min(Math.min(count1,count2),count3);
        System.out.println(min);
        for (int i = 0; i < min; i++) {
            System.out.println(ind1[i] + " " + ind2[i] + " " + ind3[i]);
        }
        sc.close();
    }
}
