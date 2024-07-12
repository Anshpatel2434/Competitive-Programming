import java.util.*;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rowlocation=0,collocation=0;
        int a[][]=new int[5][5];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==1){
                    rowlocation=i;
                    collocation=j;
                }
            }
        }
        // int moves=0;
        // while(a[2][2]!=1){
        //    for(int i=0;i<5;i++){
        //         for(int j=0;j<5;j++){
        //         if(a[i][j]==1){
        //             if(rowlocation<2&&rowlocation!=2){
        //                 a[rowlocation][j]=0;
        //                 rowlocation++;
        //                 a[rowlocation][j]=1;
        //                 moves++;
        //             }
        //             if(rowlocation>2&&rowlocation!=2){
        //                 a[rowlocation][j]=0;
        //                 rowlocation--;
        //                 a[rowlocation][j]=1;
        //                 moves++;
        //             }
        //             if(collocation<2&&collocation!=2){
        //                 a[i][collocation]=0;
        //                 collocation++;
        //                 a[i][collocation]=1;
        //                 moves++;
        //             }
        //             if(collocation>2&&collocation!=2){
        //                 a[i][collocation]=0;
        //                 collocation--;
        //                 a[i][collocation]=1;
        //                 moves++;
        //             }
        //         }
        //     }
        //    }
        int moves=(Math.abs(2-rowlocation)+Math.abs(2-collocation));
           System.out.println(moves);
           sc.close();
        }
    }  
