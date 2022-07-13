package com.bridgelabz;

public class GamblingSimulator {
    public static void main(String[] args) {
        for (int day = 1; day <= 20; day++) {
            int dayStake=100;
            System.out.println("#day"+day);
            dayStake+=doBet(1);
            day++;
        }
    }
    static int doBet(int bid){
        int random=(int)(Math.random()*10)%2;
        if (random == 1) {
            System.out.println("you won 1$");
            return 1;
        }else{
            System.out.println("you loose 1$");
            return -1;
        }
    }
}
