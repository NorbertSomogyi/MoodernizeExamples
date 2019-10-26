package application;

public class gss_channel_bindings_struct {
	private Object initiator_addrtype;
	private gss_buffer_desc_struct initiator_address;
	private Object acceptor_addrtype;
	private gss_buffer_desc_struct acceptor_address;
	private gss_buffer_desc_struct application_data;
	
	public gss_channel_bindings_struct(Object initiator_addrtype, gss_buffer_desc_struct initiator_address, Object acceptor_addrtype, gss_buffer_desc_struct acceptor_address, gss_buffer_desc_struct application_data) {
		setInitiator_addrtype(initiator_addrtype);
		setInitiator_address(initiator_address);
		setAcceptor_addrtype(acceptor_addrtype);
		setAcceptor_address(acceptor_address);
		setApplication_data(application_data);
	}
	public gss_channel_bindings_struct() {
	}
	
	public Object getInitiator_addrtype() {
		return initiator_addrtype;
	}
	public void setInitiator_addrtype(Object newInitiator_addrtype) {
		initiator_addrtype = newInitiator_addrtype;
	}
	public gss_buffer_desc_struct getInitiator_address() {
		return initiator_address;
	}
	public void setInitiator_address(gss_buffer_desc_struct newInitiator_address) {
		initiator_address = newInitiator_address;
	}
	public Object getAcceptor_addrtype() {
		return acceptor_addrtype;
	}
	public void setAcceptor_addrtype(Object newAcceptor_addrtype) {
		acceptor_addrtype = newAcceptor_addrtype;
	}
	public gss_buffer_desc_struct getAcceptor_address() {
		return acceptor_address;
	}
	public void setAcceptor_address(gss_buffer_desc_struct newAcceptor_address) {
		acceptor_address = newAcceptor_address;
	}
	public gss_buffer_desc_struct getApplication_data() {
		return application_data;
	}
	public void setApplication_data(gss_buffer_desc_struct newApplication_data) {
		application_data = newApplication_data;
	}
}
