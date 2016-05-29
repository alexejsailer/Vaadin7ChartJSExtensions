/*
 * Copyright 2012 Nicolas Frankel
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.test.chartjs;

import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class ChartJSIntegrationView extends Panel {

	private ChartJSExtension chartJSExtension;

	public ChartJSIntegrationView() {
		this.setSizeUndefined();
		VerticalLayout vl = new VerticalLayout();
		vl.setSizeUndefined();
//		vl.setWidth("500px");
//		vl.setHeight("500px");
		this.setContent(vl);
		vl.setId("myPanel");
		chartJSExtension = new ChartJSExtension();
		chartJSExtension.extend(this);

	}

	public ChartJSExtension getChartJSExtension() {
		return chartJSExtension;
	}

	public void setChartJSExtension(ChartJSExtension chartJSExtension) {
		this.chartJSExtension = chartJSExtension;
	}
	
}
