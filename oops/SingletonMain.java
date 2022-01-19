
public class SingletonMain {
	private static SingletonMain instance = null;
	   private SingletonMain() {
	      // Exists only to defeat instantiation.
	   }

	   public static SingletonMain getInstance() {
	      if(instance == null) {
	         instance = new SingletonMain();
	      }
	      return instance;
	   }
	   public void getcontactdetails()
	   {
		   System.out.println("Contact details");
	   }
}
