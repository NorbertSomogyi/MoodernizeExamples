package application;

public class regitem_S {
	private regstate_E rs_state;
	private int rs_no;
	private Object rs_scan;
	private  rs_un;
	
	public regitem_S(regstate_E rs_state, int rs_no, Object rs_scan,  rs_un) {
		setRs_state(rs_state);
		setRs_no(rs_no);
		setRs_scan(rs_scan);
		setRs_un(rs_un);
	}
	public regitem_S() {
	}
	
	public regitem_S regstack_push(regstate_E state, Object scan) {
		regitem_T rp = new regitem_T();
		if ((long)((int)ModernizedCProgram.regstack.getGa_len() >> 10) >= ModernizedCProgram.p_mmp) {
			ModernizedCProgram.emsg(._(e_maxmempat));
			return NULL;
		} 
		if (ModernizedCProgram.regstack.ga_grow() == FAIL) {
			return NULL;
		} 
		rp = (regitem_T)((byte)ModernizedCProgram.regstack.getGa_data() + ModernizedCProgram.regstack.getGa_len());
		rp.setRs_state(state);
		rp.setRs_scan(scan);
		ModernizedCProgram.regstack.getGa_len() += ;
		return rp/*
		 * Pop an item from the regstack.
		 */;
	}
	public regstate_E getRs_state() {
		return rs_state;
	}
	public void setRs_state(regstate_E newRs_state) {
		rs_state = newRs_state;
	}
	public int getRs_no() {
		return rs_no;
	}
	public void setRs_no(int newRs_no) {
		rs_no = newRs_no;
	}
	public Object getRs_scan() {
		return rs_scan;
	}
	public void setRs_scan(Object newRs_scan) {
		rs_scan = newRs_scan;
	}
	public  getRs_un() {
		return rs_un;
	}
	public void setRs_un( newRs_un) {
		rs_un = newRs_un;
	}
}
