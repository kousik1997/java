package Int;

public class Shape {

	void display() {
		System.out.println("Inside display");
	}
}
	class Rectangle extends Shape{
		void area() {
			System.out.println("Inside area");
		}
	}
	class Cube extends Rectangle{
		void volume() {
			System.out.println("Inside volume");
		}
	}
		
 class tester extends Cube{
	 public static void main(String[] args) {
		tester c= new tester();
		c.volume();
		c.area();
		c.display(); 	    
		
	}
 }

