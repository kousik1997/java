
public class ThreadSleepEg extends Thread{
public void run() {
	for(int i=1;i<=10;i++) {
		try{
			Thread.sleep(800);
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println(i);
	}
	
}
public static void main(String[] args) {
	ThreadSleepEg t= new ThreadSleepEg();
	ThreadSleepEg t1= new ThreadSleepEg();
	ThreadSleepEg t2= new ThreadSleepEg();
	t.start();
	t1.start();
	t2.start();
}

}
