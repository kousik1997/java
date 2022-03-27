
public class Mythread extends Thread{
public void run() {
	System.out.println("User or Daemon Thread");

}
public static void main(String[] args) {
	Mythread t= new Mythread();
	 t.setDaemon(true);
	t.start();
	System.out.println("Main Thread");
    
	System.out.println(t.getName() + " "+ t.isDaemon());
	
}
}
