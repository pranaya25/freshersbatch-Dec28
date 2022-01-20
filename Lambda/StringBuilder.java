import java.util.List;
import java.util.List;
import java.util.function.Consumer;


public class StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var word = List.of("pranaya", "prannu", "dolly", "pink", "red");
		word.forEach(new Consumer<String>()
				{
public void accept (String s)
{
StringBuilder s1 = new StringBuilder();
for (String st : s.split(" "))
{
	s1.append(st.charAt(0));
}
System.out.println(s1.toString());
}
});
}

	protected void append(char charAt) {
		// TODO Auto-generated method stub
		
	}


		
	}

	


