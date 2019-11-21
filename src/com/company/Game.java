package com.company;

import java.util.*;

public class Game {

    static Symbol[] symbols_arr = {Symbol.X, Symbol.O, Symbol.X, Symbol.O, Symbol.X, Symbol.O, Symbol.X, Symbol.O, Symbol.X};
    static List<Symbol> symbols_list = Arrays.asList(symbols_arr);
    public static Queue<Symbol> symbols = new LinkedList<Symbol>(symbols_list);
    static Queue<Symbol> symbols_q = new LinkedList<Symbol>();

    public static Symbol[][] playingField = new Symbol[3][3];

    static {
        for (int i = 0; i < 5; i++) {
            symbols_q.add(Symbol.X);
            symbols_q.add(Symbol.O);
        }
    }

    public static void start() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите координаты: ");
            int i = scan.nextInt();
            int j = scan.nextInt();
            playingField[i][j] = symbols_q.poll();
            PlayingFieldPrinter.playingFieldPrinter(playingField);
        }
    }
}
