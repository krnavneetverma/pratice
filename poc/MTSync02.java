 
public class MTSync02 {
	
	private int i = 0;
	public synchronized void inc()
	{
		i++;
	}
	public static void main(String[] args) throws InterruptedException {
		MTSync02 mtObj = new MTSync02();
		mtObj.doWork();
	}
	
	public void doWork() throws InterruptedException
	{
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int j = 0; j < 5; j++) {
					inc();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int j = 0; j < 5; j++) {
					inc();
				}
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(i);
	}
}
