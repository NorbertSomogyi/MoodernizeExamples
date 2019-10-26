package application;

public class add_opts {
	private int force;
	private int detach;
	private int quiet;
	private int checkout;
	private int keep_locked;
	
	public add_opts(int force, int detach, int quiet, int checkout, int keep_locked) {
		setForce(force);
		setDetach(detach);
		setQuiet(quiet);
		setCheckout(checkout);
		setKeep_locked(keep_locked);
	}
	public add_opts() {
	}
	
	public int getForce() {
		return force;
	}
	public void setForce(int newForce) {
		force = newForce;
	}
	public int getDetach() {
		return detach;
	}
	public void setDetach(int newDetach) {
		detach = newDetach;
	}
	public int getQuiet() {
		return quiet;
	}
	public void setQuiet(int newQuiet) {
		quiet = newQuiet;
	}
	public int getCheckout() {
		return checkout;
	}
	public void setCheckout(int newCheckout) {
		checkout = newCheckout;
	}
	public int getKeep_locked() {
		return keep_locked;
	}
	public void setKeep_locked(int newKeep_locked) {
		keep_locked = newKeep_locked;
	}
}
