package org.test.chartjs.configuration;

public class ChartXAxis {

	private Boolean display = null;
	private ChartScaleLabels scaleLabel = null;

	public ChartXAxis() {
		initDefaultValues();
	}
	
	public void initDefaultValues() {
		display = true;
		scaleLabel = new ChartScaleLabels();
		scaleLabel.initDefaultValues();
	}
	
	public Boolean getDisplay() {
		return display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
	}

	public ChartScaleLabels getScaleLabel() {
		return scaleLabel;
	}

	public void setScaleLabel(ChartScaleLabels scaleLabel) {
		this.scaleLabel = scaleLabel;
	}

}
