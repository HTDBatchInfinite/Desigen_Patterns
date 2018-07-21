package com.ics.test.examples.dp.singleton.pattern.avoidserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AvoidSingletonSerialization {

	public static void main(String[] args) throws Exception {

		// 1
		/*SingletonSerialization singletonClass = SingletonSerialization.getInstance();

		System.out.println("singletonClass1:::" + singletonClass + " " + singletonClass.hashCode());

		// 2
		SingletonSerialization singletonClass1 = SingletonSerialization.getInstance();

		System.out.println("singletonClass2:::" + singletonClass1 + " " + singletonClass1.hashCode());*/

		SingletonSerialization singleton = SingletonSerialization.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Demo\\singleton.ser"));
		oos.writeObject(singleton);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Demo\\singleton.ser"));
		SingletonSerialization singletonSerObj = (SingletonSerialization) ois.readObject();

		System.out.println("Serializable:" + singletonSerObj + " " + singletonSerObj.hashCode());
		
		
		
		
		SingletonSerialization singleton1 = SingletonSerialization.getInstance();
		ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("D:\\Demo\\singleton.ser"));
		oos1.writeObject(singleton1);

		ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("D:\\Demo\\singleton.ser"));
		SingletonSerialization singletonSerObj1 = (SingletonSerialization) ois1.readObject();

		System.out.println("Serializable:" + singletonSerObj1 + " " + singletonSerObj1.hashCode());
	}
}
