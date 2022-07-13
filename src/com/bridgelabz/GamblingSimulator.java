package com.bridgelabz;

public class GamblingSimulator {
    public static void main(String[] args) {
        int totalWinningAmount=0;
        for (int day = 1; day <= 20; day++) {
            int dayStake=100;
            int winningAmount=0;
            System.out.println("#day"+day);
            while (dayStake<150 && dayStake>50){
                dayStake+=doBet(1);
            }
            winningAmount+=(dayStake-100);
            totalWinningAmount+=dayStake;
            System.out.println("resigned the game");
            day++;
        }
    }
    static int doBet(int bid){
        int random=(int)(Math.random()*10)%2;
        if (random == 1) {
            return 1;
        }else{
            return -1;
        }
    }
}
