package Basics;

import java.util.Scanner;

class Basics_2 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Building[] room = new Building[4];
        for(int i = 0;i<room.length;i++) room[i] = new Building(i+1); //reset

        for(int l = 0; l <n; l++){
            int bd,floor,rnum,cnt;
            bd = sc.nextInt()-1;
            floor = sc.nextInt();
            rnum = sc.nextInt();
            cnt = sc.nextInt();
            room[bd].add(floor,rnum,cnt);
        }
        n = 0;
        for(Building rm:room){
            if(n!=3){
                rm.exec();
                System.out.println("####################");
                n++;
            }
            else rm.exec();
        }
    }
}

class Building {
    Building(int u) {
        unit=u;
    }
    int unit;
    int[][] room = new int[3][10];
    void add(int floor,int rnum,int cnt){
        room[floor-1][rnum-1] += cnt;
    }

    void lta(int i){
        String retCon ="";
        for(int x = 0; x <10; x++) retCon += " "+room[i][x];
        System.out.println(retCon);
    }

    void exec(){
        for(int i: new int[]{1, 2, 3}) lta(i-1);
    }
}