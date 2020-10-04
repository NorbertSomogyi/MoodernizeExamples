package application;

public class itunes_backup {
	private Object[] wpky;
	private Object[] dpsl;
	
	public itunes_backup(Object[] wpky, Object[] dpsl) {
		setWpky(wpky);
		setDpsl(dpsl);
	}
	public itunes_backup() {
	}
	
	public Object[] getWpky() {
		return wpky;
	}
	public void setWpky(Object[] newWpky) {
		wpky = newWpky;
	}
	public Object[] getDpsl() {
		return dpsl;
	}
	public void setDpsl(Object[] newDpsl) {
		dpsl = newDpsl;
	}
}
