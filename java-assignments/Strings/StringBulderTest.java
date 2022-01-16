
public class StringBulderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbr = new StringBuilder("String buffer");
		sbr.append(",");
				sbr.append(",");
				sbr.append("the functionality of strings");
				System.out.println(sbr.toString());
				sbr.insert(7, "insert tesst");
				System.out.println(sbr);
				sbr.reverse();
				System.out.println(sbr);
			
	}

}
