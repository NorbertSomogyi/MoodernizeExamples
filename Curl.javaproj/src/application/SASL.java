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
	
	public Object Curl_sasl_parse_url_auth_option(Object value, Object len) {
		 result = CURLE_OK;
		size_t mechlen = new size_t();
		if (!len) {
			return CURLE_URL_MALFORMAT;
		} 
		Object generatedResetprefs = this.getResetprefs();
		if (generatedResetprefs) {
			this.setResetprefs(0);
			this.setPrefmech(0);
		} 
		int generatedPrefmech = this.getPrefmech();
		if (!.strncmp(value, "*", len)) {
			this.setPrefmech((~-1024 & ~(1 << 5)));
		} else {
				int mechbit = ModernizedCProgram.Curl_sasl_decode_mech(value, len, mechlen);
				if (mechbit && mechlen == len) {
					generatedPrefmech |=  mechbit;
				} else {
						result = CURLE_URL_MALFORMAT;
				} 
		} 
		return result/*
		 * Curl_sasl_init()
		 *
		 * Initializes the SASL structure.
		 */;
	}
	public void Curl_sasl_init(Object params) {
		this.setParams(/* Set protocol dependent parameters */params);
		this.setState(/* Not yet running */.SASL_STOP);
		this.setAuthmechs(/* No known authentication mechanism yet */0);
		this.setPrefmech((~-1024 & ~(1 << /* Prefer all mechanisms */5)));
		this.setAuthused(/* No the authentication mechanism used */0);
		this.setResetprefs(/* Reset prefmech upon AUTH parsing. */1);
		this.setMutual_auth(/* No mutual authentication (GSSAPI only) */0);
		this.setForce_ir(/* Respect external option */0/*
		 * state()
		 *
		 * This is the ONLY way to change SASL state!
		 */);
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
