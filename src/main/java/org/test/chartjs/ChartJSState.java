package org.test.chartjs;

import com.vaadin.shared.JavaScriptExtensionState;

public class ChartJSState extends JavaScriptExtensionState {

	private static final long serialVersionUID = 6081948215610452046L;
	
	String[] axisLabels = new String[] { "January1", "February1", "March1", "April1", "May1" };

	public String[] getAxisLabels() {
		return axisLabels;
	}

	public void setAxisLabels(String[] axisLabels) {
		this.axisLabels = axisLabels;
	}
	
}
