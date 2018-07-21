package com.ics.test.examples.dp.factory.pattern;

import java.util.Hashtable;
import java.util.Map;

/**
 * Helper class which will be used to instantiate the objects based on the
 * input.
 * 
 * @author Infinite computer solutions ind pvt ltd.
 *
 */
public class ProduceMobile {

	// Static variables
	private static final String SAMSUNG = "Samsung";
	private static final String ONE_PLUS_ONE = "OnePlusOne";
	private static final String MOTOROLA = "Motorola";
	private static final String I_PHONE = "IPhone";
	private static Mobile mobile = null;
	private static Map<String, Class<?>> map = new Hashtable<String, Class<?>>();

	/**
	 * Method will give the instance for the given mobile input.
	 * 
	 * @param mobileName
	 * @return mobile instance
	 */
	public static Mobile produceMobile(String mobileName) {

		if (mobileName.equals(I_PHONE)) {
			mobile = new IPhone();
		} else if (mobileName.equals(MOTOROLA)) {
			mobile = new Motorola();
		} else if (mobileName.equals(ONE_PLUS_ONE)) {
			mobile = new OnePlusOne();
		} else if (mobileName.equals(SAMSUNG)) {
			mobile = new Samsung();
		} else {

			mobile = null;
		}

		return mobile;
	}

	/**
	 * Method to get the instance of the given class.
	 * 
	 * @param mobileName
	 * @return mobile
	 */
	public static Mobile getInstance(Class mobileName) {

		Class mobileFullyQualifiedName = null;
		try {

			mobileFullyQualifiedName = (Class) map.get(mobileName.getName());
			String className = null;
			if (null == mobileFullyQualifiedName) {

				className = getFQMobileClassName(mobileName);
				mobileFullyQualifiedName = Class.forName(className);
				map.put(mobileName.getName(), mobileFullyQualifiedName);

			}
			mobile = (Mobile) mobileFullyQualifiedName.newInstance();

		} catch (ClassNotFoundException classNotFoundException) {

			System.err.println(classNotFoundException);

		} catch (InstantiationException e) {

			e.printStackTrace();

		} catch (IllegalAccessException e) {

			e.printStackTrace();
		}

		return mobile;
	}

	/**
	 * Method to get the fully qualified name.
	 * 
	 * @param mobileName
	 * @return className
	 */
	private static String getFQMobileClassName(Class mobileName) {
		String className = mobileName.getName().toString();
		return className;
	}
}
