
class TestRunnable implements Runnable {
	private String name;
	
	public TestRunnable(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(name);
	}
}
class TestThread extends Thread {
	private String name;
	
	public TestThread(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(name);
	}
}

public class RunTest {
	public static void main(String[] args) {
		TestRunnable tr= new TestRunnable("www");
		Thread t1 = new Thread(tr);
		t1.start();
		Thread t2 = new TestThread("qqq");
		t2.start();
	}
}
