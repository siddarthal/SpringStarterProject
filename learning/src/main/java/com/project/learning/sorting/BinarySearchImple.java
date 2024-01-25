package com.project.learning.sorting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImple {
	@Autowired
	SortingAlgorithm sortAlgo_;
//public void setSortAlgo_(SortingAlgorithm sortAlgo_) {
//		this.sortAlgo_ = sortAlgo_;
//	}

	//	public BinarySearchImple(SortingAlgorithm sortAlgo_) {
//		this.sortAlgo_=sortAlgo_;
//	}
	public String binarysearch(int arr[],int key) {
		
	
//		BubbleSort bubbleSort = new BubbleSort();
		 int sortedarray[]=sortAlgo_
				 .sorting(arr);
			//sorting algorithm
//		  BUBBLESORT
			// search logic
		System.out.println(sortAlgo_);
		return "2";
	}
}
