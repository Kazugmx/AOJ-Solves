package JOI;

import java.util.Scanner;
import java.util.stream.Stream;

public class JOIPrelim_0708 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String... args){
        sc.nextLine();
        int[] al = setArray();
        int[] bl = setArray();
        int[] cl = setArray();
        int[] dl = setArray();
        System.out.println(loadMin(al,bl,cl,dl));
    }
    //腹減った 飯食わせろ　2023/09/16 4:33
    //今金なんかないです

    public static int[] setArray(){
        return Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }


    public static int loadMin(int[] aq ,int[] bq ,int[] cq ,int[] dq){
        int mindiff = Integer.MAX_VALUE;

        int[] co = new int[4];

        return mindiff;
    }
}
