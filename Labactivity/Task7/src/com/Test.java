package com;

public class Test {

	public static void main(String[] args) {
		int temp;
		int ar[]= {8,2,6,7,3,5,4};
		for(int i=0; i<ar.length-1;i++) {
			for(int j=0; j<ar.length-1-i; j++) {
				if(ar[i]>ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for(int z=0;z<ar.length;z++) {
			System.out.println(ar[z]);
			}
}
}