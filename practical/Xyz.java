package Int;

public class Xyz {

	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
class Abc{
	 public static void main(String[] args) {
		Xyz x= new Xyz();
		x.setId(1);
		System.out.println(x.getId());
		x.setName("Kousik Mondal");
		System.out.println(x.getName());
	}
}
