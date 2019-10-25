package application;

/* Per-connection parameters */
public class SASL {
	private Object params;
	private  state;
	private int authmechs;
	private int prefmech;
	private int authused;
	private Object resetprefs;
	private Object mutual_auth;
	private Object force_ir;
	
	public SASL(Object params,  state, int authmechs, int prefmech, int authused, Object resetprefs, Object mutual_auth, Object force_ir) {
		setParams(params);
		setState(state);
		setAuthmechs(authmechs);
		setPrefmech(prefmech);
		setAuthused(authused);
		setResetprefs(resetprefs);
		setMutual_auth(mutual_auth);
		setForce_ir(force_ir);
	}
	public SASL() {
	}
	
	public Object getParams() {
		return params;
	}
	public void setParams(Object newParams) {
		params = newParams;
	}
	public  getState() {
		return state;
	}
	public void setState( newState) {
		state = newState;
	}
	public int getAuthmechs() {
		return authmechs;
	}
	public void setAuthmechs(int newAuthmechs) {
		authmechs = newAuthmechs;
	}
	public int getPrefmech() {
		return prefmech;
	}
	public void setPrefmech(int newPrefmech) {
		prefmech = newPrefmech;
	}
	public int getAuthused() {
		return authused;
	}
	public void setAuthused(int newAuthused) {
		authused = newAuthused;
	}
	public Object getResetprefs() {
		return resetprefs;
	}
	public void setResetprefs(Object newResetprefs) {
		resetprefs = newResetprefs;
	}
	public Object getMutual_auth() {
		return mutual_auth;
	}
	public void setMutual_auth(Object newMutual_auth) {
		mutual_auth = newMutual_auth;
	}
	public Object getForce_ir() {
		return force_ir;
	}
	public void setForce_ir(Object newForce_ir) {
		force_ir = newForce_ir;
	}
}
