package com.ics.test.examples.dp.factory.pattern;

/**
 * Class inherits the common specifications from the parent class and overrides
 * the custom specifications.
 * 
 * @author Infinite computer solutions ind pvt ltd.
 *
 */
public class Samsung implements Mobile {

	/**
	 * Samsung Processor specifications.
	 */
	@Override
	public void getProcesorSpecifications() {

		System.out.println("Samsung Processor 2GHz dual-core");
	}

	/**
	 * Samsung RAM Specifications.
	 */
	@Override
	public void getRAMSpecifications() {
		System.out.println("Samsung RAM 2 GB.");
	}

	/**
	 * Samsung display specifications.
	 */
	@Override
	public void getDisplaySpecifications() {
		System.out.println("Samsung Display 4.05-inch.");
	}

	/**
	 * Samsung battery specifications.
	 */
	@Override
	public void getBatterySpecifications() {
		System.out.println("Samsung Battery 1850 mah.");
	}

	/**
	 * Samsung camera specifications.
	 */
	@Override
	public void getCameraSpecifications() {
		System.out.println("Samsung Front Camera 8-megapixel.");
		System.out.println("Samsung Rear Camera 8 -megapixel.");
	}

}
