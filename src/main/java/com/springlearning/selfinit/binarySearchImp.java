/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springlearning.selfinit;

/**
 *
 * @author garny
 */
@component
public class binarySearchImp {
    
    /**sorting an array
     * searching an array
     * returning result
     */
    public int binarySearch(int[]numbers,int numberToSearchFor){
       @autowired
        private SortAlgorithm sortAlgorithm;

    public binarySearchImp(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
        
        
        
        
        bubbleSortAlgorithm bubbleSort =new bubbleSortAlgorithm();
        int[] sortedNumbers = bubbleSort.sort(numbers);
        
        //implement search logic
        //bubble sort algorithm
        //quick sort algorithm
        return 3;
    }
    
}
