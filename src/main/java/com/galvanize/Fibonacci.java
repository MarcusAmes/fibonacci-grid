package com.galvanize;

import java.util.ArrayList;

class Fibonacci {
    ArrayList<Integer> series(String[] ints) {
        int length = (Integer.parseInt( ints[0]) * Integer.parseInt( ints[1]));
        ArrayList<Integer> series = new ArrayList<>();
        series.add(0);
        int next = 1;
        int last = 1;
        int i = 0;
        while (i < length - 1) {
            series.add(last);
            int temp = next;
            next += last;
            last += temp - last;
            i++;
        }
        return series;
    }
}
