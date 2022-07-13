package com.bridgelabz;

import java.util.Scanner;

public class GamblingSimulator {
    public static void main(String[] args) {
        int totalWinningAmount=0;
        int winDaysCount=0;
        int looseDaysCount=0;
        for (int day = 1; day <= 20; day++) {
            int dayStake=100;
            int winningAmount=0;
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
        if (totalWinningAmount > 0) {
            System.out.println("you Won ! ");
            System.out.println("continue playing (y/n) ");
            Scanner scanner=new Scanner(System.in);
            if (scanner.next().charAt(0)=='y') {
                main(null);
            }
        }else if (totalWinningAmount < 0){
            System.out.println("you lost the game");
        }else {
            System.out.println("no win or loss");
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
