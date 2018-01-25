package com.jjhellberg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logic {
    public int getCycles(int[] banks) {
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

        return redistributions;
    }


    private int[] redistribute(int[] banks, int topBank) {
        int size = banks.length;
        int val = banks[topBank];
        banks[topBank] = 0;

        for(int i = topBank + 1; i <= topBank + val; i++) {
            banks[i % size]++;
        }
        return banks;
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
