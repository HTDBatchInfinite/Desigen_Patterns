package com.ics.test.examples.dp.singleton.pattern.avoidreflection;

public class SingletonReflectionClass {

	private static SingletonReflectionClass singletonClass;

	private SingletonReflectionClass() {

		System.out.println("Invoking Constructor"+singletonClass);
		if (null != singletonClass) {
			throw new IllegalStateException("Cannot create more than one instance.");
		}
	}

	public static SingletonReflectionClass getInstance() {

		if (singletonClass == null) {

			singletonClass = new SingletonReflectionClass();
		}

		return singletonClass;
	}
}
