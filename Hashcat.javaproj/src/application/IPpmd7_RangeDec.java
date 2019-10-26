package application;

/* ---------- Decode ---------- */
public class IPpmd7_RangeDec {
	private Object GetThreshold;
	private Object Decode;
	private Object DecodeBit;
	
	public IPpmd7_RangeDec(Object GetThreshold, Object Decode, Object DecodeBit) {
		setGetThreshold(GetThreshold);
		setDecode(Decode);
		setDecodeBit(DecodeBit);
	}
	public IPpmd7_RangeDec() {
	}
	
	public Object getGetThreshold() {
		return GetThreshold;
	}
	public void setGetThreshold(Object newGetThreshold) {
		GetThreshold = newGetThreshold;
	}
	public Object getDecode() {
		return Decode;
	}
	public void setDecode(Object newDecode) {
		Decode = newDecode;
	}
	public Object getDecodeBit() {
		return DecodeBit;
	}
	public void setDecodeBit(Object newDecodeBit) {
		DecodeBit = newDecodeBit;
	}
}
