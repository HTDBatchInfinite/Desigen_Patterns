package com.ics.test.examples.dp.singleton.pattern.avoidserialization;

import java.io.Serializable;

public class SingletonSerialization implements Serializable {

	private static final long serialVersionUID = 1L;

	private static SingletonSerialization singletonClass;

	private SingletonSerialization() {

		System.out.println("Invoking Constructor");
		/*if (null != singletonClass) {
			throw new IllegalStateException("Cannot create more than one instance.");
		}*/
	}

	public static SingletonSerialization getInstance() {

		if (singletonClass == null) {

			singletonClass = new SingletonSerialization();
		}

		return singletonClass;
	}

	/**
	 * Each time we deserilize read resolve returns public static final variable
	 * value which is getting populated with new instance() , for every
	 * deserialization.
	 * 
	 * @return
	 */
	private Object readResolve() {
		System.out.println("Invoking read resolve");
		return getInstance();
	}
}
