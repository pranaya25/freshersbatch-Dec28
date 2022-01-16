
public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sbr = new StringBuffer("String buffer");
sbr.append(",");
		sbr.append(",");
		sbr.append("the functionality of strings");
		System.out.println(sbr.toString());
		sbr.insert(5, "insert tesst");
		System.out.println(sbr);
		sbr.reverse();
		System.out.println(sbr);
	}

}
