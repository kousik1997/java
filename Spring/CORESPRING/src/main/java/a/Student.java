package a;

public class Student {
	private int id;
	private String name;

	public Student() {
		super();

		System.out.println("0 arg cons...");
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("2 arg cons...");
	}

	public int getId() {
		System.out.println("got the id");
		return id;
	}

	public void setId(int id) {
		System.out.println("-------setter of id called------");
		this.id = id;
	}

	public String getName() {
		System.out.println("got the name");
		return name;
	}

	public void setName(String name) {
		System.out.println("-------setter of name called------");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}