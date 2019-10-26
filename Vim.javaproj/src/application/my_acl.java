package application;

public class my_acl {
	private Object pSecurityDescriptor;
	private Object pSidOwner;
	private Object pSidGroup;
	private Object pDacl;
	private Object pSacl;
	
	public my_acl(Object pSecurityDescriptor, Object pSidOwner, Object pSidGroup, Object pDacl, Object pSacl) {
		setPSecurityDescriptor(pSecurityDescriptor);
		setPSidOwner(pSidOwner);
		setPSidGroup(pSidGroup);
		setPDacl(pDacl);
		setPSacl(pSacl);
	}
	public my_acl() {
	}
	
	public Object getPSecurityDescriptor() {
		return pSecurityDescriptor;
	}
	public void setPSecurityDescriptor(Object newPSecurityDescriptor) {
		pSecurityDescriptor = newPSecurityDescriptor;
	}
	public Object getPSidOwner() {
		return pSidOwner;
	}
	public void setPSidOwner(Object newPSidOwner) {
		pSidOwner = newPSidOwner;
	}
	public Object getPSidGroup() {
		return pSidGroup;
	}
	public void setPSidGroup(Object newPSidGroup) {
		pSidGroup = newPSidGroup;
	}
	public Object getPDacl() {
		return pDacl;
	}
	public void setPDacl(Object newPDacl) {
		pDacl = newPDacl;
	}
	public Object getPSacl() {
		return pSacl;
	}
	public void setPSacl(Object newPSacl) {
		pSacl = newPSacl;
	}
}
