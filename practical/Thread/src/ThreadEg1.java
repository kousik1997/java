
public class ThreadEg1 implements Runnable {
public void run() {
	System.out.println("Thread is running.....");
	
}
public static void main(String[] args) {
	ThreadEg1 t= new ThreadEg1();
	Thread m= new Thread(t);
	m.start();
}
}
