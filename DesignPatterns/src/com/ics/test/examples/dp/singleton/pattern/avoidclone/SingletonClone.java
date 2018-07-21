package com.ics.test.examples.dp.singleton.pattern.avoidclone;

public class SingletonClone implements Cloneable {

	private static SingletonClone singletonClass;

	private SingletonClone() {

		System.out.println("Invoking Constructor");
		/*if (null != singletonClass) {
			throw new IllegalStateException("Cannot create more than one instance.");
		}*/
	}

	public static SingletonClone getInstance() {

		if (singletonClass == null) {

			singletonClass = new SingletonClone();
		}

		return singletonClass;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
		// return super.clone();
	}
}
