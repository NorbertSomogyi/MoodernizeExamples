package application;

/**
 * QP value for frames
 */
public class _NV_ENC_QP {
	private Object qpInterP;
	private Object qpInterB;
	private Object qpIntra;
	
	public _NV_ENC_QP(Object qpInterP, Object qpInterB, Object qpIntra) {
		setQpInterP(qpInterP);
		setQpInterB(qpInterB);
		setQpIntra(qpIntra);
	}
	public _NV_ENC_QP() {
	}
	
	public Object getQpInterP() {
		return qpInterP;
	}
	public void setQpInterP(Object newQpInterP) {
		qpInterP = newQpInterP;
	}
	public Object getQpInterB() {
		return qpInterB;
	}
	public void setQpInterB(Object newQpInterB) {
		qpInterB = newQpInterB;
	}
	public Object getQpIntra() {
		return qpIntra;
	}
	public void setQpIntra(Object newQpIntra) {
		qpIntra = newQpIntra;
	}
}
