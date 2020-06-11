package com.sevaslk.game;

class Field {
    static int userWins = 0;
    static int computerWins = 0;
    static int draws = 0;

    static void scorePrint() {
        System.out.println("Your wins: " + userWins);
        System.out.println("Your wins: " + computerWins);
        System.out.println("Draws" + draws);
    }
}
