package com.Ccc;

public class PracticalHashCode {
	public static void main(String[] args) {
		EqualsAndHashCodeMethod g1 =new EqualsAndHashCodeMethod("a",1);
		EqualsAndHashCodeMethod g2 =new EqualsAndHashCodeMethod("b",2);
		if(g1.hashCode() == g2.hashCode())
        {
  
            if(g1.equals(g2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");
      
        }
        else
        System.out.println("Both Objects are not equal. ");


	}
}
