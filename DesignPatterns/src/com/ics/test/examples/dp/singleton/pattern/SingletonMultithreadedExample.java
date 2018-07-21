package com.ics.test.examples.dp.singleton.pattern;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonMultithreadedExample {

	public static void main(String[] args) {

		ExecutorService executorService=Executors.newFixedThreadPool(2);
		
		//executorService.submit(main:::useSingleton()); 
	    executorService.submit((Callable<SingletonClass>)useSingleton());
	    executorService.shutdown();
	}

	public static SingletonClass useSingleton(){
		SingletonClass singleton=SingletonClass.getInstance();
	    System.out.println("By Threading"+singleton);
		return singleton;

	}
}
