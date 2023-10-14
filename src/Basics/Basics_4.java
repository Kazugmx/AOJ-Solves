package Basics;

import java.util.*;

public class Basics_4 {
     public static void main(String... args){
         Scanner sc = new Scanner(System.in);
         Prt prt = new Prt();
         while(true){
             int m = sc.nextInt();
             int f = sc.nextInt();
             int r = sc.nextInt(),sum=m+f;
             if(m==-1&&f==-1&&r==-1) break;
             else if(m==-1||f==-1) prt.out("F");
             else if(m+f>=80) prt.out("A");
             else if(sum>=65) prt.out("B");
             else if(sum>=50||(sum>=30&&r>=50)) prt.out("C");
             else if(sum>=30) prt.out("D");
             else prt.out("F");

         }
     }
}
