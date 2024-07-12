import java.util.Scanner;

public class RectangleCutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            boolean ans = cutHorizontally(new Rectangle(a,b));
            if(ans){
                System.out.println("YES");
            }
            else{
                boolean ans1 = cutVertically(new Rectangle(a,b));
                if(ans1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }

    private static boolean cutHorizontally(Rectangle r) {
        int a1 = 0 , a2 = 0;
        if(r.a == 1){
            return false;
        }
        else if(r.a > 1){
            if(r.a % 2 == 0){
                a1 = r.a/2;
                a2 = a1;

                if(!Rectangle.checkEqualRectangles(r, new Rectangle(a1, r.b + r.b))){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                a1 = r.a / 2;
                a2 = a1 + 1;
                if(!Rectangle.checkEqualRectangles(r, new Rectangle(a1+a2, r.b))){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean cutVertically(Rectangle r) {
        int b1 = 0 , b2 = 0;
        if(r.b == 1){
            return false;
        }
        else if(r.b > 1){
            if(r.b % 2 == 0){
                b1 = r.b/2;
                b2 = b1;

                if(!Rectangle.checkEqualRectangles(r, new Rectangle(r.a + r.a, r.b))){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                b1 = r.b / 2;
                b2 = b1 + 1;
                if(!Rectangle.checkEqualRectangles(r, new Rectangle(r.a, b1 + b2))){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
class Rectangle{
    int a = 0;
    int b = 0;
    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    static boolean checkEqualRectangles(Rectangle r1, Rectangle r2){
        if(r1.a + r1.b != r2.a + r2.b){
            return false;
        }
        else{
            return true;
        }
    }
}
