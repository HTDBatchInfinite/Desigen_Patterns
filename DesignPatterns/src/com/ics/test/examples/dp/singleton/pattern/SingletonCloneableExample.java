package com.ics.test.examples.dp.singleton.pattern;

public class SingletonCloneableExample {

	public static void main(String[] args) throws Exception {

		// 1
		SingletonClass singletonClass = SingletonClass.getInstance();

		System.out.println("singletonClass1:::" + singletonClass + " " + singletonClass.hashCode());

		// 2
		SingletonClass singletonClass1 = SingletonClass.getInstance();

		System.out.println("singletonClass2:::" + singletonClass1 + " " + singletonClass1.hashCode());

		/*SingletonClass singletonCloneClass = (SingletonClass) SingletonClass.getInstance().clone();
		System.out.println("singletonCloneClass:" + singletonCloneClass + " " + singletonClass1.hashCode());*/
	}

}
