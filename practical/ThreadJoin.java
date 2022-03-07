
public class ThreadJoin extends Thread {
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
		ThreadJoin t= new ThreadJoin();
		ThreadJoin t1= new ThreadJoin();
		ThreadJoin t2= new ThreadJoin();
		t.start();
		
		try{
			t.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t1.start();
		t2.start();
	}

}


