package com.ics.test.examples.dp.singleton.pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonSerializationExample {

	public static void main(String[] args) throws Exception {

		// 1
		SingletonClass singletonClass = SingletonClass.getInstance();

		System.out.println("singletonClass1:::" + singletonClass + " " + singletonClass.hashCode());

		// 2
		SingletonClass singletonClass1 = SingletonClass.getInstance();

		System.out.println("singletonClass2:::" + singletonClass1 + " " + singletonClass1.hashCode());

		SingletonClass singleton = SingletonClass.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Demo\\singleton.ser"));
		oos.writeObject(singleton);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Demo\\singleton.ser"));
		SingletonClass singletonSerObj = (SingletonClass) ois.readObject();

		System.out.println("Serializable:" + singletonSerObj + " " + singletonSerObj.hashCode());

	}

}
