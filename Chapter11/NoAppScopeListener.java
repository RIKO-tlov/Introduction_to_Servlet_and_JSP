package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class NoAppScopeListener
 *
 */
@WebListener
public class NoAppScopeListener implements ServletContextAttributeListener {

    public void attributeAdded(ServletContextAttributeEvent arg) {
    	System.out.println("警告:格納は禁止されています");
    }

    public void attributeRemoved(ServletContextAttributeEvent arg)  {}
    public void attributeReplaced(ServletContextAttributeEvent arg)  {}
}
