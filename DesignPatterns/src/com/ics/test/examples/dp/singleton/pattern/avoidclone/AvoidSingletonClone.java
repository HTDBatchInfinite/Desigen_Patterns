package com.ics.test.examples.dp.singleton.pattern.avoidclone;

public class AvoidSingletonClone {

	public static void main(String[] args) throws Exception {

		// 1
		SingletonClone singletonClass = SingletonClone.getInstance();

		System.out.println("singletonClass1:::" + singletonClass + " " + singletonClass.hashCode());

		// 2
		SingletonClone singletonClass1 = SingletonClone.getInstance();

		System.out.println("singletonClass2:::" + singletonClass1 + " " + singletonClass1.hashCode());

		SingletonClone singletonCloneClass = (SingletonClone) SingletonClone.getInstance().clone();
		System.out.println("singletonCloneClass:" + singletonCloneClass + " " + singletonCloneClass.hashCode());

	}

}
