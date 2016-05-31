package org.test.chartjs.configuration;

public class ChartHover {

	private String mode = null;

	public ChartHover() {
		initDefaultValues();
	}
	
	public void initDefaultValues() {
		mode = "dataset";
	}
	
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

}
