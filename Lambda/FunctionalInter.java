public interface Price
{
		public String price();
}



public class FunctionalInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = 200000;
        Price p = () -> {
            if (i > 10000) 
            {
                return "Accepted!";
            } else
                return "Not Accepted!";

        };
        System.out.println(p.price());
    }





	}

}
