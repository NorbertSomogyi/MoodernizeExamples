package application;

public class shortlog {
	private string_list list;
	private int summary;
	private int wrap_lines;
	private int sort_by_number;
	private int wrap;
	private int in1;
	private int in2;
	private int user_format;
	private int abbrev;
	private int committer;
	private Byte common_repo_prefix;
	private int email;
	private string_list mailmap;
	private Object file;
	
	public shortlog(string_list list, int summary, int wrap_lines, int sort_by_number, int wrap, int in1, int in2, int user_format, int abbrev, int committer, Byte common_repo_prefix, int email, string_list mailmap, Object file) {
		setList(list);
		setSummary(summary);
		setWrap_lines(wrap_lines);
		setSort_by_number(sort_by_number);
		setWrap(wrap);
		setIn1(in1);
		setIn2(in2);
		setUser_format(user_format);
		setAbbrev(abbrev);
		setCommitter(committer);
		setCommon_repo_prefix(common_repo_prefix);
		setEmail(email);
		setMailmap(mailmap);
		setFile(file);
	}
	public shortlog() {
	}
	
	public void insert_one_record(Object author, Object oneline) {
		string_list_item item = new string_list_item();
		string_list generatedList = this.getList();
		string_list_item string_list_item = new string_list_item();
		item = string_list_item.string_list_insert(generatedList, author);
		int generatedSummary = this.getSummary();
		Object generatedUtil = (item).getUtil();
		Byte generatedCommon_repo_prefix = this.getCommon_repo_prefix();
		if (generatedSummary) {
			item.setUtil((Object)(((intptr_t)generatedUtil) + 1));
		} else {
				byte dot3 = generatedCommon_repo_prefix;
				byte buffer;
				byte p;
				strbuf subject = new strbuf(, , );
				byte eol;
				while (oneline && ((ModernizedCProgram.sane_ctype[(byte)(oneline)] & (true)) != /* Skip any leading whitespace, including any blank lines. */0)) {
					oneline++;
				}
				eol = .strchr(oneline, (byte)'\n');
				if (!eol) {
					eol = oneline + .strlen(oneline);
				} 
				if (ModernizedCProgram.starts_with(oneline, "[PATCH")) {
					byte eob = .strchr(oneline, (byte)']');
					if (eob && (!eol || eob < eol)) {
						oneline = eob + 1;
					} 
				} 
				while (oneline && ((ModernizedCProgram.sane_ctype[(byte)(oneline)] & (true)) != 0) && oneline != (byte)'\n') {
					oneline++;
				}
				subject.format_subject(oneline, " ");
				ModernizedCProgram.buffer = subject.strbuf_detach(((Object)0));
				if (dot3) {
					int dot3len = .strlen(dot3);
					if (dot3len > 5) {
						while ((p = .strstr(ModernizedCProgram.buffer, dot3)) != ((Object)0)) {
							int taillen = .strlen(p) - dot3len;
							.memcpy(p, "/.../", 5);
							.memmove(p + 5, p + dot3len, taillen + 1);
						}
					} 
				} 
				if (generatedUtil == ((Object)0)) {
					item.setUtil(ModernizedCProgram.xcalloc(1, ));
				} 
				generatedUtil.string_list_append(ModernizedCProgram.buffer);
		} 
	}
	public void read_from_stdin() {
		strbuf author = new strbuf(, , );
		strbuf mapped_author = new strbuf(, , );
		strbuf oneline = new strbuf(, , );
		byte[] author_match = new byte[]{"Author: ", "author "};
		byte[] committer_match = new byte[]{"Commit: ", "committer "};
		byte match;
		int generatedCommitter = this.getCommitter();
		match = generatedCommitter ? committer_match : author_match;
		byte generatedBuf = author.getBuf();
		Object generatedLen = oneline.getLen();
		while (ModernizedCProgram.strbuf_getline_lf(author, (_iob[0])) != (true)) {
			byte v;
			if (!ModernizedCProgram.skip_prefix(generatedBuf, match[0], v) && !ModernizedCProgram.skip_prefix(generatedBuf, match[1], v)) {
				continue;
			} 
			while (ModernizedCProgram.strbuf_getline_lf(oneline, (_iob[0])) != (true) && generatedLen) {
				;
			}
			while (ModernizedCProgram.strbuf_getline_lf(oneline, (_iob[0])) != (true) && !generatedLen) {
				;
			}
			mapped_author.strbuf_setlen(0);
			if (ModernizedCProgram.parse_stdin_author(log, mapped_author, v) < 0) {
				continue;
			} 
			log.insert_one_record(generatedBuf, generatedBuf);
		}
		author.strbuf_release();
		mapped_author.strbuf_release();
		oneline.strbuf_release();
	}
	public void shortlog_init() {
		.memset(log, 0, );
		string_list generatedMailmap = this.getMailmap();
		Byte generatedCommon_repo_prefix = this.getCommon_repo_prefix();
		generatedMailmap.read_mailmap(generatedCommon_repo_prefix);
		string_list generatedList = this.getList();
		generatedList.setStrdup_strings(1);
		this.setWrap(76);
		this.setIn1(6);
		this.setIn2(9);
	}
	public void shortlog_output() {
		int i;
		int j;
		strbuf sb = new strbuf(, , );
		int generatedSort_by_number = this.getSort_by_number();
		string_list generatedList = this.getList();
		string_list_item generatedItems = generatedList.getItems();
		int generatedNr = generatedList.getNr();
		int generatedSummary = this.getSummary();
		if (generatedSort_by_number) {
			ModernizedCProgram.sane_qsort((generatedItems), (generatedNr), , generatedSummary ? compare_by_counter : compare_by_list);
		} 
		Object generatedFile = this.getFile();
		int generatedWrap_lines = this.getWrap_lines();
		byte generatedBuf = sb.getBuf();
		Object generatedLen = sb.getLen();
		for (i = 0; i < generatedNr; i++) {
			string_list_item item = generatedItems[i];
			if (generatedSummary) {
				.fprintf(generatedFile, "%6d\t%s\n", (int)((intptr_t)(item).getUtil()), item.getString());
			} else {
					string_list onelines = item.getUtil();
					.fprintf(generatedFile, "%s (%d):\n", item.getString(), generatedNr);
					for (j = generatedNr - 1; j >= 0; j--) {
						byte msg = generatedItems[j].getString();
						if (generatedWrap_lines) {
							sb.strbuf_setlen(0);
							sb.add_wrapped_shortlog_msg(ModernizedCProgram.msg, log);
							.fwrite(generatedBuf, generatedLen, 1, generatedFile);
						} else {
								.fprintf(generatedFile, "      %s\n", ModernizedCProgram.msg);
						} 
					}
					.putc((byte)'\n', generatedFile);
					onelines.setStrdup_strings(1);
					onelines.string_list_clear(0);
					ModernizedCProgram.free(onelines);
			} 
			generatedItems[i].setUtil(((Object)0));
		}
		sb.strbuf_release();
		generatedList.setStrdup_strings(1);
		generatedList.string_list_clear(1);
		string_list generatedMailmap = this.getMailmap();
		generatedMailmap.clear_mailmap();
	}
	public string_list getList() {
		return list;
	}
	public void setList(string_list newList) {
		list = newList;
	}
	public int getSummary() {
		return summary;
	}
	public void setSummary(int newSummary) {
		summary = newSummary;
	}
	public int getWrap_lines() {
		return wrap_lines;
	}
	public void setWrap_lines(int newWrap_lines) {
		wrap_lines = newWrap_lines;
	}
	public int getSort_by_number() {
		return sort_by_number;
	}
	public void setSort_by_number(int newSort_by_number) {
		sort_by_number = newSort_by_number;
	}
	public int getWrap() {
		return wrap;
	}
	public void setWrap(int newWrap) {
		wrap = newWrap;
	}
	public int getIn1() {
		return in1;
	}
	public void setIn1(int newIn1) {
		in1 = newIn1;
	}
	public int getIn2() {
		return in2;
	}
	public void setIn2(int newIn2) {
		in2 = newIn2;
	}
	public int getUser_format() {
		return user_format;
	}
	public void setUser_format(int newUser_format) {
		user_format = newUser_format;
	}
	public int getAbbrev() {
		return abbrev;
	}
	public void setAbbrev(int newAbbrev) {
		abbrev = newAbbrev;
	}
	public int getCommitter() {
		return committer;
	}
	public void setCommitter(int newCommitter) {
		committer = newCommitter;
	}
	public Byte getCommon_repo_prefix() {
		return common_repo_prefix;
	}
	public void setCommon_repo_prefix(Byte newCommon_repo_prefix) {
		common_repo_prefix = newCommon_repo_prefix;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int newEmail) {
		email = newEmail;
	}
	public string_list getMailmap() {
		return mailmap;
	}
	public void setMailmap(string_list newMailmap) {
		mailmap = newMailmap;
	}
	public Object getFile() {
		return file;
	}
	public void setFile(Object newFile) {
		file = newFile;
	}
}
