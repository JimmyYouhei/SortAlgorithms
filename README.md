# SortAlgorithms
##  Introduction 
This is my implementation for some common sort algorithms: bubble sort , insertion sort , selection sort , merge sort and quicksort
##	Version: 
-	It is written by using IntelliJ IDEA Community Edition 2019.1.3 x64
-	JDK version 11
##	How to install:
If you use IntelliJ IDEA use new -> Project From Version Control -> Git and paste https://github.com/JimmyYouhei/SortAlgorithms.git
##	How to use: 
-	Using the Main class to run any custom command (I have included some example command)
-	Use the NeededToBeSort10 class to quickly generate any test Array. Modify it if you like for different type of array 
-	SortAlgorithms interface is fully written with method: 
    -	bubbleSort(int[] ints): the bubble sort algorithms
    -	insertionSort(int[] ints): the insertion sort algorithms
    -	selectionSort(int[] ints): the selection sort algorithms
    -	mergeSortOwnStyle(int[] ints): the merge sort algorithms that use iteration instead of recursion (I was not able to understand recursion at the time I was writing the method)
    -	quicksort(int[] ints): the quicksort algorithms  
V.	Note:
-	Due to the class is written purely for learning purpose so very little Exception handle is expected 
-	Except for the quicksort , all other algorithms were written originally by me based on the description of the sort algorithms (of course there may be times I peeked at a small part of others' code)
-	The quicksort algorithm is very commonly used algorithms for sorting. However, it is regrettable that I was not able to write the code from the description due to poor understanding of recursion . As a result I had referenced and re-written most of my code from this guide: https://www.youtube.com/watch?v=Fiot5yuwPAg. Then I will not say I mastered the quick sort due to I faced many difficulties when trying to re-write the algorithm without looking back at the guide. I can say only I understood the algorithm’s principal and due to its importance, I have to include it here .
-	I knew that there are many other sort algorithms . However due to time constraint and I had to move on. As a result, only above algorithms are implemented. And others maybe added later 

VI.	License 
[MIT License](https://github.com/JimmyYouhei/SortAlgorithms/blob/master/LICENSE)

