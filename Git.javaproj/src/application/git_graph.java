package application;

public class git_graph {
	private commit commit;
	private rev_info revs;
	private int num_parents;
	private int width;
	private int expansion_row;
	private graph_state state;
	private graph_state prev_state;
	private int commit_index;
	private int prev_commit_index;
	private int column_capacity;
	private int num_columns;
	private int num_new_columns;
	private int mapping_size;
	private column[] columns;
	private column[] new_columns;
	private int[] mapping;
	private int[] new_mapping;
	private int default_column_color;
	
	public git_graph(commit commit, rev_info revs, int num_parents, int width, int expansion_row, graph_state state, graph_state prev_state, int commit_index, int prev_commit_index, int column_capacity, int num_columns, int num_new_columns, int mapping_size, column[] columns, column[] new_columns, int[] mapping, int[] new_mapping, int default_column_color) {
		setCommit(commit);
		setRevs(revs);
		setNum_parents(num_parents);
		setWidth(width);
		setExpansion_row(expansion_row);
		setState(state);
		setPrev_state(prev_state);
		setCommit_index(commit_index);
		setPrev_commit_index(prev_commit_index);
		setColumn_capacity(column_capacity);
		setNum_columns(num_columns);
		setNum_new_columns(num_new_columns);
		setMapping_size(mapping_size);
		setColumns(columns);
		setNew_columns(new_columns);
		setMapping(mapping);
		setNew_mapping(new_mapping);
		setDefault_column_color(default_column_color);
	}
	public git_graph() {
	}
	
	public git_graph graph_init(rev_info opt) {
		git_graph graph = ModernizedCProgram.xmalloc(/*Error: Unsupported expression*/);
		Object[][] generatedArgv = custom_colors.getArgv();
		int generatedArgc = custom_colors.getArgc();
		if (!ModernizedCProgram.column_colors) {
			byte string;
			if (/*Error: Function owner not recognized*/git_config_get_string("log.graphcolors", ModernizedCProgram.string)) {
				ModernizedCProgram.graph_set_column_colors(/* not configured -- use default */ModernizedCProgram.column_colors_ansi, ModernizedCProgram.column_colors_ansi_max);
			} else {
					argv_array custom_colors = new argv_array(ModernizedCProgram.empty_argv, 0, 0);
					custom_colors.argv_array_clear();
					custom_colors.parse_graph_colors_config(ModernizedCProgram.string);
					ModernizedCProgram.free(ModernizedCProgram.string);
					ModernizedCProgram.graph_set_column_colors(generatedArgv, generatedArgc - 1);
			} 
		} 
		graph.setCommit(((Object)0));
		graph.setRevs(opt);
		graph.setNum_parents(0);
		graph.setExpansion_row(0);
		graph.setState(graph_state.GRAPH_PADDING);
		graph.setPrev_state(graph_state.GRAPH_PADDING);
		graph.setCommit_index(0);
		graph.setPrev_commit_index(0);
		graph.setNum_columns(0);
		graph.setNum_new_columns(0);
		graph.setMapping_size(0/*
			 * Start the column color at the maximum value, since we'll
			 * always increment it for the first commit we output.
			 * This way we start at 0 for the first commit.
			 */);
		graph.setDefault_column_color(ModernizedCProgram.column_colors_max - 1/*
			 * Allocate a reasonably large default number of columns
			 * We'll automatically grow columns later if we need more room.
			 */);
		graph.setColumn_capacity(30);
		column[] generatedColumns = graph.getColumns();
		int generatedColumn_capacity = graph.getColumn_capacity();
		(generatedColumns) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedColumn_capacity)));
		column[] generatedNew_columns = graph.getNew_columns();
		(generatedNew_columns) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedColumn_capacity)));
		int[] generatedMapping = graph.getMapping();
		(generatedMapping) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (2 * generatedColumn_capacity)));
		int[] generatedNew_mapping = graph.getNew_mapping();
		(generatedNew_mapping) = ModernizedCProgram.xmalloc(ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (2 * generatedColumn_capacity)));
		diff_options generatedDiffopt = opt.getDiffopt();
		generatedDiffopt.setOutput_prefix(diff_output_prefix_callback);
		generatedDiffopt.setOutput_prefix_data(graph);
		return graph;
	}
	public void graph_update_state(graph_state s) {
		graph_state generatedState = this.getState();
		this.setPrev_state(generatedState);
		this.setState(graph_state.s);
	}
	public void graph_ensure_capacity(int num_columns) {
		int generatedColumn_capacity = this.getColumn_capacity();
		if (generatedColumn_capacity >= num_columns) {
			return /*Error: Unsupported expression*/;
		} 
		do {
			generatedColumn_capacity *= 2;
		} while (generatedColumn_capacity < num_columns);
		column[] generatedColumns = this.getColumns();
		(generatedColumns) = ModernizedCProgram.xrealloc((generatedColumns), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedColumn_capacity)));
		column[] generatedNew_columns = this.getNew_columns();
		(generatedNew_columns) = ModernizedCProgram.xrealloc((generatedNew_columns), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedColumn_capacity)));
		int[] generatedMapping = this.getMapping();
		(generatedMapping) = ModernizedCProgram.xrealloc((generatedMapping), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedColumn_capacity * 2)));
		int[] generatedNew_mapping = this.getNew_mapping();
		(generatedNew_mapping) = ModernizedCProgram.xrealloc((generatedNew_mapping), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (generatedColumn_capacity * 2/*
		 * Returns 1 if the commit will be printed in the graph output,
		 * and 0 otherwise.
		 */)));
	}
	public void graph_increment_column_color() {
		int generatedDefault_column_color = this.getDefault_column_color();
		this.setDefault_column_color((generatedDefault_column_color + 1) % ModernizedCProgram.column_colors_max);
	}
	public void graph_update_width(int is_commit_in_existing_columns) {
		int generatedNum_columns = this.getNum_columns();
		int generatedNum_parents = this.getNum_parents();
		int max_cols = generatedNum_columns + generatedNum_parents;
		if (generatedNum_parents < 1) {
			max_cols/*
				 * We added a column for the current commit as part of
				 * graph->num_parents.  If the current commit was already in
				 * graph->columns, then we have double counted it.
				 */++;
		} 
		if (is_commit_in_existing_columns) {
			max_cols/*
				 * Each column takes up 2 spaces
				 */--;
		} 
		this.setWidth(max_cols * 2);
	}
	/*
		 * Compute the width needed to display the graph for this commit.
		 * This is the maximum width needed for any row.  All other rows
		 * will be padded to this width.
		 *
		 * Compute the number of columns in the widest row:
		 * Count each existing column (graph->num_columns), and each new
		 * column added by this commit.
		 */
	public void graph_update_columns() {
		commit_list parent = new commit_list();
		int max_new_columns;
		int mapping_idx;
		int i;
		int seen_this;
		int is_commit_in_columns;
		/*
			 * Swap graph->columns with graph->new_columns
			 * graph->columns contains the state for the previous commit,
			 * and new_columns now contains the state for our commit.
			 *
			 * We'll re-use the old columns array as storage to compute the new
			 * columns list for the commit after this one.
			 */
		column[] generatedColumns = this.getColumns();
		column[] generatedNew_columns = this.getNew_columns();
		do {
			Object _swap_a_ptr = (generatedColumns);
			Object _swap_b_ptr = (generatedNew_columns);
			byte[] _swap_buffer = new byte[/*Error: sizeof expression not supported yet*/];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_buffer, _swap_a_ptr, /*Error: sizeof expression not supported yet*/);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_a_ptr, _swap_b_ptr, /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(_swap_b_ptr, _swap_buffer, /*Error: sizeof expression not supported yet*/);
		} while (0);
		int generatedNum_new_columns = this.getNum_new_columns();
		this.setNum_columns(generatedNum_new_columns);
		this.setNum_new_columns(0/*
			 * Now update new_columns and mapping with the information for the
			 * commit after this one.
			 *
			 * First, make sure we have enough room.  At most, there will
			 * be graph->num_columns + graph->num_parents columns for the next
			 * commit.
			 */);
		int generatedNum_columns = this.getNum_columns();
		int generatedNum_parents = this.getNum_parents();
		max_new_columns = generatedNum_columns + generatedNum_parents;
		graph.graph_ensure_capacity(max_new_columns/*
			 * Clear out graph->mapping
			 */);
		this.setMapping_size(2 * max_new_columns);
		int generatedMapping_size = this.getMapping_size();
		int[] generatedMapping = this.getMapping();
		for (i = 0; i < generatedMapping_size; i++) {
			generatedMapping[i] = -1/*
				 * Populate graph->new_columns and graph->mapping
				 *
				 * Some of the parents of this commit may already be in
				 * graph->columns.  If so, graph->new_columns should only contain a
				 * single entry for each such commit.  graph->mapping should
				 * contain information about where each current branch line is
				 * supposed to end up after the collapsing is performed.
				 */;
		}
		seen_this = 0;
		mapping_idx = 0;
		is_commit_in_columns = 1;
		commit generatedCommit = this.getCommit();
		commit generatedItem = parent.getItem();
		commit_list commit_list = new commit_list();
		for (i = 0; i <= generatedNum_columns; i++) {
			commit col_commit = new commit();
			if (i == generatedNum_columns) {
				if (seen_this) {
					break;
				} 
				is_commit_in_columns = 0;
				col_commit = generatedCommit;
			} else {
					col_commit = generatedCommit;
			} 
			if (col_commit == generatedCommit) {
				int old_mapping_idx = mapping_idx;
				seen_this = 1;
				this.setCommit_index(i);
				for (parent = commit_list.first_interesting_parent(graph); parent; parent = parent/*
								 * If this is a merge, or the start of a new
								 * childless column, increment the current
								 * color.
								 */.next_interesting_parent(graph)) {
					if (generatedNum_parents > 1 || !is_commit_in_columns) {
						graph.graph_increment_column_color();
					} 
					ModernizedCProgram.graph_insert_into_new_columns(graph, generatedItem, mapping_idx/*
								 * We always need to increment mapping_idx by at
								 * least 2, even if it has no interesting parents.
								 * The current commit always takes up at least 2
								 * spaces.
								 */);
				}
				if (mapping_idx == old_mapping_idx) {
					mapping_idx += 2;
				} 
			} else {
					ModernizedCProgram.graph_insert_into_new_columns(graph, col_commit, mapping_idx);
			} 
		}
		while (generatedMapping_size > /*
			 * Shrink mapping_size to be the minimum necessary
			 */1 && generatedMapping[generatedMapping_size - 1] < 0) {
			generatedMapping_size--;
		}
		graph.graph_update_width(is_commit_in_columns);
	}
	public int graph_is_mapping_correct() {
		int i;
		/*
			 * The mapping is up to date if each entry is at its target,
			 * or is 1 greater than its target.
			 * (If it is 1 greater than the target, '/' will be printed, so it
			 * will look correct on the next row.)
			 */
		int generatedMapping_size = this.getMapping_size();
		int[] generatedMapping = this.getMapping();
		for (i = 0; i < generatedMapping_size; i++) {
			int target = generatedMapping[i];
			if (ModernizedCProgram.target < 0) {
				continue;
			} 
			if (ModernizedCProgram.target == (i / 2)) {
				continue;
			} 
			return 0;
		}
		return 1;
	}
	public int graph_width() {
		int generatedWidth = this.getWidth();
		return generatedWidth;
	}
	public void graph_show_commit() {
		strbuf msgbuf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int shown_commit_line = 0;
		ModernizedCProgram.graph_show_line_prefix(ModernizedCProgram.default_diffopt);
		if (!graph) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.graph_is_commit_finished(graph)) {
			graph.graph_show_padding();
			shown_commit_line = 1;
		} 
		byte[] generatedBuf = msgbuf.getBuf();
		Object generatedLen = msgbuf.getLen();
		rev_info generatedRevs = this.getRevs();
		diff_options generatedDiffopt = generatedRevs.getDiffopt();
		_iobuf generatedFile = generatedDiffopt.getFile();
		while (!shown_commit_line && !ModernizedCProgram.graph_is_commit_finished(graph)) {
			shown_commit_line = ModernizedCProgram.graph_next_line(graph, msgbuf);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(generatedBuf, /*Error: Unsupported expression*/, generatedLen, generatedFile);
			if (!shown_commit_line) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putc((byte)'\n', generatedFile);
				ModernizedCProgram.graph_show_line_prefix(generatedDiffopt);
			} 
			msgbuf.strbuf_setlen(0);
		}
		msgbuf.strbuf_release();
	}
	public void graph_show_oneline() {
		strbuf msgbuf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		ModernizedCProgram.graph_show_line_prefix(ModernizedCProgram.default_diffopt);
		if (!graph) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.graph_next_line(graph, msgbuf);
		byte[] generatedBuf = msgbuf.getBuf();
		Object generatedLen = msgbuf.getLen();
		rev_info generatedRevs = this.getRevs();
		diff_options generatedDiffopt = generatedRevs.getDiffopt();
		_iobuf generatedFile = generatedDiffopt.getFile();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(generatedBuf, /*Error: Unsupported expression*/, generatedLen, generatedFile);
		msgbuf.strbuf_release();
	}
	public void graph_show_padding() {
		strbuf msgbuf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		ModernizedCProgram.graph_show_line_prefix(ModernizedCProgram.default_diffopt);
		if (!graph) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.graph_padding_line(graph, msgbuf);
		byte[] generatedBuf = msgbuf.getBuf();
		Object generatedLen = msgbuf.getLen();
		rev_info generatedRevs = this.getRevs();
		diff_options generatedDiffopt = generatedRevs.getDiffopt();
		_iobuf generatedFile = generatedDiffopt.getFile();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(generatedBuf, /*Error: Unsupported expression*/, generatedLen, generatedFile);
		msgbuf.strbuf_release();
	}
	public int graph_show_remainder() {
		strbuf msgbuf = new strbuf(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		int shown = 0;
		ModernizedCProgram.graph_show_line_prefix(ModernizedCProgram.default_diffopt);
		if (!graph) {
			return 0;
		} 
		if (ModernizedCProgram.graph_is_commit_finished(graph)) {
			return 0;
		} 
		byte[] generatedBuf = msgbuf.getBuf();
		Object generatedLen = msgbuf.getLen();
		rev_info generatedRevs = this.getRevs();
		diff_options generatedDiffopt = generatedRevs.getDiffopt();
		_iobuf generatedFile = generatedDiffopt.getFile();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			ModernizedCProgram.graph_next_line(graph, msgbuf);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(generatedBuf, /*Error: Unsupported expression*/, generatedLen, generatedFile);
			msgbuf.strbuf_setlen(0);
			shown = 1;
			if (!ModernizedCProgram.graph_is_commit_finished(graph)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/putc((byte)'\n', generatedFile);
				ModernizedCProgram.graph_show_line_prefix(generatedDiffopt);
			} else {
					break;
			} 
		}
		msgbuf.strbuf_release();
		return shown;
	}
	public commit getCommit() {
		return commit;
	}
	public void setCommit(commit newCommit) {
		commit = newCommit;
	}
	public rev_info getRevs() {
		return revs;
	}
	public void setRevs(rev_info newRevs) {
		revs = newRevs;
	}
	public int getNum_parents() {
		return num_parents;
	}
	public void setNum_parents(int newNum_parents) {
		num_parents = newNum_parents;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public int getExpansion_row() {
		return expansion_row;
	}
	public void setExpansion_row(int newExpansion_row) {
		expansion_row = newExpansion_row;
	}
	public graph_state getState() {
		return state;
	}
	public void setState(graph_state newState) {
		state = newState;
	}
	public graph_state getPrev_state() {
		return prev_state;
	}
	public void setPrev_state(graph_state newPrev_state) {
		prev_state = newPrev_state;
	}
	public int getCommit_index() {
		return commit_index;
	}
	public void setCommit_index(int newCommit_index) {
		commit_index = newCommit_index;
	}
	public int getPrev_commit_index() {
		return prev_commit_index;
	}
	public void setPrev_commit_index(int newPrev_commit_index) {
		prev_commit_index = newPrev_commit_index;
	}
	public int getColumn_capacity() {
		return column_capacity;
	}
	public void setColumn_capacity(int newColumn_capacity) {
		column_capacity = newColumn_capacity;
	}
	public int getNum_columns() {
		return num_columns;
	}
	public void setNum_columns(int newNum_columns) {
		num_columns = newNum_columns;
	}
	public int getNum_new_columns() {
		return num_new_columns;
	}
	public void setNum_new_columns(int newNum_new_columns) {
		num_new_columns = newNum_new_columns;
	}
	public int getMapping_size() {
		return mapping_size;
	}
	public void setMapping_size(int newMapping_size) {
		mapping_size = newMapping_size;
	}
	public column[] getColumns() {
		return columns;
	}
	public void setColumns(column[] newColumns) {
		columns = newColumns;
	}
	public column[] getNew_columns() {
		return new_columns;
	}
	public void setNew_columns(column[] newNew_columns) {
		new_columns = newNew_columns;
	}
	public int[] getMapping() {
		return mapping;
	}
	public void setMapping(int[] newMapping) {
		mapping = newMapping;
	}
	public int[] getNew_mapping() {
		return new_mapping;
	}
	public void setNew_mapping(int[] newNew_mapping) {
		new_mapping = newNew_mapping;
	}
	public int getDefault_column_color() {
		return default_column_color;
	}
	public void setDefault_column_color(int newDefault_column_color) {
		default_column_color = newDefault_column_color;
	}
}
/*
	 * The commit currently being processed
	 */
