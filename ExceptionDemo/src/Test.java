
public class Test {
	public static void main(String[] args) throws NumberFormatException {
		/*try {  
            f();  
        } catch (NumberFormatException e) {  
            //System.err.println("���������Ͳ���ת����");  
            e.printStackTrace();  
        }*/
		f();
	}
	
	public static void f() throws NumberFormatException {
		String s = "abc";
		System.out.println(Double.parseDouble(s));
	}
}
