import java.lang.annotation.*;  
import java.lang.reflect.*;  
  
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface Test
{  
	String str();  
}  
  
class Student
{  
	@Test(str="test Annotation")  
	public void testCase(){}  
}  

public class TestAnnotation {

	public static void main(String[] args)  throws Exception
	{

		Student s=new Student();  
		Method m=s.getClass().getMethod("testCase");  
	  
		Test ts=m.getAnnotation(Test.class);  
		System.out.println(ts.str()); 

	}

}

