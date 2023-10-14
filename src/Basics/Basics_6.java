package Basics;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
class ArrayRead{
    static int[] cv(String arg){
        return Stream.of(arg.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
class Basics_6 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int[] rc = ArrayRead.cv(sc.nextLine());
        int arr[][] = new int[rc[0]+1][rc[1]+1];
        String lo[] = new String[rc[0]+1]; Arrays.fill(lo,"");

        for(int i = 0;i<rc[0];i++) {
            int pre[] = ArrayRead.cv(sc.nextLine());
            for (int n = 0; n < rc[1]; n++) {
                arr[i][n] = pre[n];
                arr[i][rc[1]]+=pre[n];
                arr[rc[0]][rc[1]]+=arr[i][n];
            }
        }

        for (int n = 0; n < rc[1]; n++) {
            int sm=0;
            for (int i = 0; i < rc[0]; i++) {
                sm+=arr[i][n];
            }
            lo[rc[0]] += sm + " ";
        }
        //System.out.println(Arrays.stream(g).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        lo[rc[0]] += arr[rc[0]][rc[1]];
        for(String out:lo) System.out.println(out);
    }
}