/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springlearning.selfinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author garny
 */
@Component
public class binarySearchImp {
    
    /**sorting an array
     * searching an array
     * returning result
     */
    @Autowired
    private final SortAlgorithm sortAlgorithm;

    public binarySearchImp(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }
    
    
    
    
    public int binarySearch(int[]numbers,int numberToSearchFor){
        
        
            
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        
        System.out.println(sortAlgorithm);
        
        //implement search logic
        //bubble sort algorithm
        //quick sort algorithm
        return 3;
    }

}
