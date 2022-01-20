import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, String> map = new HashMap<>(5);
	        map.put("pranaya", "5");
	        map.put("praditya", "6");
	        map.put("praveena", "1");
	        map.put("prathima", "2");
	        map.put("praduman", "4");
	        String s = map.entrySet().stream().map((entry) ->
	                        "" + entry.getKey() + " \"" + entry.getValue().replaceAll("\"", "\\\\\"") + "\"")
	                .collect(Collectors.joining(" "));
	        System.out.println(s);

	    }
	

	}


