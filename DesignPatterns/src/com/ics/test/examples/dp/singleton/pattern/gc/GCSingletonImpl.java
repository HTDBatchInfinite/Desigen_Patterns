package com.ics.test.examples.dp.singleton.pattern.gc;

import java.lang.reflect.Method;

public class GCSingletonImpl {

	public static void main(String[] args) throws Exception {

		// 1
		GCSingleton singletonClass = GCSingleton.getInstance();

		System.out.println("singletonClass1:::" + singletonClass + " " + singletonClass.hashCode());

		// 2
		GCSingleton singletonClass1 = GCSingleton.getInstance();

		System.out.println("singletonClass2:::" + singletonClass1 + " " + singletonClass1.hashCode());

		{
		ClassLoader cl1 = new ClassLoader() {
		};
		Class class1 = cl1.loadClass(GCSingleton.class.getName());
		Method classMethod = class1.getDeclaredMethod("getInstance", new Class[] {});
		Object singleton = classMethod.invoke(null, new Object[] {});
		System.out.println(singleton.hashCode());
		}
		
		ClassLoader cl1 = new ClassLoader() {
		};
		Class class1 = cl1.loadClass(GCSingleton.class.getName());
		Method classMethod =
		    class1.getDeclaredMethod("getInstance", new Class[] { });
		Object singleton = classMethod.invoke(null, new Object[] { } );
		System.out.println(singleton.hashCode());
	}

}
