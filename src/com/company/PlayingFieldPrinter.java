package com.company;

public class PlayingFieldPrinter {
    public static void playingFieldPrinter(Symbol[][] playingField) {

        for (int i = 0; i < playingField.length; i++) {
            System.out.print("|");
            for (int j = 0; j < playingField[0].length; j++) {
                if (playingField[i][j] != null) {
                    System.out.print(playingField[i][j] + "|");
                } else {
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
    }
}

