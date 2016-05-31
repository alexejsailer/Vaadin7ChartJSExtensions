package org.test.chartjs.configuration;

public class ChartScaleLabels {

	private Boolean show = null;
	private String labelString = null;
	
	public ChartScaleLabels() {
		initDefaultValues();
	}
	
	public void initDefaultValues() {
		show = true;
		labelString = "Month";
	}

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public String getLabelString() {
		return labelString;
	}

	public void setLabelString(String labelString) {
		this.labelString = labelString;
	}
	
}
