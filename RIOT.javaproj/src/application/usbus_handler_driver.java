package application;

public class usbus_handler_driver {
	private Object init;
	private Object event_handler;
	private Object transfer_handler;
	private Object control_handler;
	
	public usbus_handler_driver(Object init, Object event_handler, Object transfer_handler, Object control_handler) {
		setInit(init);
		setEvent_handler(event_handler);
		setTransfer_handler(transfer_handler);
		setControl_handler(control_handler);
	}
	public usbus_handler_driver() {
	}
	
	public Object getInit() {
		return init;
	}
	public void setInit(Object newInit) {
		init = newInit;
	}
	public Object getEvent_handler() {
		return event_handler;
	}
	public void setEvent_handler(Object newEvent_handler) {
		event_handler = newEvent_handler;
	}
	public Object getTransfer_handler() {
		return transfer_handler;
	}
	public void setTransfer_handler(Object newTransfer_handler) {
		transfer_handler = newTransfer_handler;
	}
	public Object getControl_handler() {
		return control_handler;
	}
	public void setControl_handler(Object newControl_handler) {
		control_handler = newControl_handler;
	}
}
/**
     * @brief Initialize the event handler
     *
     * This function is called in the USBUS thread context to initialize the
     * event handler
     *
     * @param usbus     USBUS context
     * @param handler   handler context
     */
