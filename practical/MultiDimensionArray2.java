package com.AutoBoxing;

public class MultiDimensionArray2 {
public static void main(String[] args) {
int[][] multidimensionalArray = { {1,2,3},{4,5,6}, {7,8,9} };
    
    for(int i = 0 ; i <3 ; i++){
       //row
       for(int j = 0 ; j <3; j++){
          System.out.print(multidimensionalArray[i][j] + " ");
       }
       System.out.println();
    }

}
}
