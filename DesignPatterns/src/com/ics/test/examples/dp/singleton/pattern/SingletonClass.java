package com.ics.test.examples.dp.singleton.pattern;

import java.io.Serializable;

public class SingletonClass implements  Serializable  /*Cloneable*/ {

	private static SingletonClass singletonClass;

	private SingletonClass() {

		System.out.println("Invoking Constructor");
	}

	public static SingletonClass getInstance() {

		if (singletonClass == null) {
			
				singletonClass = new SingletonClass();
		}

		return singletonClass;
	}

	/*@Override
	public Object clone() throws CloneNotSupportedException {
		// throw new CloneNotSupportedException();
		return super.clone();
	}*/
}
