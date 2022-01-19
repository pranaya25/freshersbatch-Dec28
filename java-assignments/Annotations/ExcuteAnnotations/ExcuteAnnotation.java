package org.generics.app;

import java.lang.reflect.Method;

public class ExcuteAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcuteAnnotationExam ta = new ExcuteAnnotationExam();
        Method[] methods = ta.getClass().getMethods();

        for (Method method : methods) {
            Execute exe = method.getAnnotation(Execute.class);
            if (exe != null) {
                try {
                    method.invoke(ta);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

	}

}
