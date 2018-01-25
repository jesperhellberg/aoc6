package com.jjhellberg;

import javafx.util.Pair;

import java.util.*;

public class Logic {
    public Pair<Integer, int[]> getCycles(int[] banks) {
        List<int[]> oldBanks = new ArrayList<>();
        int topBank;
        boolean matchFound = false;
        int redistributions = 0;

        do {
            redistributions++;
            oldBanks.add(Arrays.copyOf(banks, banks.length));

            topBank = getTopBank(banks);
            redistribute(banks, topBank);

            for (int[] oldBank : oldBanks) {
                if (Arrays.equals(oldBank, banks)) {
                    matchFound = true;
                    break;
                }
            }

        } while (!matchFound);

        return new Pair<>(redistributions, banks);
    }


    private void redistribute(int[] banks, int topBank) {
        int size = banks.length;
        int val = banks[topBank];
        banks[topBank] = 0;

        for(int i = topBank + 1; i <= topBank + val; i++) {
            banks[i % size]++;
        }
    }


    private int getTopBank(int[] banks) {
        int topBank = 0;

        for (int i = 1; i < banks.length; i++) {
            if (banks[i] > banks[topBank]) {
                topBank = i;
            }
        }
        return topBank;
    }

}
