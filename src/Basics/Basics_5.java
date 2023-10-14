package Basics;
import java.util.Scanner;
class Basics_5 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int x = sc.nextInt(), cnt = 0;
            if(n==x&&x==0) break;
            for (int i = 1; i <= n; i++) {
                for (int o = i+1; o <= n; o++) {
                    for (int j = o+1; j <= n; j++) {
                        if(i+o+j ==x) {
                            if((i!=o) && (o!=j) &&(i!=j)) cnt++;
                        }
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
class Prt{
    void out(String arg){
        System.out.println(arg);
    }
}