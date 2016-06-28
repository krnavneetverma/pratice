import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MTSyncBlockLock {

	private Random random = new Random();
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	public void stage1(){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list1.add(random.nextInt(100));
	}
	public void stage2(){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(random.nextInt(100));
	}
	
	public void process(){
		for (int i = 0; i < 100; i++) {
			stage1();
			stage2();
		}
	}
	public void main1(String[] args) {
		System.out.println("starting...");
		long start = System.currentTimeMillis();
		process();
		long end = System.currentTimeMillis();
		System.out.println("time taken...:"+(end-start));
		System.out.println("l1:"+list1.size()+" l2:"+list2.size());
	}
	public static void main(String[] args) {
		MTSyncBlockLock mt = new MTSyncBlockLock();
		mt.main1(null);;
	}
}
