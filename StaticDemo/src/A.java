
public class A {
	public static void main(String[] args) {
		B b = new B();
		b.setA(4);
		System.out.println(b.getA());
		C c = new C();
		System.out.println(c.c);
		c.run();
	}

}

class B {
	private int a;
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	B() {
		a = 1;
	}
	
	public void run() {
		System.out.println("run");
	}
}

class C extends B {
	int c = getA();
}