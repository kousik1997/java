
public class ThreadEg extends Thread{
public void run() {
	System.out.println("Thread -- its my thread");
}
public static void main(String[] args) {
	ThreadEg t =new ThreadEg();
	t.start();
}
}
