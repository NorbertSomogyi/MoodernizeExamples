package application;

public class salitem_S {
	private Object sm_lead;
	private int sm_leadlen;
	private Object sm_oneof;
	private Object sm_rules;
	private Object sm_to;
	private Integer sm_lead_w;
	private Integer sm_oneof_w;
	private Integer sm_to_w;
	
	public salitem_S(Object sm_lead, int sm_leadlen, Object sm_oneof, Object sm_rules, Object sm_to, Integer sm_lead_w, Integer sm_oneof_w, Integer sm_to_w) {
		setSm_lead(sm_lead);
		setSm_leadlen(sm_leadlen);
		setSm_oneof(sm_oneof);
		setSm_rules(sm_rules);
		setSm_to(sm_to);
		setSm_lead_w(sm_lead_w);
		setSm_oneof_w(sm_oneof_w);
		setSm_to_w(sm_to_w);
	}
	public salitem_S() {
	}
	
	public Object getSm_lead() {
		return sm_lead;
	}
	public void setSm_lead(Object newSm_lead) {
		sm_lead = newSm_lead;
	}
	public int getSm_leadlen() {
		return sm_leadlen;
	}
	public void setSm_leadlen(int newSm_leadlen) {
		sm_leadlen = newSm_leadlen;
	}
	public Object getSm_oneof() {
		return sm_oneof;
	}
	public void setSm_oneof(Object newSm_oneof) {
		sm_oneof = newSm_oneof;
	}
	public Object getSm_rules() {
		return sm_rules;
	}
	public void setSm_rules(Object newSm_rules) {
		sm_rules = newSm_rules;
	}
	public Object getSm_to() {
		return sm_to;
	}
	public void setSm_to(Object newSm_to) {
		sm_to = newSm_to;
	}
	public Integer getSm_lead_w() {
		return sm_lead_w;
	}
	public void setSm_lead_w(Integer newSm_lead_w) {
		sm_lead_w = newSm_lead_w;
	}
	public Integer getSm_oneof_w() {
		return sm_oneof_w;
	}
	public void setSm_oneof_w(Integer newSm_oneof_w) {
		sm_oneof_w = newSm_oneof_w;
	}
	public Integer getSm_to_w() {
		return sm_to_w;
	}
	public void setSm_to_w(Integer newSm_to_w) {
		sm_to_w = newSm_to_w;
	}
}
