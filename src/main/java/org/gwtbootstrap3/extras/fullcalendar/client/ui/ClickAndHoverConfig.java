package org.gwtbootstrap3.extras.fullcalendar.client.ui;

import com.google.gwt.core.client.JavaScriptObject;

public class ClickAndHoverConfig implements IsJavaScriptObject{
	private JavaScriptObject script;
	
	public ClickAndHoverConfig(CalendarMouseEventHandler handler){
		if( handler != null ){
			newInstance(handler);
		}
	}
	
	private native void newInstance(CalendarMouseEventHandler handler) /*-{
		var theInstance = this;
		var mouseHandler = handler;
		theInstance.@org.gwtbootstrap3.extras.fullcalendar.client.ui.ClickAndHoverConfig::script = {};
		theInstance.@org.gwtbootstrap3.extras.fullcalendar.client.ui.ClickAndHoverConfig::script.eventClick = function(calEvent, jsEvent, view) {
			mouseHandler.@org.gwtbootstrap3.extras.fullcalendar.client.ui.CalendarMouseEventHandler::eventClick(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/dom/client/NativeEvent;Lcom/google/gwt/core/client/JavaScriptObject;)(calEvent,jsEvent,view);
  		}
  		theInstance.@org.gwtbootstrap3.extras.fullcalendar.client.ui.ClickAndHoverConfig::script.dayClick = function(moment, jsEvent, view) {
			mouseHandler.@org.gwtbootstrap3.extras.fullcalendar.client.ui.CalendarMouseEventHandler::dayClick(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/dom/client/NativeEvent;Lcom/google/gwt/core/client/JavaScriptObject;)(moment,jsEvent,view);
  		}
  		theInstance.@org.gwtbootstrap3.extras.fullcalendar.client.ui.ClickAndHoverConfig::script.eventMouseover = function(calEvent, jsEvent, view) {
			mouseHandler.@org.gwtbootstrap3.extras.fullcalendar.client.ui.CalendarMouseEventHandler::eventMouseover(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/dom/client/NativeEvent;Lcom/google/gwt/core/client/JavaScriptObject;)(calEvent,jsEvent,view);
  		}
  		theInstance.@org.gwtbootstrap3.extras.fullcalendar.client.ui.ClickAndHoverConfig::script.eventMouseout = function(calEvent, jsEvent, view) {
			mouseHandler.@org.gwtbootstrap3.extras.fullcalendar.client.ui.CalendarMouseEventHandler::eventMouseout(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/dom/client/NativeEvent;Lcom/google/gwt/core/client/JavaScriptObject;)(calEvent,jsEvent,view);
      	}
  		
	}-*/; 

	
	public JavaScriptObject toJavaScript(){
		return script;
	}
}
