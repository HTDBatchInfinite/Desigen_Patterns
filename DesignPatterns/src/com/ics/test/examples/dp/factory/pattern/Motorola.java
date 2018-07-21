package com.ics.test.examples.dp.factory.pattern;

/**
 * Class inherits the common specifications from the parent class and overrides
 * the custom specifications.
 * 
 * @author Infinite computer solutions ind pvt ltd.
 *
 */
public class Motorola implements Mobile {

	/**
	 * Motorola Processor specifications.
	 */
	@Override
	public void getProcesorSpecifications() {
		System.out.println("Motorola Processor 3GHz dual-core");
	}

	/**
	 * Motorola RAM Specifications.
	 */
	@Override
	public void getRAMSpecifications() {
		System.out.println("Motorola RAM 3 GB.");
	}

	/**
	 * Motorola display specifications.
	 */
	@Override
	public void getDisplaySpecifications() {
		System.out.println("Motorola Display 4.10-inch.");
	}

	/**
	 * Motorola battery specifications.
	 */
	@Override
	public void getBatterySpecifications() {
		System.out.println("Motorola Battery 2000 mah.");
	}

	/**
	 * Motorola camera specifications.
	 */
	@Override
	public void getCameraSpecifications() {
		System.out.println("Motorola Front Camera 12-megapixel.");
		System.out.println("Motorola Rear Camera  12-megapixel.");
	}

}
