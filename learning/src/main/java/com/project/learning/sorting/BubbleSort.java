package com.project.learning.sorting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortingAlgorithm{
	public int[] sorting(int arr[])  {
      //		logic
		return arr;
	}
}
