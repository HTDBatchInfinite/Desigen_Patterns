package com.ics.test.examples.dp.singleton.pattern.avoidreflection;

import java.lang.reflect.Constructor;

public class AvoidSingletonReflection {

	public static void main(String[] args) throws Exception {

		// 1
		SingletonReflectionClass singletonClass = SingletonReflectionClass.getInstance();

		System.out.println("singletonClass1:::" + singletonClass + " " + singletonClass.hashCode());

		// 2
		SingletonReflectionClass singletonClass1 = SingletonReflectionClass.getInstance();

		System.out.println("singletonClass2:::" + singletonClass1 + " " + singletonClass1.hashCode());

		Class clas = Class.forName("com.ics.test.examples.dp.singleton.pattern.avoidreflection.SingletonReflectionClass");
		Constructor<SingletonReflectionClass> consttructor = clas.getDeclaredConstructor();
		consttructor.setAccessible(true);
		SingletonReflectionClass singleton = consttructor.newInstance();

		System.out.println("Class For Name:" + singleton + " " + singleton.hashCode());
		
		/*Class clas1 = Class.forName("com.ics.test.examples.dp.singleton.pattern.avoidreflection.SingletonReflectionClass");
		Constructor<SingletonReflectionClass> consttructor1 = clas1.getDeclaredConstructor();
		consttructor1.setAccessible(true);
		SingletonReflectionClass singleton1 = consttructor.newInstance();

		System.out.println("Class For Name:" + singleton + " " + singleton1.hashCode());*/
	}

}
