import java.util.ArrayList;
import java.util.List;

public class ListToThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> n=(List<Integer>) new ArrayList<Integer>()
		{{
            add(6);
            add(8);
            add(3);
            add(9);
            add(6);
		} };
        
        Thread mylambda = new Thread(()->System.out.println(n));
        mylambda.run();
	}


	}


