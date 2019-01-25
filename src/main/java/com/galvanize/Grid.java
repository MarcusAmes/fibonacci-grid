package com.galvanize;

import java.util.ArrayList;

class Grid {
    String buildGrid(String[] args, ArrayList<Integer> series) {
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int widthOfBox = String.valueOf(series.get(series.size()-1)).length();
        StringBuilder grid = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int idx = 0; idx < width; idx++) {
                grid.append("+");
                for (int j = 0; j < widthOfBox; j++) {
                    grid.append("-");
                }
                if (idx == width - 1) {
                    grid.append("+\n");
                }
            }
            for (int idx = 0; idx < width; idx++) {
                grid.append("|");
                for (int j = 0; j < ((widthOfBox) - String.valueOf(series.get((i * width) + idx)).length()); j++) {
                    grid.append(" ");
                }
                grid.append(series.get((i * width) + idx));
                if(idx == width - 1) {
                    grid.append("|");
                }
            }
            grid.append("\n");
            if (i == height -1) {
                for (int idx = 0; idx < width; idx++) {
                    grid.append("+");
                    for (int j = 0; j < widthOfBox; j++) {
                        grid.append("-");
                    }
                    if (idx == width - 1) {
                        grid.append("+\n");
                    }
                }
            }
        }


        return grid.toString();
    }
}
