package org.test.chartjs;

import org.test.chartjs.configuration.ChartConfiguration;
import org.test.chartjs.configuration.ChartData;
import org.test.chartjs.configuration.ChartDataset;
import org.test.chartjs.configuration.ChartOptions;

import com.vaadin.shared.JavaScriptExtensionState;

public class ChartJSState extends JavaScriptExtensionState {

	private static final long serialVersionUID = 6081948215610452046L;
	
	private ChartConfiguration configuration = null;
	
	String[] axisLabels = new String[] { "January1", "February1", "March1", "April1", "May1" };
	
	
	/**
	 * Create default chart to show on integration
	 */
	public ChartJSState() {
		
		configuration = new ChartConfiguration();
		
		ChartData data = new ChartData();
		ChartDataset[] dataSets = new ChartDataset[1]; 
		ChartDataset dataSet = new ChartDataset();
		dataSet.initDefaultValues();
		dataSet.setLabel("My First dataset");
		dataSet.setBackgroundColor("rgba(75,192,192,0.4)");
		dataSet.setBorderColor("rgba(75,192,192,1)");
		dataSet.setPointBackgroundColor("rgba(112,253,119,0.5)");
		dataSet.setPointBorderColor("rgba(58,82,224,0.7)");
		dataSet.setPointBorderWidth(new Double(1d));
		Double[] values = {42d, 50d};
		String[] labels = {"Mo", "Thu"};

		dataSet.setData(values);
		dataSets[0] = dataSet;
		
		data.setDatasets(dataSets);
		data.setLabels(labels);

		configuration.setType("bar");
		configuration.setData(data);
		
		ChartOptions options = new ChartOptions();
		configuration.setOptions(options);
		
		
	}
	
	public String[] getAxisLabels() {
		return axisLabels;
	}

	public void setAxisLabels(String[] axisLabels) {
		this.axisLabels = axisLabels;
	}

	public ChartConfiguration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(ChartConfiguration configuration) {
		this.configuration = configuration;
	}
	
}
