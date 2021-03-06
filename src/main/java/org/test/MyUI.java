package org.test;

import javax.servlet.annotation.WebServlet;

import org.test.chartjs.ChartJSIntegrationView;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser
 * window (or tab) or some part of a html page where a Vaadin application is
 * embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is
 * intended to be overridden to add component to the user interface and
 * initialize non-component functionality.
 */
@Theme("mytheme")
@Widgetset("org.test.MyAppWidgetset")
public class MyUI extends UI {
	private static final long serialVersionUID = -3692165711330564074L;

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		final VerticalLayout vl = new VerticalLayout();
		final HorizontalLayout hl = new HorizontalLayout();

		ChartJSIntegrationView chartPanel = new ChartJSIntegrationView();
		
		Button addData = new Button("Add Data");
		addData.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				chartPanel.getChartJSExtension().addData();
			}

		});
		
		hl.addComponents(addData);
		vl.addComponents(hl, chartPanel);
		vl.setMargin(true);
		vl.setSpacing(true);

		setContent(vl);
	}

	@WebServlet(value = { "/myui/*", "/VAADIN/*" }, asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {

		/**
		 * 
		 */
		private static final long serialVersionUID = 4761276553072766217L;
	}
}
