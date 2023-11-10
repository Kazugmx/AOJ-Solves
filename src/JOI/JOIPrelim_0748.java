package JOI;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class JOIPrelim_0748 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String... args){

        int N = Integer.parseInt(sc.nextLine());
        int A[] = retArr(sc.nextLine());
        int B[] = retArr(sc.nextLine());
        int C[] = retArr(sc.nextLine());
        int D[] = retArr(sc.nextLine());
        Arrays.sort(A);Arrays.sort(B);Arrays.sort(C);Arrays.sort(D);
        int a=0,b=0,c=0,d=0,minDiff=Integer.MAX_VALUE;
        while (a < N && b < N && c < N && d < N) {
            int max = Math.max(Math.max(A[a], B[b]), Math.max(C[c], D[d]));
            int min = Math.min(Math.min(A[a], B[b]), Math.min(C[c], D[d]));

            minDiff = Math.min(minDiff, max - min);

            if (min == A[a]) a++;
            else if (min == B[b]) b++;
            else if (min == C[c]) c++;
            else d++;
        }
        System.out.println(minDiff);
    }

    public static int[] retArr(String args){
        return Stream.of(args.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

}