package com.jjhellberg;

public class Main {

    public static void main(String[] args) {
        int[] input = {10,3,15,10,5,15,5,15,9,2,5,8,5,2,3,6};
        Logic logic = new Logic();
        System.out.println(logic.getCycles(input).getKey());
        System.out.println(logic.getCycles(input).getKey());
    }
}
