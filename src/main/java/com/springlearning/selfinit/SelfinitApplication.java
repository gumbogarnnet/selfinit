package com.springlearning.selfinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SelfinitApplication {
    
    //what are the beans
    //what are the dependencies of the bean
    //where to search forthe beans
            

	public static void main(String[] args) {
            binarySearchImp binarySearch = new binarySearchImp();
            int result = binarySearch.binarySearch(new int[]{3,4,5,7,1},3);
            System.out.println (result);
            
		SpringApplication.run(SelfinitApplication.class, args);
	}

}
