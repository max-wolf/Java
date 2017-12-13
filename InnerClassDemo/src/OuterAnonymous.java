
public class OuterAnonymous {
	public InnerClass getInnerClass(final int num, String str) {
		return new InnerClass() {
			int number = num + 3;
			public int getNumber() {
				return number;
			}
		};
	}
	public static void main(String[] args) {
		OuterAnonymous out = new OuterAnonymous();
		InnerClass inner = out.getInnerClass(2, "Patrick");
		System.out.println(inner.getNumber());
	}

}

interface InnerClass {
	int getNumber();
}