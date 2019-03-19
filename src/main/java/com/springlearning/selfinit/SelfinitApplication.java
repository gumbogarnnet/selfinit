package com.springlearning.selfinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SelfinitApplication {
    
    //what are the beans
    //what are the dependencies of the bean
    //where to search forthe beans
            

	public static void main(String[] args) {
            
            //binarySearchImp binarySearch = new binarySearchImp((SortAlgorithm) new bubbleSortAlgorithm());
           
           
           
            
		ApplicationContext applicationContext = SpringApplication.run(SelfinitApplication.class, args);
                
                binarySearchImp binarySearch = applicationContext.getBean(binarySearchImp.class);
                
                 int result = binarySearch.binarySearch(new int[]{3,4,5,7,1},3);
                 
                 System.out.println(result);
	}

}
