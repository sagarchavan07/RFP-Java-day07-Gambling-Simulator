package com.bridgelabz;

import java.util.Scanner;

public class GamblingSimulator {
    static int totalWinningAmount=0;
    static int winDaysCount=0;
    static int looseDaysCount=0;
    static final int MAX_DAYS=20;
    static final int EVERY_DAY_STAKE=100;

    public static void main(String[] args) {

        Gambler();
        if (totalWinningAmount > 0) {
            System.out.println("you Won ! ");
            System.out.print("continue playing (y/n) : ");
            Scanner scanner=new Scanner(System.in);
            if (scanner.next().equalsIgnoreCase("y")) {
                Gambler();
            }
        }else if (totalWinningAmount < 0){
            System.out.println("you lost the game");
        }else {
            System.out.println("no win or loss");
        }
    }

    static void Gambler(){

        for (int day = 1; day <= MAX_DAYS; day++) {
            int dayStake=EVERY_DAY_STAKE;
            int winningAmount;
            System.out.println("#day"+day);
            while (dayStake<150 && dayStake>50){
                dayStake+=doBet(1);
            }
            winningAmount=(dayStake-100);
            System.out.println("winning amount = "+winningAmount);
            if (winningAmount > 0) {
                totalWinningAmount=totalWinningAmount+winningAmount;
                winDaysCount++;
            }else {
                looseDaysCount++;
                totalWinningAmount=totalWinningAmount+winningAmount;
            }
        }

        System.out.println("\ntotal winning amount "+totalWinningAmount);
        System.out.println("won days = "+winDaysCount);
        System.out.println("loose days = "+looseDaysCount);

    }
    static int doBet(int bidPrice){
        int random=(int)(Math.random()*10)%2;
        if (random == 1) {
            return +bidPrice;
        }else{
            return -bidPrice;
        }
    }
}
