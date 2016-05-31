package org.test.chartjs.configuration;

public class ChartTitle {

	private Boolean display = null;
	private String text = null;

	public ChartTitle() {
		initDefaultValues();
	}
	
	public void initDefaultValues() {
		display = true;
		text = "Chart.js Line Chart";
	}

	public Boolean getDisplay() {
		return display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
