package com.jimmyyouhei.sort;

import java.util.concurrent.ThreadLocalRandom;

// class to quickly generate int array to test
public class NeededToBeSort10 {

    // int array contain inside the class
    private int[] intArray = new int[10];

    // getter and setter for quick access
    public int[] getIntArray() {
        return intArray;
    }
    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    // constructor to quickly generate array
    public NeededToBeSort10() {

        for (int i =0; i<10 ; i++){

            int randomNumber = ThreadLocalRandom.current().nextInt(0, 20 + 1);

            this.intArray[i] = randomNumber;

        }
    }

    // print to print array element for test
    public void print(){

        System.out.println("all elements are:");

        for(int i: intArray){
            System.out.println(i);
        }

    }

}
