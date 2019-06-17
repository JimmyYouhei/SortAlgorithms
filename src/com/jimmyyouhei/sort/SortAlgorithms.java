package com.jimmyyouhei.sort;

import java.util.concurrent.ThreadLocalRandom;

public interface SortAlgorithms {

    // bubble Sort algorithm
    static void bubbleSort (int[] ints){
        // boolean for the while loop
        boolean keepRunning = true;
        // loop to swap
        while (keepRunning){

            // boolean to know when the sort is completed
            boolean needToSwap = false;
            // the main swap method of the algorithm
            for (int i =0 ; i< ints.length-1; i++){

                // swap to the right if the left value is bigger
                if (ints[i] > ints[i+1]){

                    int temporaryStorage = ints[i];

                    ints[i] = ints[i+1];

                    ints[i+1] = temporaryStorage;

                    // boolean that tell the sort is still in complete if true
                    needToSwap = true;

                }
            }

            // if a round of comparision and found nothing to swap meaning the sort is complete
            if (needToSwap == false){
                keepRunning = false;

                break;
            }

        }

    }


    // insertionSort algorithms
    static void insertionSort(int[] ints){

        // loop inside the array
        for (int i = 1; i < ints.length;i++){

            // if the value of the right is  lower than the left
            if (ints[i]< ints[i-1]){

                // swap the 2 value and sort the array from the left to the index of i
                int temporary = ints[i];
                ints[i] = ints[i-1];

                while (i-2 >=0 && ints[i-2]>temporary){

                    ints[i-1]= ints[i-2];

                    i--;

                }
                ints[i-1] = temporary;

            }

        }


    }


    // selection sort algorithms
    static void selectionSort(int[] ints){

        // find the min value for each time
        for (int i = 0 ; i< ints.length ; i++){
            int smallestNumber = Integer.MAX_VALUE;
            int smallestNumberPosition = -1;

            for (int j = i ; j<ints.length ; j++){

                if (ints[j] < smallestNumber){
                    smallestNumber = ints[j];
                    smallestNumberPosition = j;
                }

            }

            // if the smallest number is found swap it to the proper left most position each time the loop is taken
            if (smallestNumberPosition >= 0){

                int tempory = smallestNumber;
                ints[smallestNumberPosition] = ints[i];
                ints[i] = smallestNumber;

            }

        }



    }



    // Merge Sort using iteration instead of Recursion like normally found on the internet
    static void mergeSortOwnStyle(int[] ints){

        // int to calculate the number of loop
        int numberOfMergeTime ;

        // first the megeSize will be 2 than double and so on
        int mergeSize = 2;

        // adjust the number of loop depend on the total number of the array (odd or even number)
        if (ints.length %2 ==0){
            numberOfMergeTime = ints.length/2 -1;
        } else {
            numberOfMergeTime = ints.length/2;
        }

        // loop by the times above
        for (int i = 0; i< numberOfMergeTime; i++){

            // if mergeSize < array length meaning the merge is in complete
            if (mergeSize< ints.length){
                // Merge the elements in the array to sub array or merge sub array into bigger sub array
                for (int j = 0 ; j < ints.length/mergeSize ; j++){
                    int[] temporaryArray = new int[mergeSize];

                    for (int k = 0 ; k< mergeSize ; k++){

                        temporaryArray[k] = ints[j * mergeSize + k];

                    }

                    // use the insertion sort above to sort each sub array
                    SortAlgorithms.insertionSort(temporaryArray);

                    //  each time get back value sub array to the main array
                    for (int k = 0 ; k< mergeSize ; k++){

                        ints[j * mergeSize + k] = temporaryArray[k];

                    }

                }
                // if the merge is complete then use insertion sort to sort any unsorted parts
            } else {
                SortAlgorithms.insertionSort(ints);
            }

            // each time double the merge Size by 2
            mergeSize *= 2;
        }

    }

    /*
     the quick sort algorithms
     it is regrettable that I was not able to write this algorithm by my self but reference to the code here:
     https://www.youtube.com/watch?v=Fiot5yuwPAg
     */
    static void quickSort (int[] ints){

        // method to call tail Recursion
        quickSort(ints,0, ints.length-1);

    }

    // tail Recusrion of the quick Sort
    private static void quickSort (int[] ints , int start , int end){

        // if there is at least a element
        if (start < end + 1){
            // get pivot and partition
            int pivot = partition(ints , start , end);

            // Recusrion and quick sort left
            quickSort(ints , start ,pivot-1);
            // Recursion and quicksort right
            quickSort(ints , pivot +1 , end);
        }

    }

    // main method to sort all lower number to the left and all higher number to the right of the pivot number
    private static int partition(int[] ints ,int start , int end){

        //get random pivot and swap with the left most index
        swap(ints , start , getPivot(start ,end));

        // start to compare everything to the right of left most index (now exclude the swapped pivot position)
        int border = start +1 ;

        // method compare and swap other number with the pivot
        for (int i = border; i<= end ; i++){
            if (ints[i] < ints[start]){
                swap(ints , i , border++);
            }
        }

        // swap the pivot to its right location
        swap(ints , start , border -1);

        // return the pivot index
        return border -1;

    }

    // swap method for 2 element inside the array
    private static void swap (int[] ints , int index1 , int index2){
        int temp = ints[index1];
        ints[index1] = ints[index2];
        ints[index2] = temp;
    }

    // get a random index position
    private static int getPivot(int start , int end){

        return ThreadLocalRandom.current().nextInt(start , end +1);

    }

}
