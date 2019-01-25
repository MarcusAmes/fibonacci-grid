package com.galvanize;

import java.util.ArrayList;

public class GridCLI {
    public static void main(String[] args) {
        ArgsChecker argsChecker = new ArgsChecker();
        argsChecker.check(args);
        Fibonacci fibonacci = new Fibonacci();
        ArrayList<Integer> series = fibonacci.series(args);
        Grid grid = new Grid();
        System.out.println(grid.buildGrid(args, series));
    }
}
