package org.test.chartjs.configuration;

public class ChartConfiguration {

	private String type = null;
	private ChartData data = null;
	private ChartOptions options = null;

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ChartData getData() {
		return data;
	}

	public void setData(ChartData data) {
		this.data = data;
	}

	public ChartOptions getOptions() {
		return options;
	}

	public void setOptions(ChartOptions options) {
		this.options = options;
	}
	
}
