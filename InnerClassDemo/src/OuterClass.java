
public class OuterClass {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("OuterClass ...");
	}
	
	public class InnerClass {
		public InnerClass() {
			name = "Patrick";
			age = 11;
		}
		
		public void display() {
			System.out.println("name: " + getName() + " ; age: " + getAge());
		}
		
		public OuterClass getOuterClass() {
			return OuterClass.this;
		}
	}

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.display();
		innerClass.getOuterClass().display();
	}

}
