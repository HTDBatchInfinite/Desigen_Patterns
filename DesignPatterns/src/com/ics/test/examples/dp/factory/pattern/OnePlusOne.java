package com.ics.test.examples.dp.factory.pattern;

/**
 * Class inherits the common specifications from the parent class and overrides
 * the custom specifications.
 * 
 * @author Infinite computer solutions ind pvt ltd.
 *
 */
public class OnePlusOne implements Mobile {

	/**
	 * OnePlusOne Processor specifications.
	 */
	@Override
	public void getProcesorSpecifications() {
		System.out.println("OnePlusOne Processor 4GHz dual-core");
	}

	/**
	 * OnePlusOne RAM Specifications.
	 */
	@Override
	public void getRAMSpecifications() {
		System.out.println("OnePlusOne RAM 4 GB.");
	}

	/**
	 * OnePlusOne display specifications.
	 */
	@Override
	public void getDisplaySpecifications() {
		System.out.println("OnePlusOne Display 5.00-inch.");
	}

	/**
	 * OnePlusOne battery specifications.
	 */
	@Override
	public void getBatterySpecifications() {
		System.out.println("OnePlusOne Battery 3000 mah.");
	}

	/**
	 * OnePlusOne camera specifications.
	 */
	@Override
	public void getCameraSpecifications() {
		System.out.println("OnePlusOne Front Camera 18-megapixel.");
		System.out.println("OnePlusOne Rear Camera 18-megapixel.");
	}

}
