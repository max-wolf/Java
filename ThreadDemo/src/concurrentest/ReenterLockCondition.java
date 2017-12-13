package concurrentest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterLockCondition implements Runnable{
	public static ReentrantLock lock = new ReentrantLock();
	public static Condition condition = lock.newCondition();

	@Override
	public void run() {
		try {
			lock.lock();
			condition.await();
			System.out.println("thread is going on");
		} catch(InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new ReenterLockCondition());
		t.start();
		Thread.sleep(2000);
		lock.lock();
		condition.signal();
		lock.unlock();
	}

}
