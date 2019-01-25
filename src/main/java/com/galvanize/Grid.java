package com.galvanize;

import java.util.ArrayList;

class Grid {
    String buildGrid(String[] args, ArrayList<Integer> series) {
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int widthOfBox = String.valueOf(series.get(series.size()-1)).length();
        StringBuilder grid = new StringBuilder();
        StringBuilder dash = new StringBuilder();
        StringBuilder line = new StringBuilder();
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < widthOfBox; i++) {
            dash.append("-");
            space.append(" ");
        }
        for (int i = 0; i < width; i++) {
            line.append("+")
                .append(dash);
            if (i == width - 1) {
                line.append("+\n");
            }
        }

        for (int i = 0; i < height; i++) {
            grid.append(line);
            for (int idx = 0; idx < width; idx++) {
                grid.append("|");
                grid.append(space.substring(0, widthOfBox - String.valueOf(series.get((i * width) + idx)).length()));
                grid.append(series.get((i * width) + idx));
                if(idx == width - 1) {
                    grid.append("|");
                }
            }
            grid.append("\n");
            if (i == height -1) {
                grid.append(line);
            }
        }


        return grid.toString();
    }
}
