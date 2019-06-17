package com.jimmyyouhei.sort;

public class Main {

    public static void main(String[] args) {


        NeededToBeSort10 test = new NeededToBeSort10();
        test.print();

        SortAlgorithms.selectionSort(test.getIntArray());

        test.print();


    }
}
