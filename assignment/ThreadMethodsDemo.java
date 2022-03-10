
public class ThreadMethodsDemo extends Thread{
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("ThreadMethodsDemo");
			try {
				System.out.println("thread is going to sleep");
				ThreadMethodsDemo.sleep(800);
				System.out.println("thread wake up");
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
				
			}
			}
		}
	public static void main(String[] args) throws InterruptedException{
		ThreadMethodsDemo d= new ThreadMethodsDemo();
		
		System.out.println("getstate1 "+d.getState());
		d.start();
		System.out.println("getstate2 "+d.getState());
		System.out.println("getstate3 "+d.getState());
		System.out.println("getstate4 "+d.getState());
		System.out.println("getstate5 "+d.getState());
		
	}
	}


