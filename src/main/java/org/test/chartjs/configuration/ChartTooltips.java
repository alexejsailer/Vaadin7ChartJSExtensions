package org.test.chartjs.configuration;

public class ChartTooltips {

	private String mode = null;

	public ChartTooltips() {
		initDefaultValues();
	}
	
	public void initDefaultValues() {
		mode = "label";
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
}
