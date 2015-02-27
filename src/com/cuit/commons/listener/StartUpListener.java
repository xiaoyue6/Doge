package com.cuit.commons.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;





public class StartUpListener implements ServletContextListener {

	private static final Log log = LogFactory.getLog(StartUpListener.class);
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	public void contextInitialized(ServletContextEvent event) {
		if (log.isDebugEnabled()) {
			log.debug("StartUpListener initializing context...");
		}
//		ServletContext context = event.getServletContext();
//		ApplicationContext ctx = WebApplicationContextUtils
//				.getRequiredWebApplicationContext(context);
	}
}