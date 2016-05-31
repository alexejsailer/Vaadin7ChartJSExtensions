package org.test.chartjs.configuration;

public class ChartData {

	private String[] labels = null;
	private ChartDataset[] datasets = null;

	
	public void initDefaultValues() {
		this.labels = new String[] {"January", "February", "March", "April", "May", "June", "July"};
	}
	
	public String[] getLabels() {
		return labels;
	}

	public void setLabels(String[] labels) {
		this.labels = labels;
	}

	public ChartDataset[] getDatasets() {
		return datasets;
	}

	public void setDatasets(ChartDataset[] datasets) {
		this.datasets = datasets;
	}
	
}
