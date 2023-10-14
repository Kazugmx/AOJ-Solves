package JOI;

import java.util.Scanner;
import java.util.stream.Stream;

public class JOIPremlim_0688 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String... args){
        int[] in = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int mx = Math.max(in[0]-in[1],in[0]+in[1]);
        int mn = Math.min(in[0]-in[1],in[0]+in[1]);
        System.out.println(mx);
        System.out.println(mn);
    }
}
