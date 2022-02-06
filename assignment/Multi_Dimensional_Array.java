package com.AutoBoxing;
import java.util.Scanner;
public class Multi_Dimensional_Array {
	public static void main(String[] args) {
	
		
		int [][]a=new int[3][2];
		System.out.println("Your array Size is[3][2]");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter inner array value");
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("   Array["+i+"]["+j+"]= "+a[i][j]);
			}
			System.out.println();
		}
}
}
