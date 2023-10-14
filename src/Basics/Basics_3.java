package Basics;
import java.util.*;

public class Basics_3 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] A = new int[n][m];
        int[] B=new int[m],
                re=new int[n];
        for(int x=0;x<n;x++)
            for(int y = 0; y <m; y++) {
                A[x][y] = sc.nextInt();
        }
        for(int r=0;r<m;r++){
            B[r]=sc.nextInt();
        }

        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                re[r]+=A[r][c]*B[c];
            }
        }

        Arrays.stream(re).forEach(e->System.out.println(e));
    }
}