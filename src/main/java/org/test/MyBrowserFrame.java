package org.test;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.BrowserFrame;
import com.vaadin.ui.UI;

public class MyBrowserFrame extends BrowserFrame {

	private static final long serialVersionUID = 4745004191373631147L;

	public MyBrowserFrame() {
	
		String host = UI.getCurrent().getPage().getLocation().getHost();
		int port = UI.getCurrent().getPage().getLocation().getPort();
//		String serverInfo = VaadinServlet.getCurrent().getServletContext().getServerInfo();
		String contextPath = VaadinServlet.getCurrent().getServletContext().getContextPath();

		this.setSizeFull();
		this.setSource(new ExternalResource("http://" + host + ":" + port + contextPath + "/barChart"));
	}
	
}
