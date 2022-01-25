package inheritance;

public class Single_Inheritance {
	void eat(){
		System.out.println("eating...");
		}  
	}  
	class Dog extends Single_Inheritance{  
	void bark(){
		System.out.println("barking...");
	}  
	}  
	class TestInheritance{  
	public static void main(String args[]){  
	Dog d=new Dog();  
	d.bark();  
	d.eat();  
	}
	

}
