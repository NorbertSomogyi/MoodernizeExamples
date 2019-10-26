package application;

/** \brief Structure to return CD vendor, model, and revision-level
      strings obtained via the INQUIRY command  */
public class cdio_hwinfo {
	private Object psz_vendor;
	private Object psz_model;
	private Object psz_revision;
	
	public cdio_hwinfo(Object psz_vendor, Object psz_model, Object psz_revision) {
		setPsz_vendor(psz_vendor);
		setPsz_model(psz_model);
		setPsz_revision(psz_revision);
	}
	public cdio_hwinfo() {
	}
	
	public Object getPsz_vendor() {
		return psz_vendor;
	}
	public void setPsz_vendor(Object newPsz_vendor) {
		psz_vendor = newPsz_vendor;
	}
	public Object getPsz_model() {
		return psz_model;
	}
	public void setPsz_model(Object newPsz_model) {
		psz_model = newPsz_model;
	}
	public Object getPsz_revision() {
		return psz_revision;
	}
	public void setPsz_revision(Object newPsz_revision) {
		psz_revision = newPsz_revision;
	}
}
