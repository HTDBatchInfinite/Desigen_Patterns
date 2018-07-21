package com.ics.test.examples.dp.singleton.pattern;

import java.lang.reflect.Constructor;

public class SingletonClassForNameExample {

	public static void main(String[] args) throws Exception {

		// 1
		SingletonClass singletonClass = SingletonClass.getInstance();

		System.out.println("singletonClass1:::" + singletonClass + " " + singletonClass.hashCode());

		// 2
		SingletonClass singletonClass1 = SingletonClass.getInstance();

		System.out.println("singletonClass2:::" + singletonClass1 + " " + singletonClass1.hashCode());

		Class clas = Class.forName("com.ics.test.examples.dp.singleton.pattern.SingletonClass");
		Constructor<SingletonClass> consttructor = clas.getDeclaredConstructor();
		consttructor.setAccessible(true);
		SingletonClass singleton = consttructor.newInstance();

		System.out.println("Class For Name:" + singleton + " " + singleton.hashCode());
	}

}
