package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * VIM - Vi IMproved	by Bram Moolenaar
 *
 * Do ":help uganda"  in Vim to read copying and usage conditions.
 * Do ":help credits" in Vim to see a list of people who contributed.
 * See README.txt for an overview of the Vim source code.
 */
/*
 *
 * (C) 2002,2005 by Marcin Dalecki <martin@dalecki.de>
 *
 * MARCIN DALECKI ASSUMES NO RESPONSIBILITY FOR THE USE OR INABILITY TO USE ANY
 * OF THIS SOFTWARE . THIS SOFTWARE IS PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, AND MARCIN DALECKI EXPRESSLY DISCLAIMS ALL IMPLIED WARRANTIES,
 * INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE.
 */
/*
 * EnhancedButton class structure.
 */
public class _XmEnhancedButtonClassPart {
	private Object stipple_bitmap;
	
	public _XmEnhancedButtonClassPart(Object stipple_bitmap) {
		setStipple_bitmap(stipple_bitmap);
	}
	public _XmEnhancedButtonClassPart() {
	}
	
	public Object getStipple_bitmap() {
		return stipple_bitmap;
	}
	public void setStipple_bitmap(Object newStipple_bitmap) {
		stipple_bitmap = newStipple_bitmap;
	}
}
