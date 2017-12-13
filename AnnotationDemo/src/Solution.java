
public class Solution {
	private static void Print() {
		System.out.println("pringt");
	}
	public static void main(String[] args) {
		String str1="hello";
		String str2="he"+new String("llo");
		System.err.println(str1 == str2);
	}
}
