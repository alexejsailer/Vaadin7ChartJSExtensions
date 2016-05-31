package org.test.chartjs.configuration;

public class ChartTicks {

	private Double suggestedMin = null;
	private Double suggestedMax = null;

	public ChartTicks() {
		initDefaultValues();
	}
	
	public void initDefaultValues() {
		suggestedMin = -10d;
		suggestedMax = 250d;
	}

	public Double getSuggestedMin() {
		return suggestedMin;
	}

	public void setSuggestedMin(Double suggestedMin) {
		this.suggestedMin = suggestedMin;
	}

	public Double getSuggestedMax() {
		return suggestedMax;
	}

	public void setSuggestedMax(Double suggestedMax) {
		this.suggestedMax = suggestedMax;
	}

}
