package application;

/* (__linux__) */
public class ADLThermalControllerInfo {
	private int iSize;
	private int iThermalDomain;
	private int iDomainIndex;
	private int iFlags;
	
	public ADLThermalControllerInfo(int iSize, int iThermalDomain, int iDomainIndex, int iFlags) {
		setISize(iSize);
		setIThermalDomain(iThermalDomain);
		setIDomainIndex(iDomainIndex);
		setIFlags(iFlags);
	}
	public ADLThermalControllerInfo() {
	}
	
	public int getISize() {
		return iSize;
	}
	public void setISize(int newISize) {
		iSize = newISize;
	}
	public int getIThermalDomain() {
		return iThermalDomain;
	}
	public void setIThermalDomain(int newIThermalDomain) {
		iThermalDomain = newIThermalDomain;
	}
	public int getIDomainIndex() {
		return iDomainIndex;
	}
	public void setIDomainIndex(int newIDomainIndex) {
		iDomainIndex = newIDomainIndex;
	}
	public int getIFlags() {
		return iFlags;
	}
	public void setIFlags(int newIFlags) {
		iFlags = newIFlags;
	}
}
