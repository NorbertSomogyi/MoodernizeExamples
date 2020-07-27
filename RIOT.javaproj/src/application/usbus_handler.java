package application;

/**< List of handlers (to be used by
                                                 @ref usbus_t) */
public class usbus_handler {
	private usbus_handler next;
	private Object driver;
	private usbus_interface iface;
	private Object flags;
	
	public usbus_handler(usbus_handler next, Object driver, usbus_interface iface, Object flags) {
		setNext(next);
		setDriver(driver);
		setIface(iface);
		setFlags(flags);
	}
	public usbus_handler() {
	}
	
	public void usbus_handler_set_flag(Object flag) {
		Object generatedFlags = this.getFlags();
		generatedFlags |=  flag/**
		 * @brief disable a specific handler flag
		 *
		 * @param[in]   handler handler to disable the flag for
		 * @param[in]   flag    flag to disable
		 */;
	}
	public void usbus_handler_remove_flag(Object flag) {
		Object generatedFlags = this.getFlags();
		generatedFlags &=  ~flag/**
		 * @brief check if a specific handler flag is set
		 *
		 * @param[in]   handler handler to check for flag
		 * @param[in]   flag    flag to check
		 *
		 * @return          true if the flag is set for this handler
		 */;
	}
	public Object usbus_handler_isset_flag(Object flag) {
		Object generatedFlags = this.getFlags();
		return generatedFlags & flag;
	}
	/* USB_USBUS_H */
	/** @} */
	public usbus_handler getNext() {
		return next;
	}
	public void setNext(usbus_handler newNext) {
		next = newNext;
	}
	public Object getDriver() {
		return driver;
	}
	public void setDriver(Object newDriver) {
		driver = newDriver;
	}
	public usbus_interface getIface() {
		return iface;
	}
	public void setIface(usbus_interface newIface) {
		iface = newIface;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
}
/**
 * @brief Header length types for USB descriptor generators
 */
/**< Header always generates a fixed length */
/**< Header length is calculated by a function */
/**
 * @brief USBUS header generator function pointers
 */
