package application;

public class progress {
	private Object title;
	private Object last_value;
	private Object total;
	private int last_percent;
	private int delay;
	private int sparse;
	private throughput throughput;
	private Object start_ns;
	private strbuf counters_sb;
	private int title_len;
	private int split;
	
	public progress(Object title, Object last_value, Object total, int last_percent, int delay, int sparse, throughput throughput, Object start_ns, strbuf counters_sb, int title_len, int split) {
		setTitle(title);
		setLast_value(last_value);
		setTotal(total);
		setLast_percent(last_percent);
		setDelay(delay);
		setSparse(sparse);
		setThroughput(throughput);
		setStart_ns(start_ns);
		setCounters_sb(counters_sb);
		setTitle_len(title_len);
		setSplit(split);
	}
	public progress() {
	}
	
	public progress get_progress(unpack_trees_options o) {
		int cnt = 0;
		int total = 0;
		index_state generatedResult = o.getResult();
		index_state index = generatedResult;
		int generatedUpdate = o.getUpdate();
		int generatedVerbose_update = o.getVerbose_update();
		if (!generatedUpdate || !generatedVerbose_update) {
			return ((Object)0);
		} 
		int generatedCache_nr = index.getCache_nr();
		cache_entry[][] generatedCache = index.getCache();
		for (; cnt < generatedCache_nr; cnt++) {
			cache_entry ce = generatedCache[cnt];
			if (ce.getCe_flags() & ((1 << 16) | (1 << 22))) {
				total++;
			} 
		}
		progress progress = new progress();
		return progress.start_delayed_progress(ModernizedCProgram._("Updating files"), total);
	}
	public void display(Object n, Object done) {
		byte tp;
		strbuf counters_sb = ModernizedCProgram.progress.getCounters_sb();
		int show_update = 0;
		Object generatedLen = counters_sb.getLen();
		int last_count_len = generatedLen;
		if (ModernizedCProgram.progress.getDelay() && (!ModernizedCProgram.progress_update || --ModernizedCProgram.progress.getDelay())) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.progress.setLast_value(n);
		tp = (ModernizedCProgram.progress.getThroughput()) ? ModernizedCProgram.progress.getThroughput().getDisplay().getBuf() : "";
		if (ModernizedCProgram.progress.getTotal()) {
			int percent = n * 100 / ModernizedCProgram.progress.getTotal();
			if (percent != ModernizedCProgram.progress.getLast_percent() || ModernizedCProgram.progress_update) {
				ModernizedCProgram.progress.setLast_percent(percent);
				counters_sb.strbuf_setlen(0);
				counters_sb.strbuf_addf("%3u%% (%llu/%llu)%s", percent, (uintmax_t)n, (uintmax_t)ModernizedCProgram.progress.getTotal(), tp);
				show_update = 1;
			} 
		}  else if (ModernizedCProgram.progress_update) {
			counters_sb.strbuf_setlen(0);
			counters_sb.strbuf_addf("%llu%s", (uintmax_t)n, tp);
			show_update = 1;
		} 
		byte[] generatedBuf = counters_sb.getBuf();
		if (show_update) {
			if (ModernizedCProgram.is_foreground_fd((((_iob[2])).get_file())) || done) {
				byte eol = done ? done : "\r";
				size_t clear_len = generatedLen < last_count_len ? last_count_len - generatedLen + 1 : 0;
				size_t progress_line_len = ModernizedCProgram.progress.getTitle_len() + generatedLen + 2;
				int cols = ModernizedCProgram.term_columns();
				if (ModernizedCProgram.progress.getSplit()) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "  %s%*s", generatedBuf, (int)clear_len, eol);
				}  else if (!done && cols < progress_line_len) {
					clear_len = ModernizedCProgram.progress.getTitle_len() + 1 < cols ? cols - ModernizedCProgram.progress.getTitle_len() - 1 : 0;
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s:%*s\n  %s%s", ModernizedCProgram.progress.getTitle(), (int)clear_len, "", generatedBuf, eol);
					ModernizedCProgram.progress.setSplit(1);
				} else {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "%s: %s%*s", ModernizedCProgram.progress.getTitle(), generatedBuf, (int)clear_len, eol);
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fflush((_iob[2]));
			} 
			ModernizedCProgram.progress_update = 0;
		} 
	}
	public Object progress_getnanotime() {
		if (ModernizedCProgram.progress_testing) {
			return ModernizedCProgram.progress.getStart_ns() + ModernizedCProgram.progress_test_ns;
		} else {
				return ModernizedCProgram.getnanotime();
		} 
	}
	public void display_throughput(Object total) {
		throughput tp = new throughput();
		uint64_t now_ns = new uint64_t();
		int misecs;
		int count;
		int rate;
		if (!ModernizedCProgram.progress) {
			return /*Error: Unsupported expression*/;
		} 
		tp = ModernizedCProgram.progress.getThroughput();
		now_ns = ModernizedCProgram.progress.progress_getnanotime();
		strbuf generatedDisplay = tp.getDisplay();
		if (!tp) {
			ModernizedCProgram.progress.setThroughput(tp = ModernizedCProgram.xcalloc(1, /*Error: sizeof expression not supported yet*/));
			tp.setPrev_total(tp.setCurr_total(total));
			tp.setPrev_ns(now_ns);
			generatedDisplay.strbuf_init(0);
			return /*Error: Unsupported expression*/;
		} 
		tp.setCurr_total(total);
		Object generatedPrev_ns = tp.getPrev_ns();
		if (now_ns - generatedPrev_ns <= /* only update throughput every 0.5 s */500000000) {
			return /*Error: Unsupported expression*/;
		} 
		misecs = ((now_ns - generatedPrev_ns) * 4398) >> 32;
		Object generatedPrev_total = tp.getPrev_total();
		count = total - generatedPrev_total;
		tp.setPrev_total(total);
		tp.setPrev_ns(now_ns);
		int generatedAvg_bytes = tp.getAvg_bytes();
		generatedAvg_bytes += count;
		int generatedAvg_misecs = tp.getAvg_misecs();
		generatedAvg_misecs += misecs;
		rate = generatedAvg_bytes / generatedAvg_misecs;
		Object generatedLast_bytes = tp.getLast_bytes();
		int generatedIdx = tp.getIdx();
		generatedAvg_bytes -= generatedLast_bytes[generatedIdx];
		Object generatedLast_misecs = tp.getLast_misecs();
		generatedAvg_misecs -= generatedLast_misecs[generatedIdx];
		generatedLast_bytes[generatedIdx] = count;
		generatedLast_misecs[generatedIdx] = misecs;
		tp.setIdx((generatedIdx + 1) % 8);
		generatedDisplay.throughput_string(total, rate);
		if (ModernizedCProgram.progress.getLast_value() != -1 && ModernizedCProgram.progress_update) {
			ModernizedCProgram.progress.display(ModernizedCProgram.progress.getLast_value(), ((Object)0));
		} 
	}
	public void display_progress(Object n) {
		if (ModernizedCProgram.progress) {
			ModernizedCProgram.progress.display(n, ((Object)0));
		} 
	}
	public progress start_progress_delay(Object title, Object total, int delay, int sparse) {
		progress progress = ModernizedCProgram.xmalloc(/*Error: sizeof expression not supported yet*/);
		progress.setTitle(title);
		progress.setTotal(total);
		progress.setLast_value(-1);
		progress.setLast_percent(-1);
		progress.setDelay(delay);
		progress.setSparse(sparse);
		progress.setThroughput(((Object)0));
		progress.setStart_ns(ModernizedCProgram.getnanotime());
		strbuf generatedCounters_sb = progress.getCounters_sb();
		generatedCounters_sb.strbuf_init(0);
		progress.setTitle_len(ModernizedCProgram.utf8_strwidth(title));
		progress.setSplit(0);
		ModernizedCProgram.set_progress_signal();
		return progress;
	}
	public progress start_delayed_progress(Object title, Object total) {
		progress progress = new progress();
		return progress.start_progress_delay(title, total, 2, 0);
	}
	public progress start_progress(Object title, Object total) {
		progress progress = new progress();
		return progress.start_progress_delay(title, total, 0, 0/*
		 * Here "sparse" means that the caller might use some sampling criteria to
		 * decide when to call display_progress() rather than calling it for every
		 * integer value in[0 .. total).  In particular, the caller might not call
		 * display_progress() for the last value in the range.
		 *
		 * When "sparse" is set, stop_progress() will automatically force the done
		 * message to show 100%.
		 */);
	}
	public progress start_sparse_progress(Object title, Object total) {
		progress progress = new progress();
		return progress.start_progress_delay(title, total, 0, 1);
	}
	public progress start_delayed_sparse_progress(Object title, Object total) {
		progress progress = new progress();
		return progress.start_progress_delay(title, total, 2, 1);
	}
	public void finish_if_sparse() {
		if (ModernizedCProgram.progress && ModernizedCProgram.progress.getSparse() && ModernizedCProgram.progress.getLast_value() != ModernizedCProgram.progress.getTotal()) {
			ModernizedCProgram.progress.display_progress(ModernizedCProgram.progress.getTotal());
		} 
	}
	public void stop_progress() {
		p_progress.finish_if_sparse();
		p_progress.stop_progress_msg(ModernizedCProgram._("done"));
	}
	public void stop_progress_msg(Object msg) {
		progress progress = p_progress;
		if (!progress) {
			return /*Error: Unsupported expression*/;
		} 
		p_progress = ((Object)0);
		Object generatedLast_value = progress.getLast_value();
		throughput generatedThroughput = progress.getThroughput();
		Object generatedStart_ns = progress.getStart_ns();
		Object generatedCurr_total = tp.getCurr_total();
		strbuf generatedDisplay = tp.getDisplay();
		if (generatedLast_value != -1/* Force the last update */) {
			byte buf;
			throughput tp = generatedThroughput;
			if (tp) {
				uint64_t now_ns = progress.progress_getnanotime();
				int misecs;
				int rate;
				misecs = ((now_ns - generatedStart_ns) * 4398) >> 32;
				rate = generatedCurr_total / (misecs ? misecs : 1);
				generatedDisplay.throughput_string(generatedCurr_total, rate);
			} 
			ModernizedCProgram.progress_update = 1;
			ModernizedCProgram.buf = ModernizedCProgram.xstrfmt(", %s.\n", msg);
			progress.display(generatedLast_value, ModernizedCProgram.buf);
			ModernizedCProgram.free(ModernizedCProgram.buf);
		} 
		ModernizedCProgram.clear_progress_signal();
		strbuf generatedCounters_sb = progress.getCounters_sb();
		generatedCounters_sb.strbuf_release();
		if (generatedThroughput) {
			generatedDisplay.strbuf_release();
		} 
		ModernizedCProgram.free(generatedThroughput);
		ModernizedCProgram.free(progress);
	}
	public Object getTitle() {
		return title;
	}
	public void setTitle(Object newTitle) {
		title = newTitle;
	}
	public Object getLast_value() {
		return last_value;
	}
	public void setLast_value(Object newLast_value) {
		last_value = newLast_value;
	}
	public Object getTotal() {
		return total;
	}
	public void setTotal(Object newTotal) {
		total = newTotal;
	}
	public int getLast_percent() {
		return last_percent;
	}
	public void setLast_percent(int newLast_percent) {
		last_percent = newLast_percent;
	}
	public int getDelay() {
		return delay;
	}
	public void setDelay(int newDelay) {
		delay = newDelay;
	}
	public int getSparse() {
		return sparse;
	}
	public void setSparse(int newSparse) {
		sparse = newSparse;
	}
	public throughput getThroughput() {
		return throughput;
	}
	public void setThroughput(throughput newThroughput) {
		throughput = newThroughput;
	}
	public Object getStart_ns() {
		return start_ns;
	}
	public void setStart_ns(Object newStart_ns) {
		start_ns = newStart_ns;
	}
	public strbuf getCounters_sb() {
		return counters_sb;
	}
	public void setCounters_sb(strbuf newCounters_sb) {
		counters_sb = newCounters_sb;
	}
	public int getTitle_len() {
		return title_len;
	}
	public void setTitle_len(int newTitle_len) {
		title_len = newTitle_len;
	}
	public int getSplit() {
		return split;
	}
	public void setSplit(int newSplit) {
		split = newSplit;
	}
}
