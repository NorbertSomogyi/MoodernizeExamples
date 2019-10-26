package application;

public class dbus_sleep_info {
	private Object service;
	private Object pending;
	private Object c;
	private Object id;
	private service_type type;
	
	public dbus_sleep_info(Object service, Object pending, Object c, Object id, service_type type) {
		setService(service);
		setPending(pending);
		setC(c);
		setId(id);
		setType(type);
	}
	public dbus_sleep_info() {
	}
	
	public void dbus_sleep_info_destroy() {
		Object generatedPending = this.getPending();
		Object generatedC = this.getC();
		if (info) {
			if (generatedPending) {
				.dbus_pending_call_cancel(generatedPending);
				.dbus_pending_call_unref(generatedPending);
			} 
			.dbus_connection_close(generatedC);
			.dbus_connection_unref(generatedC);
			ModernizedCProgram.bfree(info);
		} 
	}
	public dbus_sleep_info dbus_sleep_info_create() {
		dbus_sleep_info info = ModernizedCProgram.bzalloc();
		 err = new ();
		.dbus_error_init(err);
		info.setC(.dbus_bus_get_private(DBUS_BUS_SESSION, err));
		Object generatedC = info.getC();
		if (!generatedC) {
			ModernizedCProgram.blog(LOG_ERROR, "Could not create dbus connection: %s", err.getMessage());
			ModernizedCProgram.bfree(info);
			return ((Object)0);
		} 
		for (size_t i = 0;
		 i < ModernizedCProgram.num_services; i++) {
			service_info service = ModernizedCProgram.services[i];
			if (!service.getName()) {
				continue;
			} 
			if (.dbus_bus_name_has_owner(generatedC, service.getName(), ((Object)0))) {
				ModernizedCProgram.blog(LOG_DEBUG, "Found dbus service: %s", service.getName());
				info.setService(service);
				info.setType((service_type)i);
				return info;
			} 
		}
		info.dbus_sleep_info_destroy();
		return ((Object)0);
	}
	public void dbus_inhibit_sleep(Object reason, boolean active) {
		 reply = new ();
		byte method;
		 success = new ();
		Object generatedPending = this.getPending();
		Object generatedId = this.getId();
		if (generatedPending) {
			.dbus_pending_call_block(generatedPending);
			reply = .dbus_pending_call_steal_reply(generatedPending);
			.dbus_pending_call_unref(generatedPending);
			this.setPending(((Object)0));
			if (reply) {
				success = .dbus_message_get_args(reply, ((Object)0), DBUS_TYPE_UINT32, generatedId, DBUS_TYPE_INVALID);
				if (!success) {
					this.setId(0);
				} 
				.dbus_message_unref(reply);
			} 
		} 
		if (active == !!generatedId) {
			return ;
		} 
		Object generatedService = this.getService();
		method = active ? "Inhibit" : generatedService.getUninhibit();
		reply = .dbus_message_new_method_call(generatedService.getName(), generatedService.getPath(), generatedService.getName(), method);
		if (reply == ((Object)0)) {
			ModernizedCProgram.blog(LOG_ERROR, "dbus_message_new_method_call failed");
			return ;
		} 
		service_type generatedType = this.getType();
		Object generatedC = this.getC();
		if (active) {
			byte program = "libobs";
			 flags = -1024;
			 xid = 0;
			((generatedId == 0) ? (Object)0 : ._assert("info->id == 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\platform-nix-dbus.c", 166));
			switch (generatedType) {
			case service_type.MATE_SM:
			case service_type.GNOME_SM:
					success = .dbus_message_append_args(reply, DBUS_TYPE_STRING, program, DBUS_TYPE_UINT32, xid, DBUS_TYPE_STRING, reason, DBUS_TYPE_UINT32, flags, DBUS_TYPE_INVALID);
					break;
			default:
					success = .dbus_message_append_args(reply, DBUS_TYPE_STRING, program, DBUS_TYPE_STRING, reason, DBUS_TYPE_INVALID);
			}
			if (success) {
				success = .dbus_connection_send_with_reply(generatedC, reply, generatedPending, -1);
				if (!success) {
					this.setPending(((Object)0));
				} 
			} 
		} else {
				((generatedId != 0) ? (Object)0 : ._assert("info->id != 0", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\platform-nix-dbus.c", 190));
				success = .dbus_message_append_args(reply, DBUS_TYPE_UINT32, generatedId, DBUS_TYPE_INVALID);
				if (success) {
					success = .dbus_connection_send(generatedC, reply, ((Object)0));
				} 
				if (!success) {
					this.setId(0);
				} 
		} 
		.dbus_connection_flush(generatedC);
		.dbus_message_unref(reply);
	}
	public Object getService() {
		return service;
	}
	public void setService(Object newService) {
		service = newService;
	}
	public Object getPending() {
		return pending;
	}
	public void setPending(Object newPending) {
		pending = newPending;
	}
	public Object getC() {
		return c;
	}
	public void setC(Object newC) {
		c = newC;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public service_type getType() {
		return type;
	}
	public void setType(service_type newType) {
		type = newType;
	}
}
