import java.util.*;
public class watermelon1 {

    public static void main(String[] args) {
        // System.out.println("input");
        Scanner scanner = new Scanner(System.in);
        String strInput = scanner.nextLine();
        scanner.close();
        
        int input = Integer.parseInt(strInput);
        if (input % 2 == 0 && input > 2){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}