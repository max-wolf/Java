
public class Test {
	public static void main(String[] args) throws NumberFormatException {
		/*try {  
            f();  
        } catch (NumberFormatException e) {  
            //System.err.println("非数据类型不能转换。");  
            e.printStackTrace();  
        }*/
		f();
	}
	
	public static void f() throws NumberFormatException {
		String s = "abc";
		System.out.println(Double.parseDouble(s));
	}
}
