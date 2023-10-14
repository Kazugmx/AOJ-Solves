package Basics;

import java.util.Arrays;
import java.util.Scanner;

class Basics_1 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        Cards[] cd = new Cards[4];
        for(int i=0;i<cd.length;i++) cd[i]=new Cards();
        int d = Integer.parseInt(sc.nextLine());
        for(int j = 0;j < d; j++){
            String[] a = sc.nextLine().split(" ");
            int num = Integer.parseInt(a[1]);
            if(a[0].equals("S")) cd[0] .set(a[0],num);
            else if(a[0].equals("H")) cd[1].set(a[0],num);
            else if(a[0].equals("C")) cd[2].set(a[0],num);
            else cd[3].set(a[0],num);
        }
        Arrays.stream(cd).forEach(a -> a.out());
    }
}

class Cards {
    Cards() {};
    boolean[] isAvaiable= new boolean[13];
    String cardtype;


    void set(String type,int num) {
        cardtype = type;
        isAvaiable[num-1] = true;
    }

    void out() {
        for (int i = 0; i < 13; i++) {
            if (!isAvaiable[i]) {
                System.out.printf("%s %d%n", cardtype, i + 1);
            }
        }
    }
}