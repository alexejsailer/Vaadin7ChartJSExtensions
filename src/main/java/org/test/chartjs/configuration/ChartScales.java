package org.test.chartjs.configuration;

public class ChartScales {

	private ChartXAxis[] xAxes = null;
	private ChartYAxis[] yAxes = null;

	public ChartScales() {
		initDefaultValues();
	}
	
	public void initDefaultValues() {
		ChartXAxis xAxis = new ChartXAxis();
		ChartYAxis yAxis = new ChartYAxis();
		xAxes = new ChartXAxis[] { xAxis };
		yAxes = new ChartYAxis[] { yAxis };
	}


	public ChartXAxis[] getxAxes() {
		return xAxes;
	}


	public void setxAxes(ChartXAxis[] xAxes) {
		this.xAxes = xAxes;
	}


	public ChartYAxis[] getyAxes() {
		return yAxes;
	}


	public void setyAxes(ChartYAxis[] yAxes) {
		this.yAxes = yAxes;
	}

}
