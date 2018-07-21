package com.ics.test.examples.dp.singleton.pattern.gc;


public class GCSingleton {

	private static GCSingleton singletonClass;

	private GCSingleton() {

		System.out.println("Invoking Constructor");
	}

	public static GCSingleton getInstance() {

		if (singletonClass == null) {

			singletonClass = new GCSingleton();
		}

		return singletonClass;
	}
}
