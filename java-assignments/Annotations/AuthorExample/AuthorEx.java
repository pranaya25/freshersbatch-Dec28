
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface info 
{
  int  ID();
  String name();
  String superviser();
  String date();
  String time();
  int version();
}

public class AuthorEx {

	public static void main(String[] args) throws Exception
		// TODO Auto-generated method stub
	{
		ExampleAuthor obj=new ExampleAuthor();
	Method m=obj.getClass().getMethod("display");
	info in=m.getAnnotation(info.class);
	
	System.out.println(in.ID());
	System.out.println(in.name());
	System.out.println(in.superviser());
	System.out.println(in.date());
	System.out.println(in.time());
	System.out.println(in.version());
	}
}

