package com.AutoBoxing;

import java.util.Arrays;
import java.util.Collections;

public class koko {
	public static void main(String[] args) {
		
		
		String [] array = {"Print Mango","apple","grapes","papaya", "pineapple","banana","orange in descending order"};   
		// sorts array[] in descending order   
		Arrays.sort(array, Collections.reverseOrder());   
		System.out.println("Array elements in descending order: " +Arrays.toString(array));
	}
	}

