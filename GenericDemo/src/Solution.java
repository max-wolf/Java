
public class Solution {
	public static void main(String[] args) {
		SonPair pair = new SonPair("eee", "www");
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());
		String mid = ArrayAlg.getMiddle("eew", "qw", "oi");
		System.out.println(mid);
	}
}

class Pair<T> {
	private T first;
	private T second;
	
	public Pair() {
		first = null;
		second = null;
	}
	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public T getSecond() {
		return second;
	}
	public void setSecond(T second) {
		this.second = second;
	}
}

class SonPair extends Pair<String> {
	private String first;
	private String second;
	
	public SonPair(String first, String second) {
		this.first = first;
		this.second = second;
	}
	
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
}

class ArrayAlg {
	public static <T> T getMiddle(T... a) {
		return a[a.length/2];
	}
}
