import java.util.*;
public class Dominopiling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int board[][]=new int[m][n];
        int checkhorizontal=0;
        int checkvertical=0;
        int mavailable=0;
        int navailable=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i!=m-1){
                    if(board[i][j]==0&&board[i+1][j]==0){
                        checkvertical++;
                        board[i][j]=1;
                        board[i+1][j]=1;
                    }
                }
                    if(j!=n-1){
                        if(board[i][j]==0&&board[i][j+1]==0){
                            checkhorizontal++;
                            board[i][j]=1;
                            board[i][j+1]=1;
                        }
                    }
            }
        }
        System.out.println(checkhorizontal+checkvertical);
        sc.close();
    }
}
