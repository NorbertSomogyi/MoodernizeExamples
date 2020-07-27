package application;

/**********************************************************************************************/
/* The MIT License                                                                            */
/*                                                                                            */
/* Copyright 2016-2017 Twitch Interactive, Inc. or its affiliates. All Rights Reserved.       */
/*                                                                                            */
/* Permission is hereby granted, free of charge, to any person obtaining a copy               */
/* of this software and associated documentation files (the "Software"), to deal              */
/* in the Software without restriction, including without limitation the rights               */
/* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell                  */
/* copies of the Software, and to permit persons to whom the Software is                      */
/* furnished to do so, subject to the following conditions:                                   */
/*                                                                                            */
/* The above copyright notice and this permission notice shall be included in                 */
/* all copies or substantial portions of the Software.                                        */
/*                                                                                            */
/* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR                 */
/* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,                   */
/* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE                */
/* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER                     */
/* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,              */
/* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN                  */
/* THE SOFTWARE.                                                                              */
/**********************************************************************************************/
public class _scc_t {
	private double timestamp;
	private int cc_aloc;
	private int cc_size;
	private Object cc_data;
	
	public _scc_t(double timestamp, int cc_aloc, int cc_size, Object cc_data) {
		setTimestamp(timestamp);
		setCc_aloc(cc_aloc);
		setCc_size(cc_size);
		setCc_data(cc_data);
	}
	public _scc_t() {
	}
	
	/**********************************************************************************************/
	/* The MIT License                                                                            */
	/*                                                                                            */
	/* Copyright 2016-2017 Twitch Interactive, Inc. or its affiliates. All Rights Reserved.       */
	/*                                                                                            */
	/* Permission is hereby granted, free of charge, to any person obtaining a copy               */
	/* of this software and associated documentation files (the "Software"), to deal              */
	/* in the Software without restriction, including without limitation the rights               */
	/* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell                  */
	/* copies of the Software, and to permit persons to whom the Software is                      */
	/* furnished to do so, subject to the following conditions:                                   */
	/*                                                                                            */
	/* The above copyright notice and this permission notice shall be included in                 */
	/* all copies or substantial portions of the Software.                                        */
	/*                                                                                            */
	/* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR                 */
	/* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,                   */
	/* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE                */
	/* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER                     */
	/* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,              */
	/* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN                  */
	/* THE SOFTWARE.                                                                              */
	/**********************************************************************************************/
	public _scc_t scc_relloc(int cc_count) {
		int generatedCc_aloc = this.getCc_aloc();
		if (0 == scc || generatedCc_aloc < cc_count) {
			scc = (scc_t)/*Error: Function owner not recognized*/realloc(scc, /*Error: Unsupported expression*/ + ((cc_count * 15 / 10) * /*Error: Unsupported expression*/));
			this.setCc_aloc(cc_count);
		} 
		// alloc 1.5 time what is asked for.
		return scc;
	}
	public _scc_t scc_new(int cc_count) {
		scc_t scc = 0.scc_relloc(cc_count);
		scc.setTimestamp(0.0);
		scc.setCc_size(0);
		return scc;
	}
	public _scc_t scc_free() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(scc);
		return ((Object)0);
	}
	// 00:00:25:16  9420 9440 aeae ae79 ef75 2068 6176 e520 79ef 75f2 20f2 ef62 eff4 e9e3 732c 2061 6e64 2049 94fe 9723 ea75 73f4 20f7 616e f420 f4ef 2062 e520 61f7 e573 ef6d e520 e96e 2073 7061 e3e5 ae80 942c 8080 8080 942f
	public Object scc_to_608(Object data) {
		size_t llen = new size_t();
		size_t size = 0;
		int v1 = 0;
		int v2 = 0;
		int hh = 0;
		int mm = 0;
		int ss = 0;
		int ff = 0;
		int cc_data = 0;
		if (0 == data) {
			return 0;
		} 
		if ((scc)) {
			(scc).setCc_size(0);
		} 
		// skip 'Scenarist_SCC V1.0' headerif (2 == /*Error: Function owner not recognized*/sscanf(data, "Scenarist_SCC V%1d.%1d", v1, v2)) {
			;
			if (1 != v1 || 0 != v2) {
				return 0;
			} 
		} 
		// Skip blank linesfor (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			llen = ModernizedCProgram.utf8_line_length(data);
			if (0 == llen || 0 != ModernizedCProgram.utf8_trimmed_length(data, llen)) {
				break;
			} 
			data += llen;
			size += llen;
		}
		int generatedCc_size = (scc).getCc_size();
		Object generatedCc_data = (scc).getCc_data();
		if (4 == /*Error: Function owner not recognized*/sscanf(data, "%2d:%2d:%2d%*1[:;]%2d", hh, mm, ss, ff)) {
			;
			llen = ModernizedCProgram.utf8_line_length(data);
			llen = ModernizedCProgram.utf8_trimmed_length(data, llen);
			int max_cc_count = 1 + ((int)llen / 5);
			(scc) = (scc).scc_relloc(max_cc_count * 15 / 10);
			(scc).setTimestamp(ModernizedCProgram.scc_time_to_timestamp(hh, mm, ss, ff));
			(scc).setCc_size(0);
			while (generatedCc_size < max_cc_count && 1 == /*Error: Function owner not recognized*/sscanf(data, "%04x", cc_data)) {
				generatedCc_data[generatedCc_size] = (uint16_t)cc_data;
				generatedCc_size += 1;
				;
			}
		} 
		return size;
	}
	public double getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(double newTimestamp) {
		timestamp = newTimestamp;
	}
	public int getCc_aloc() {
		return cc_aloc;
	}
	public void setCc_aloc(int newCc_aloc) {
		cc_aloc = newCc_aloc;
	}
	public int getCc_size() {
		return cc_size;
	}
	public void setCc_size(int newCc_size) {
		cc_size = newCc_size;
	}
	public Object getCc_data() {
		return cc_data;
	}
	public void setCc_data(Object newCc_data) {
		cc_data = newCc_data;
	}
}
