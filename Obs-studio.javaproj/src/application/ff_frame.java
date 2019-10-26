package application;

/*
 * Copyright (c) 2015 John R. Bradley <jrb@turrettech.com>
 *
 * Permission to use, copy, modify, and distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
public class ff_frame {
	private Object frame;
	private ff_clock clock;
	private double pts;
	private Object duration;
	
	public ff_frame(Object frame, ff_clock clock, double pts, Object duration) {
		setFrame(frame);
		setClock(clock);
		setPts(pts);
		setDuration(duration);
	}
	public ff_frame() {
	}
	
	public Object getFrame() {
		return frame;
	}
	public void setFrame(Object newFrame) {
		frame = newFrame;
	}
	public ff_clock getClock() {
		return clock;
	}
	public void setClock(ff_clock newClock) {
		clock = newClock;
	}
	public double getPts() {
		return pts;
	}
	public void setPts(double newPts) {
		pts = newPts;
	}
	public Object getDuration() {
		return duration;
	}
	public void setDuration(Object newDuration) {
		duration = newDuration;
	}
}
