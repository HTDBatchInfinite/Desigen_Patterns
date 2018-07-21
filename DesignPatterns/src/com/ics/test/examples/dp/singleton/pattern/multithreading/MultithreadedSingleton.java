package com.ics.test.examples.dp.singleton.pattern.multithreading;

public class MultithreadedSingleton {

	private static MultithreadedSingleton singletonClass;

	private MultithreadedSingleton() {

		System.out.println("Invoking Constructor");
	}

	public static /*synchronized*/ MultithreadedSingleton getInstance() {

		/*if (singletonClass == null) {

			singletonClass = new MultithreadedSingleton();
		}*/
		
		if(null == singletonClass){
			 
            // synchronized block
            synchronized (MultithreadedSingleton.class) {
                if(null == singletonClass){
                	singletonClass = new MultithreadedSingleton();
                }
            }
        }

		return singletonClass;
	}
	
}
