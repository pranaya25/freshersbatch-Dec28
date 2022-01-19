
package org.generics.app;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface Execute 
{

	int Sequence();

}

public class ExcuteAnnotationExam {
	@Execute(Sequence=2)
    public void method1() 
    {
        System.out.println("This is method 1");
    }

    @Execute(Sequence=1)
    public void method2() 
    {
        System.out.println("This is method 2");
    }
    
    @Execute(Sequence=3)
    public void method3() 
    {
        System.out.println("This is method 3");
    }

}


