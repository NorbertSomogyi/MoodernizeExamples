package application;

public class git_transport_options {
	private int thin;
	private int keep;
	private int followtags;
	private int check_self_contained_and_connected;
	private int self_contained_and_connected;
	private int update_shallow;
	private int deepen_relative;
	private int from_promisor;
	private int no_dependents;
	private int connectivity_checked;
	private int depth;
	private Object deepen_since;
	private Object deepen_not;
	private Object uploadpack;
	private Object receivepack;
	private push_cas_option cas;
	private list_objects_filter_options filter_options;
	private oid_array negotiation_tips;
	
	public git_transport_options(int thin, int keep, int followtags, int check_self_contained_and_connected, int self_contained_and_connected, int update_shallow, int deepen_relative, int from_promisor, int no_dependents, int connectivity_checked, int depth, Object deepen_since, Object deepen_not, Object uploadpack, Object receivepack, push_cas_option cas, list_objects_filter_options filter_options, oid_array negotiation_tips) {
		setThin(thin);
		setKeep(keep);
		setFollowtags(followtags);
		setCheck_self_contained_and_connected(check_self_contained_and_connected);
		setSelf_contained_and_connected(self_contained_and_connected);
		setUpdate_shallow(update_shallow);
		setDeepen_relative(deepen_relative);
		setFrom_promisor(from_promisor);
		setNo_dependents(no_dependents);
		setConnectivity_checked(connectivity_checked);
		setDepth(depth);
		setDeepen_since(deepen_since);
		setDeepen_not(deepen_not);
		setUploadpack(uploadpack);
		setReceivepack(receivepack);
		setCas(cas);
		setFilter_options(filter_options);
		setNegotiation_tips(negotiation_tips);
	}
	public git_transport_options() {
	}
	
	public void add_negotiation_tips() {
		oid_array oids = ModernizedCProgram.xcalloc(1, );
		int i;
		int generatedNr = oids.getNr();
		for (i = 0; i < ModernizedCProgram.negotiation_tip.getNr(); i++) {
			byte s = ModernizedCProgram.negotiation_tip.getItems()[i].getString();
			int old_nr;
			if (!ModernizedCProgram.has_glob_specials(s)) {
				object_id oid = new object_id();
				if (ModernizedCProgram.repo_get_oid(ModernizedCProgram.the_repository, s, oid)) {
					ModernizedCProgram.die("%s is not a valid object", s);
				} 
				oids.oid_array_append(oid);
				continue;
			} 
			old_nr = generatedNr;
			ModernizedCProgram.for_each_glob_ref(add_oid, s, oids);
			if (old_nr == generatedNr) {
				ModernizedCProgram.warning("Ignoring --negotiation-tip=%s because it does not match any refs", s);
			} 
		}
		this.setNegotiation_tips(oids);
	}
	public int set_git_option(Object name, Object value) {
		list_objects_filter_options generatedFilter_options = this.getFilter_options();
		if (!.strcmp(name, "uploadpack")) {
			this.setUploadpack(value);
			return 0;
		}  else if (!.strcmp(name, "receivepack")) {
			this.setReceivepack(value);
			return 0;
		}  else if (!.strcmp(name, "thin")) {
			this.setThin(!!value);
			return 0;
		}  else if (!.strcmp(name, "followtags")) {
			this.setFollowtags(!!value);
			return 0;
		}  else if (!.strcmp(name, "keep")) {
			this.setKeep(!!value);
			return 0;
		}  else if (!.strcmp(name, "updateshallow")) {
			this.setUpdate_shallow(!!value);
			return 0;
		}  else if (!.strcmp(name, "depth")) {
			if (!value) {
				this.setDepth(0);
			} else {
					byte end;
					this.setDepth(.strtol(value, end, 0));
					if (end) {
						ModernizedCProgram.die(ModernizedCProgram._("transport: invalid depth option '%s'"), value);
					} 
			} 
			return 0;
		}  else if (!.strcmp(name, "deepen-since")) {
			this.setDeepen_since(value);
			return 0;
		}  else if (!.strcmp(name, "deepen-not")) {
			this.setDeepen_not((string_list)value);
			return 0;
		}  else if (!.strcmp(name, "deepen-relative")) {
			this.setDeepen_relative(!!value);
			return 0;
		}  else if (!.strcmp(name, "from-promisor")) {
			this.setFrom_promisor(!!value);
			return 0;
		}  else if (!.strcmp(name, "no-dependents")) {
			this.setNo_dependents(!!value);
			return 0;
		}  else if (!.strcmp(name, "filter")) {
			generatedFilter_options.list_objects_filter_die_if_populated();
			generatedFilter_options.parse_list_objects_filter(value);
			return 0;
		} 
		return 1;
	}
	public int getThin() {
		return thin;
	}
	public void setThin(int newThin) {
		thin = newThin;
	}
	public int getKeep() {
		return keep;
	}
	public void setKeep(int newKeep) {
		keep = newKeep;
	}
	public int getFollowtags() {
		return followtags;
	}
	public void setFollowtags(int newFollowtags) {
		followtags = newFollowtags;
	}
	public int getCheck_self_contained_and_connected() {
		return check_self_contained_and_connected;
	}
	public void setCheck_self_contained_and_connected(int newCheck_self_contained_and_connected) {
		check_self_contained_and_connected = newCheck_self_contained_and_connected;
	}
	public int getSelf_contained_and_connected() {
		return self_contained_and_connected;
	}
	public void setSelf_contained_and_connected(int newSelf_contained_and_connected) {
		self_contained_and_connected = newSelf_contained_and_connected;
	}
	public int getUpdate_shallow() {
		return update_shallow;
	}
	public void setUpdate_shallow(int newUpdate_shallow) {
		update_shallow = newUpdate_shallow;
	}
	public int getDeepen_relative() {
		return deepen_relative;
	}
	public void setDeepen_relative(int newDeepen_relative) {
		deepen_relative = newDeepen_relative;
	}
	public int getFrom_promisor() {
		return from_promisor;
	}
	public void setFrom_promisor(int newFrom_promisor) {
		from_promisor = newFrom_promisor;
	}
	public int getNo_dependents() {
		return no_dependents;
	}
	public void setNo_dependents(int newNo_dependents) {
		no_dependents = newNo_dependents;
	}
	public int getConnectivity_checked() {
		return connectivity_checked;
	}
	public void setConnectivity_checked(int newConnectivity_checked) {
		connectivity_checked = newConnectivity_checked;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int newDepth) {
		depth = newDepth;
	}
	public Object getDeepen_since() {
		return deepen_since;
	}
	public void setDeepen_since(Object newDeepen_since) {
		deepen_since = newDeepen_since;
	}
	public Object getDeepen_not() {
		return deepen_not;
	}
	public void setDeepen_not(Object newDeepen_not) {
		deepen_not = newDeepen_not;
	}
	public Object getUploadpack() {
		return uploadpack;
	}
	public void setUploadpack(Object newUploadpack) {
		uploadpack = newUploadpack;
	}
	public Object getReceivepack() {
		return receivepack;
	}
	public void setReceivepack(Object newReceivepack) {
		receivepack = newReceivepack;
	}
	public push_cas_option getCas() {
		return cas;
	}
	public void setCas(push_cas_option newCas) {
		cas = newCas;
	}
	public list_objects_filter_options getFilter_options() {
		return filter_options;
	}
	public void setFilter_options(list_objects_filter_options newFilter_options) {
		filter_options = newFilter_options;
	}
	public oid_array getNegotiation_tips() {
		return negotiation_tips;
	}
	public void setNegotiation_tips(oid_array newNegotiation_tips) {
		negotiation_tips = newNegotiation_tips;
	}
}
