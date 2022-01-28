package Encapsulation;

public class Employee {
	private String name,address;
	private int age;

	
public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

}
class Test{
	public static void main(String[] args) {
		Employee E= new Employee();
		E.setName("Koushik Mondal");
		E.setAge(25);
		E.setAddress("Dankuni");
		System.out.println("Name :"+E.getName());
		System.out.println("Age :"+E.getAge());
		System.out.println("Address :"+E.getAddress());
	}
	
}


