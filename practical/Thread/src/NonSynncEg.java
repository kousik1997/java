
class Print{
	void display(int num) {
		for(int i=1;i<=20;i=i+5) {
			System.out.println(num*i);
		try {
			Thread.sleep(500);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		}
	}
}
class MyThread1 extends Thread{
	Print p;
	 MyThread1(Print p) {
		p.display(5);
	}
}
class MyThread2 extends Thread{
	Print p;
	 MyThread2(Print p) {
		p.display(10);
	}
}

public class NonSynncEg {
public static void main(String[] args) {
	Print p = new Print();
	MyThread1 t1= new MyThread1(p);
	MyThread2 t2= new MyThread2(p);
	
	t1.start();
	t2.start();
}
}
