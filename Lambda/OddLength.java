import java.util.ArrayList;
import java.util.List;

public class OddLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = new ArrayList<>();
        words.add("pranaya");
        words.add("Praditya");
        words.add("prathima");
        words.add("praveena");
        words.add("pradhuman");
        words.add("prannu");
        
        words.removeIf(w-> w.length()%2!=0);
        words.forEach(System.out::println);
    }



	}


