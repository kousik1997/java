 
class Odd extends Thread{
	int maxoddno;
	SharedOddEven sharedResource;
	
	Odd(int number, SharedOddEven sharedResource){
		this.maxoddno = number;
		this.sharedResource = sharedResource;
	}
	
	public void run() {
		int minoddNum = 1;
		try {
			while (minoddNum <= maxoddno) {
				sharedResource.printOddNumber(minoddNum);
				minoddNum = minoddNum + 2;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}

class Even extends Thread{
	int maxevenno;
	SharedOddEven sharedResource;
	
	Even(int number, SharedOddEven sharedResource){
		this.maxevenno = number;
		this.sharedResource = sharedResource;
	}
	
	public void run() {
		int minevenNum = 2;
		try {
			while (minevenNum <= maxevenno) {
				sharedResource.printEvenNumber(minevenNum);
				minevenNum = minevenNum + 2;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class OddEvenThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedOddEven sharedResource = new SharedOddEven();
		Odd oddNum = new Odd(100, sharedResource);
		Even evenNum = new Even(100, sharedResource);
		oddNum.start();
		evenNum.start();
	}

}
