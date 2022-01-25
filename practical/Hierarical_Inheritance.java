package inheritance;
public class Hierarical_Inheritance {
	public void add()
	  {
	  int x,y=30,z=10;
	  x=y+z;
	  System.out.println("Add="+x);
	  }  
	}
	class Subtraction extends Hierarical_Inheritance{
	 void sub()
	  {
	  int x,y=30,z=10;
	  x=y-z;
	  System.out.println("Sub="+x);
	  }  
	}	
	class Multiplication extends Hierarical_Inheritance{	
	 void multi()
	  {
	  int x,y=30,z=10;
	  x=y*z;
	  System.out.println("Multiply="+x);
	  }  
	}
	class Easy
	{
	 public static void main(String[] args)
	 {	  
	  Multiplication obj=new Multiplication();
	  	  obj.add();	  
	  obj.multi();
	 }
	}
