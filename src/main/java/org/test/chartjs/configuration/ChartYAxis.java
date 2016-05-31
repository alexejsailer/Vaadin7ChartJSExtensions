package org.test.chartjs.configuration;

public class ChartYAxis {

	private Boolean display = null;
	private ChartScaleLabels scaleLabel = null;
	private ChartTicks ticks = null;

	public ChartYAxis() {
		initDefaultValues();
	}
	
	public void initDefaultValues() {
		display = true;
		scaleLabel = new ChartScaleLabels();
		scaleLabel.setLabelString("Value");
		ticks = new ChartTicks();
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

	public ChartTicks getTicks() {
		return ticks;
	}

	public void setTicks(ChartTicks ticks) {
		this.ticks = ticks;
	}

}
