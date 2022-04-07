package com;

public class Test {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[]= {6,7,8,9,4};
	
	int sum1=0;
	int sum2=0;
	int mul;
	
	for(int i=0;i<a.length;i++) {
		sum1+=a[i];
    }
	for(int j=0;j<b.length;j++) {
		sum2+=a[j];
	}

       mul=sum1*sum2;
       System.out.println("multiply two matrices : "+mul);
	
}
}