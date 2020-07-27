package application;

/* must be last */
public class list_objects_filter_options {
	private string_list filter_spec;
	private list_objects_filter_choice choice;
	private int no_filter;
	private Byte sparse_oid_name;
	private long blob_limit_value;
	private long tree_exclude_depth;
	private Object sub_nr;
	private Object sub_alloc;
	private list_objects_filter_options[] sub;
	
	public list_objects_filter_options(string_list filter_spec, list_objects_filter_choice choice, int no_filter, Byte sparse_oid_name, long blob_limit_value, long tree_exclude_depth, Object sub_nr, Object sub_alloc, list_objects_filter_options[] sub) {
		setFilter_spec(filter_spec);
		setChoice(choice);
		setNo_filter(no_filter);
		setSparse_oid_name(sparse_oid_name);
		setBlob_limit_value(blob_limit_value);
		setTree_exclude_depth(tree_exclude_depth);
		setSub_nr(sub_nr);
		setSub_alloc(sub_alloc);
		setSub(sub);
	}
	public list_objects_filter_options() {
	}
	
	public void list_objects_filter_set_no_filter() {
		ModernizedCProgram.filter_options.list_objects_filter_release();
		ModernizedCProgram.filter_options.setNo_filter(1);
	}
	public void filter_spec_append_urlencode(Object raw) {
		strbuf buf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		buf.strbuf_addstr_urlencode(raw, allow_unencoded);
		byte[] generatedBuf = buf.getBuf();
		do {
			if (ModernizedCProgram.trace_default_key.trace_pass_fl()) {
				ModernizedCProgram.trace_default_key.trace_printf_key_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\list-objects-filter-options.c", 186, "Add to combine filter-spec: %s\n", generatedBuf);
			} 
		} while (0);
		string_list_item string_list_item = new string_list_item();
		string_list_item.string_list_append(ModernizedCProgram.filter.getFilter_spec(), buf.strbuf_detach(((Object)0/*
		 * Changes filter_options into an equivalent LOFC_COMBINE filter options
		 * instance. Does not do anything if filter_options is already LOFC_COMBINE.
		 */)));
	}
	public void transform_to_combine_type() {
		((ModernizedCProgram.filter_options.getChoice()) ? (Object)0 : /*Error: Function owner not recognized*/_assert("filter_options->choice", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\list-objects-filter-options.c", 197));
		if (ModernizedCProgram.filter_options.getChoice() == list_objects_filter_choice.LOFC_COMBINE) {
			return /*Error: Unsupported expression*/;
		} 
		{ 
			int initial_sub_alloc = 2;
			list_objects_filter_options sub_array = ModernizedCProgram.xcalloc(initial_sub_alloc, /*Error: sizeof expression not supported yet*/);
			sub_array[0] = ModernizedCProgram.filter_options;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.filter_options, 0, /*Error: sizeof expression not supported yet*/);
			ModernizedCProgram.filter_options.setSub(sub_array);
			ModernizedCProgram.filter_options.setSub_alloc(initial_sub_alloc);
		}
		ModernizedCProgram.filter_options.setSub_nr(1);
		ModernizedCProgram.filter_options.setChoice(list_objects_filter_choice.LOFC_COMBINE);
		string_list_item string_list_item = new string_list_item();
		string_list_item.string_list_append(ModernizedCProgram.filter_options.getFilter_spec(), ModernizedCProgram.xstrdup("combine:"));
		ModernizedCProgram.filter_options.filter_spec_append_urlencode(ModernizedCProgram.filter_options.getSub()[0/*
			 * We don't need the filter_spec strings for subfilter specs, only the
			 * top level.
			 */].list_objects_filter_spec());
		ModernizedCProgram.filter_options.getSub()[0].getFilter_spec().string_list_clear(/*free_util=*/0);
	}
	public void list_objects_filter_die_if_populated() {
		if (ModernizedCProgram.filter_options.getChoice()) {
			ModernizedCProgram.die(ModernizedCProgram._("multiple filter-specs cannot be combined"));
		} 
	}
	public void parse_list_objects_filter(Object arg) {
		strbuf errbuf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int parse_error;
		string_list_item string_list_item = new string_list_item();
		if (!ModernizedCProgram.filter_options.getChoice()) {
			string_list_item.string_list_append(ModernizedCProgram.filter_options.getFilter_spec(), ModernizedCProgram.xstrdup(arg));
			parse_error = ModernizedCProgram.gently_parse_list_objects_filter(ModernizedCProgram.filter_options, arg, errbuf/*
					 * Make filter_options an LOFC_COMBINE spec so we can trivially
					 * add subspecs to it.
					 */);
		} else {
				ModernizedCProgram.filter_options.transform_to_combine_type();
				string_list_item.string_list_append(ModernizedCProgram.filter_options.getFilter_spec(), ModernizedCProgram.xstrdup("+"));
				ModernizedCProgram.filter_options.filter_spec_append_urlencode(arg);
				do {
					if (1) {
						size_t new_nr = ModernizedCProgram.filter_options.getSub_nr() + (true);
						if (new_nr < ModernizedCProgram.filter_options.getSub_nr()) {
							ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\list-objects-filter-options.c", 251, "negative growth in ALLOC_GROW_BY");
						} 
						do {
							if ((new_nr) > ModernizedCProgram.filter_options.getSub_alloc()) {
								if ((((ModernizedCProgram.filter_options.getSub_alloc()) + 16) * 3 / 2) < (new_nr)) {
									ModernizedCProgram.filter_options.setSub_alloc((new_nr));
								} else {
										ModernizedCProgram.filter_options.setSub_alloc((((ModernizedCProgram.filter_options.getSub_alloc()) + 16) * 3 / 2));
								} 
								(ModernizedCProgram.filter_options.getSub()) = ModernizedCProgram.xrealloc((ModernizedCProgram.filter_options.getSub()), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (ModernizedCProgram.filter_options.getSub_alloc())));
							} 
						} while (0);
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset((ModernizedCProgram.filter_options.getSub()) + ModernizedCProgram.filter_options.getSub_nr(), 0, /*Error: sizeof expression not supported yet*/ * (true));
						ModernizedCProgram.filter_options.setSub_nr(new_nr);
					} 
				} while (0);
				parse_error = ModernizedCProgram.gently_parse_list_objects_filter(ModernizedCProgram.filter_options.getSub()[ModernizedCProgram.filter_options.getSub_nr() - 1], arg, errbuf);
		} 
		byte[] generatedBuf = errbuf.getBuf();
		if (parse_error) {
			ModernizedCProgram.die("%s", generatedBuf);
		} 
	}
	public Object list_objects_filter_spec() {
		if (!ModernizedCProgram.filter.getFilter_spec().getNr()) {
			ModernizedCProgram.BUG_fl("E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Git\\src\\list-objects-filter-options.c", 276, "no filter_spec available for this filter");
		} 
		string_list_item string_list_item = new string_list_item();
		if (ModernizedCProgram.filter.getFilter_spec().getNr() != 1) {
			strbuf concatted = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			ModernizedCProgram.strbuf_add_separated_string_list(concatted, "", ModernizedCProgram.filter.getFilter_spec());
			ModernizedCProgram.filter.getFilter_spec().string_list_clear(/*free_util=*/0);
			string_list_item.string_list_append(ModernizedCProgram.filter.getFilter_spec(), concatted.strbuf_detach(((Object)0)));
		} 
		return ModernizedCProgram.filter.getFilter_spec().getItems()[0].getString();
	}
	public Object expand_list_objects_filter_spec() {
		string_list_item string_list_item = new string_list_item();
		if (ModernizedCProgram.filter.getChoice() == list_objects_filter_choice.LOFC_BLOB_LIMIT) {
			strbuf expanded_spec = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			expanded_spec.strbuf_addf("blob:limit=%lu", ModernizedCProgram.filter.getBlob_limit_value());
			ModernizedCProgram.filter.getFilter_spec().string_list_clear(/*free_util=*/0);
			string_list_item.string_list_append(ModernizedCProgram.filter.getFilter_spec(), expanded_spec.strbuf_detach(((Object)0)));
		} 
		return ModernizedCProgram.filter.list_objects_filter_spec();
	}
	public void list_objects_filter_release() {
		size_t sub = new size_t();
		if (!ModernizedCProgram.filter_options) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.filter_options.getFilter_spec().string_list_clear(/*free_util=*/0);
		ModernizedCProgram.free(ModernizedCProgram.filter_options.getSparse_oid_name());
		for (sub = 0; sub < ModernizedCProgram.filter_options.getSub_nr(); sub++) {
			ModernizedCProgram.filter_options.getSub()[sub].list_objects_filter_release();
		}
		ModernizedCProgram.free(ModernizedCProgram.filter_options.getSub());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.filter_options, 0, /*Error: sizeof expression not supported yet*/);
	}
	public void partial_clone_register(Object remote) {
		byte cfg_name;
		byte filter_name;
		promisor_remote promisor_remote = new promisor_remote();
		if (!promisor_remote.promisor_remote_find(/* Check if it is already registered */remote)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config_set("core.repositoryformatversion", "1");
			cfg_name = ModernizedCProgram.xstrfmt("remote.%s.promisor", /* Add promisor config for the remote */remote);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config_set(cfg_name, "true");
			ModernizedCProgram.free(cfg_name/*
				 * Record the initial filter-spec in the config as
				 * the default for subsequent fetches from this remote.
				 */);
		} 
		filter_name = ModernizedCProgram.xstrfmt("remote.%s.partialclonefilter", remote);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/git_config_set(/* NEEDSWORK: 'expand' result leaking??? */filter_name, ModernizedCProgram.filter_options.expand_list_objects_filter_spec());
		ModernizedCProgram.free(filter_name);
		ModernizedCProgram.promisor_remote_reinit();
	}
	public void partial_clone_get_default_filter_spec(Object remote) {
		promisor_remote promisor_remote = new promisor_remote();
		promisor_remote promisor = promisor_remote.promisor_remote_find(remote);
		strbuf errbuf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		if (!promisor) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedPartial_clone_filter = promisor.getPartial_clone_filter();
		string_list_item string_list_item = new string_list_item();
		string_list_item.string_list_append(ModernizedCProgram.filter_options.getFilter_spec(), generatedPartial_clone_filter);
		ModernizedCProgram.gently_parse_list_objects_filter(ModernizedCProgram.filter_options, generatedPartial_clone_filter, errbuf);
		errbuf.strbuf_release();
	}
	public string_list getFilter_spec() {
		return filter_spec;
	}
	public void setFilter_spec(string_list newFilter_spec) {
		filter_spec = newFilter_spec;
	}
	public list_objects_filter_choice getChoice() {
		return choice;
	}
	public void setChoice(list_objects_filter_choice newChoice) {
		choice = newChoice;
	}
	public int getNo_filter() {
		return no_filter;
	}
	public void setNo_filter(int newNo_filter) {
		no_filter = newNo_filter;
	}
	public Byte getSparse_oid_name() {
		return sparse_oid_name;
	}
	public void setSparse_oid_name(Byte newSparse_oid_name) {
		sparse_oid_name = newSparse_oid_name;
	}
	public long getBlob_limit_value() {
		return blob_limit_value;
	}
	public void setBlob_limit_value(long newBlob_limit_value) {
		blob_limit_value = newBlob_limit_value;
	}
	public long getTree_exclude_depth() {
		return tree_exclude_depth;
	}
	public void setTree_exclude_depth(long newTree_exclude_depth) {
		tree_exclude_depth = newTree_exclude_depth;
	}
	public Object getSub_nr() {
		return sub_nr;
	}
	public void setSub_nr(Object newSub_nr) {
		sub_nr = newSub_nr;
	}
	public Object getSub_alloc() {
		return sub_alloc;
	}
	public void setSub_alloc(Object newSub_alloc) {
		sub_alloc = newSub_alloc;
	}
	public list_objects_filter_options[] getSub() {
		return sub;
	}
	public void setSub(list_objects_filter_options[] newSub) {
		sub = newSub;
	}
}
/*
	 * 'filter_spec' is the raw argument value given on the command line
	 * or protocol request.  (The part after the "--keyword=".)  For
	 * commands that launch filtering sub-processes, or for communication
	 * over the network, don't use this value; use the result of
	 * expand_list_objects_filter_spec() instead.
	 * To get the raw filter spec given by the user, use the result of
	 * list_objects_filter_spec().
	 */
/*
	 * END choice-specific parsed values.
	 */
/*
 * Parses the filter spec string given by arg and either (1) simply places the
 * result in filter_options if it is not yet populated or (2) combines it with
 * the filter already in filter_options if it is already populated. In the case
 * of (2), the filter specs are combined as if specified with 'combine:'.
 *
 * Dies and prints a user-facing message if an error occurs.
 */
/*
 * Returns the filter spec string more or less in the form as the user
 * entered it. This form of the filter_spec can be used in user-facing
 * messages.  Returns a string owned by the list_objects_filter_options
 * object.
 */
/* LIST_OBJECTS_FILTER_OPTIONS_H */
