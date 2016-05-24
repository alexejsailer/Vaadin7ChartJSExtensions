package org.test.chartjs;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.AbstractJavaScriptExtension;
import com.vaadin.server.ClientConnector;
import com.vaadin.ui.Panel;

@SuppressWarnings("serial")
@JavaScript({ "jquery-1.12.4.js", "Chart.bundle.js",
		"chartjs_connector.js" })
public class ChartJSExtension extends AbstractJavaScriptExtension {

	public void extend(Panel panel) {

		super.extend(panel);

		drawLine();
	}

	protected void drawLine(Object... commandAndArguments) {

		callFunction("drawLine", commandAndArguments);
	}

	
	public void addData(Object... commandAndArguments) {

		callFunction("addData", commandAndArguments);
	}
	
	@Override
	protected Class<? extends ClientConnector> getSupportedParentType() {

		return Panel.class;
	}

	@Override
	public ChartJSState getState() {

		return (ChartJSState) super.getState();
	}
}
