import java.util.Scanner;
import java.util.stream.Stream;

public class JOIPremlim_0708 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String... args){
        sc.nextLine();
        int[] al = Stream.of(sc.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int[] bl = Stream.of(sc.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int[] cl = Stream.of(sc.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int[] dl = Stream.of(sc.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();
        System.out.println(loadMin(al,bl,cl,dl));
    }
    //腹減った 飯食わせろ　2023/09/16 4:33
    //今金なんかないです
    public static int loadMin(int[] aq ,int[] bq ,int[] cq ,int[] dq){
        int mindiff = Integer.MAX_VALUE;

        int[] co = new int[4];

        return mindiff;
    }
}