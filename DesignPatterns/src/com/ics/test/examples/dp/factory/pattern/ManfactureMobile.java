package com.ics.test.examples.dp.factory.pattern;

/**
 * Driver Class to instantiate the required instance.
 * 
 * @author Infinite computer solutions ind pvt ltd.
 *
 */
public class ManfactureMobile {

	public static void main(String[] args) {

		// Option - 1 way of instantiating the object.

		// IPhone Object instantiation
		IPhone iphone = (IPhone) ProduceMobile.produceMobile("IPhone");
		iphone.getBatterySpecifications();

		// Samsung Object instantiation
		Samsung samsung = (Samsung) ProduceMobile.produceMobile("Samsung");
		samsung.getBatterySpecifications();

		// Motorola Object instantiation
		Motorola motorola = (Motorola) ProduceMobile.produceMobile("Motorola");
		motorola.getBatterySpecifications();

		// OnePlusOne Object instantiation
		OnePlusOne onePlusOne = (OnePlusOne) ProduceMobile.produceMobile("OnePlusOne");
		onePlusOne.getBatterySpecifications();

		// Option - 2 for instantiating the object.
		IPhone iphone1 = (IPhone) ProduceMobile.getInstance(IPhone.class);
		iphone1.getDisplaySpecifications();

		Samsung samsung1 = (Samsung) ProduceMobile.getInstance(Samsung.class);
		samsung1.getBatterySpecifications();
	}

}
