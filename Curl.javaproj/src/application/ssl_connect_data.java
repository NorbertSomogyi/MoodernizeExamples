package application;

/* struct for data related to each SSL connection */
public class ssl_connect_data {
	private  state;
	private  connecting_state;
	private Object use;
	
	public ssl_connect_data( state,  connecting_state, Object use) {
		setState(state);
		setConnecting_state(connecting_state);
		setUse(use);
	}
	public ssl_connect_data() {
	}
	
	public  getState() {
		return state;
	}
	public void setState( newState) {
		state = newState;
	}
	public  getConnecting_state() {
		return connecting_state;
	}
	public void setConnecting_state( newConnecting_state) {
		connecting_state = newConnecting_state;
	}
	public Object getUse() {
		return use;
	}
	public void setUse(Object newUse) {
		use = newUse;
	}
}
/* Use ssl encrypted communications TRUE/FALSE, not necessarily using it atm
     but at least asked to or meaning to use it. See 'state' for the exact
     current state of the connection. */
