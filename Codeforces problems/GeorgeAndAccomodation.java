import java.util.Scanner;

public class GeorgeAndAccomodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rooms[][] = new int[n][2];
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i][1]-rooms[i][0]>=2){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
