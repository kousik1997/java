package co.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AA {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your first value");
	int a=sc.nextInt();
	System.out.println("Enter your second value");
	int b=sc.nextInt();
	int c;
	try {
		c=a/b;
		System.out.println("result is "+c);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
		
	}
	catch(InputMismatchException e) {
		System.out.println(e);
	}
}
}
