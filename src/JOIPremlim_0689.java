import java.util.Scanner;
import java.util.stream.Stream;

public class JOIPremlim_0689 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int n = Integer.parseInt( N );
        int i=0;


        String[] s = sc.nextLine().split("");
        n=0;
        while(i<=s.length-1){
            if(i%2==1){
                if(s[i].equals("O"));
                else{
                    n++;
                    s[i] = "O";
                }
            }else{
                if(s[i].equals("I"));
                else{
                    n++;
                    s[i]="I";
                }
            }
            i++;
        }
        System.out.println(n);
    }
}
