package com.ics.test.examples.dp.factory.pattern;

/**
 * Class inherits the common specifications from the parent class and overrides
 * the custom specifications.
 * 
 * @author Infinite computer solutions ind pvt ltd.
 *
 */
public class IPhone implements Mobile {

	/**
	 * IPhone Processor specifications.
	 */
	@Override
	public void getProcesorSpecifications() {

		System.out.println("IPhone Processor1.3GHz dual-core.");
	}

	/**
	 * IPhone RAM Specifications.
	 */
	@Override
	public void getRAMSpecifications() {
		System.out.println("IPhone RAM 1 GB.");
	}

	/**
	 * IPhone display specifications.
	 */
	@Override
	public void getDisplaySpecifications() {
		System.out.println("IPhone Display 4.00-inch.");
	}

	/**
	 * IPhone battery specifications.
	 */
	@Override
	public void getBatterySpecifications() {

		System.out.println("IPhone Battery 1800 mah.");
	}

	/**
	 * IPhone camera specifications.
	 */
	@Override
	public void getCameraSpecifications() {

		System.out.println("IPhone Front Camera1.2-megapixel.");
		System.out.println("IPhone Rear Camera8-megapixel.");

	}

}
