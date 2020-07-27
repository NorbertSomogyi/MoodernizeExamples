package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2018, Daniel Stenberg, <daniel@haxx.se>, et al.
 *
 * This software is licensed as described in the file COPYING, which
 * you should have received as part of this distribution. The terms
 * are also available at https://curl.haxx.se/docs/copyright.html.
 *
 * You may opt to use, copy, modify, merge, publish, distribute and/or sell
 * copies of the Software, and permit persons to whom the Software is
 * furnished to do so, under the terms of the COPYING file.
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
 * KIND, either express or implied.
 *
 ***************************************************************************/
/* default progress display */
public class ProgressData {
	private int calls;
	private Object prev;
	private timeval prevtime;
	private int width;
	private _iobuf out;
	private Object initial_size;
	private int tick;
	private int bar;
	private int barmove;
	
	public ProgressData(int calls, Object prev, timeval prevtime, int width, _iobuf out, Object initial_size, int tick, int bar, int barmove) {
		setCalls(calls);
		setPrev(prev);
		setPrevtime(prevtime);
		setWidth(width);
		setOut(out);
		setInitial_size(initial_size);
		setTick(tick);
		setBar(bar);
		setBarmove(barmove);
	}
	public ProgressData() {
	}
	
	public void fly( moved) {
		byte[] buf = new byte[256];
		int pos;
		int generatedWidth = this.getWidth();
		int check = generatedWidth - 2;
		ModernizedCProgram.curl_msnprintf(buf, /*Error: sizeof expression not supported yet*/, "%*s\r", generatedWidth - 1, " ");
		int generatedBar = this.getBar();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf[generatedBar], "-=O=-", 5);
		int generatedTick = this.getTick();
		pos = ModernizedCProgram.sinus[generatedTick % 200] / (10000 / check);
		buf[pos] = (byte)'#';
		pos = ModernizedCProgram.sinus[(generatedTick + 5) % 200] / (10000 / check);
		buf[pos] = (byte)'#';
		pos = ModernizedCProgram.sinus[(generatedTick + 10) % 200] / (10000 / check);
		buf[pos] = (byte)'#';
		pos = ModernizedCProgram.sinus[(generatedTick + 15) % 200] / (10000 / check);
		buf[pos] = (byte)'#';
		_iobuf generatedOut = this.getOut();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fputs(buf, generatedOut);
		generatedTick += 2;
		if (generatedTick >= 200) {
			generatedTick -= 200;
		} 
		int generatedBarmove = this.getBarmove();
		generatedBar += (moved ? generatedBarmove : 0);
		if (generatedBar >= (generatedWidth - 6)) {
			this.setBarmove(-1);
			this.setBar(generatedWidth - 6);
		}  else if (generatedBar < 0) {
			this.setBarmove(1);
			this.setBar(0/*
			** callback for CURLOPT_XFERINFOFUNCTION
			*/);
		} 
	}
	public int getCalls() {
		return calls;
	}
	public void setCalls(int newCalls) {
		calls = newCalls;
	}
	public Object getPrev() {
		return prev;
	}
	public void setPrev(Object newPrev) {
		prev = newPrev;
	}
	public timeval getPrevtime() {
		return prevtime;
	}
	public void setPrevtime(timeval newPrevtime) {
		prevtime = newPrevtime;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public _iobuf getOut() {
		return out;
	}
	public void setOut(_iobuf newOut) {
		out = newOut;
	}
	public Object getInitial_size() {
		return initial_size;
	}
	public void setInitial_size(Object newInitial_size) {
		initial_size = newInitial_size;
	}
	public int getTick() {
		return tick;
	}
	public void setTick(int newTick) {
		tick = newTick;
	}
	public int getBar() {
		return bar;
	}
	public void setBar(int newBar) {
		bar = newBar;
	}
	public int getBarmove() {
		return barmove;
	}
	public void setBarmove(int newBarmove) {
		barmove = newBarmove;
	}
}
