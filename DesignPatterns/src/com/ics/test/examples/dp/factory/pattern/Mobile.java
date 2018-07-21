package com.ics.test.examples.dp.factory.pattern;

/**
 * Class provides the common specifications for a smartphone.
 * 
 * @author Infinite computer solutions ind pvt ltd.
 *
 */
public interface Mobile {

	/**
	 * Provides the common Processor specifications.
	 */
	void getProcesorSpecifications();

	/**
	 * Provides the common RAMSpecifications.
	 */
	void getRAMSpecifications();

	/**
	 * Provides the common DisplaySpecifications.
	 */
	void getDisplaySpecifications();

	/**
	 * Provides the common BatterySpecifications.
	 */
	void getBatterySpecifications();

	/**
	 * Provides the common CameraSpecifications.
	 */
	void getCameraSpecifications();
}
