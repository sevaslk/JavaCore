package com.sevaslk.game;

class GameStatistic {
    private static int userWins = 0;
    private static int computerWins = 0;
    private static int draws = 0;

    static void setUserWins(int userWins) {
        GameStatistic.userWins = userWins;
    }

    static void setComputerWins(int computerWins) {
        GameStatistic.computerWins = computerWins;
    }

    static void setDraws(int draws) {
        GameStatistic.draws = draws;
    }

    static int getUserWins() {
        return userWins;
    }

    static int getComputerWins() {
        return computerWins;
    }

    static int getDraws() {
        return draws;
    }
}
