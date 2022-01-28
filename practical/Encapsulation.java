package Encapsulation;

 public class Encapsulation {

	private String name;
	private int roll;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
 class TestEncapsulation {
	public static void main(String[] args) {
		Encapsulation E=new Encapsulation();
		E.setName("Kousik");
		E.setRoll(7);
		E.setAge(25);
		System.out.println("My Name is: "+E.getName());
		System.out.println("My Roll is: "+E.getRoll());
		System.out.println("My Age is: "+E.getAge());

		
		
	
	}
}

 
 /* In the above program, the class Encapsulate is encapsulated as the variables are declared as private.
  *  The get methods like getAge() , getName() , getRoll() are set as public, 
  *  these methods are used to access these variables. The setter methods like setName(), setAge(), setRoll()
  *   are also declared as public and are used to set the values of the variables. 
  */