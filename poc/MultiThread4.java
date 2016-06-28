import java.util.Scanner;

//Thread synchronization
public class MultiThread4 {

	public static void main(String[] args) {
		Processor p1 = new Processor();
		p1.start();
		new Scanner(System.in).nextLine();
		p1.shutdown();
	}

}

class Processor extends Thread {
	private volatile boolean running = true;
	@Override
	public void run() {
		while (running) {
			System.out.println("hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void shutdown()
	{
		running=false;
	}
}