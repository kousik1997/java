package inheritance;

public class Multilevel_Inheritance {
	void eat(){
		System.out.println("eating...");
		}  
	}  
	class Dog2 extends  Multilevel_Inheritance{  
	void bark(){
		System.out.println("barking...");
		}  
	}  
	class BabyDog extends Dog2{  
	void weep(){
		System.out.println("weeping...");
		}  
	}  
	class TestInheritance2{  
	public static void main(String args[]){  
	BabyDog d=new BabyDog();  
	d.weep();  
	d.bark();  
	d.eat();  
	}
}
