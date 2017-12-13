
public class PriorityDemo {
	public static class HighPriority extends Thread {
		static int count = 0;
		public void run() {
			while(true) {
				synchronized(PriorityDemo.class) {
					count++;
					if(count>100000) {
						System.out.println("HighPriority is complete");
						break;
					}
				}
			}
		}
	}
	public static class LowPriority extends Thread {
		static int count = 0;
		public void run() {
			while(true) {
				synchronized(PriorityDemo.class) {
					count++;
					if(count>100000) {
						System.out.println("LowPriority is complete");
						break;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Thread high = new HighPriority();
		Thread low = new LowPriority();
		high.setPriority(Thread.MAX_PRIORITY);
		low.setPriority(Thread.MIN_PRIORITY);
		low.start();
		high.start();
	}

}
