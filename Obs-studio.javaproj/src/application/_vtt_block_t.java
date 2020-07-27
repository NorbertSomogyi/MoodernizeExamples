package application;

// CUE represents a block of caption text
public class _vtt_block_t {
	private _vtt_block_t next;
	private VTT_BLOCK_TYPE type;
	private double timestamp;
	private double duration;
	private Byte cue_settings;
	private byte[] cue_id;
	private Object text_size;
	private Byte block_text;
	
	public _vtt_block_t(_vtt_block_t next, VTT_BLOCK_TYPE type, double timestamp, double duration, Byte cue_settings, byte[] cue_id, Object text_size, Byte block_text) {
		setNext(next);
		setType(type);
		setTimestamp(timestamp);
		setDuration(duration);
		setCue_settings(cue_settings);
		setCue_id(cue_id);
		setText_size(text_size);
		setBlock_text(block_text);
	}
	public _vtt_block_t() {
	}
	
	public _vtt_block_t vtt_cue_next() {
		_vtt_block_t generatedNext = this.getNext();
		return generatedNext;
	}
	public Object vtt_block_data() {
		return (utf8_char_t)(block) + /*Error: Unsupported expression*//*! \brief
		    \param
		*/;
	}
	public _vtt_block_t srt_next() {
		_vtt_block_t generatedNext = this.getNext();
		return generatedNext;
	}
	public _vtt_block_t vtt_block_new(_vtt_t vtt, Object data, Object size, VTT_BLOCK_TYPE type) {
		vtt_block_t block = /*Error: Function owner not recognized*/malloc(/*Error: Unsupported expression*/ + size + 1);
		block.setNext(((Object)0));
		block.setType(VTT_BLOCK_TYPE.type);
		block.setTimestamp(0.0);
		block.setDuration(0.0);
		block.setCue_settings(((Object)0));
		block.setCue_id(((Object)0));
		block.setText_size(size);
		_vtt_block_t generatedRegion_head = vtt.getRegion_head();
		_vtt_block_t generatedRegion_tail = vtt.getRegion_tail();
		_vtt_block_t generatedStyle_head = vtt.getStyle_head();
		_vtt_block_t generatedStyle_tail = vtt.getStyle_tail();
		_vtt_block_t generatedCue_head = vtt.getCue_head();
		_vtt_block_t generatedCue_tail = vtt.getCue_tail();
		switch (VTT_BLOCK_TYPE.type) {
		case VTT_BLOCK_TYPE.VTT_CUE:
				if (generatedCue_head == ((Object)0)) {
					vtt.setCue_head(block);
				} else {
						generatedCue_tail.setNext(block);
				} 
				vtt.setCue_tail(block);
				break;
		case VTT_BLOCK_TYPE.VTT_NOTE:
				break;
		case VTT_BLOCK_TYPE.VTT_REGION:
				if (generatedRegion_head == ((Object)0)) {
					vtt.setRegion_head(block);
				} else {
						generatedRegion_tail.setNext(block);
				} 
				vtt.setRegion_tail(block);
				break;
		case VTT_BLOCK_TYPE.VTT_STYLE:
				if (generatedStyle_head == ((Object)0)) {
					vtt.setStyle_head(block);
				} else {
						generatedStyle_tail.setNext(block);
				} 
				vtt.setStyle_tail(block);
				break;
		}
		utf8_char_t dest = (utf8_char_t)block.vtt_block_data();
		if (data) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(dest, data, size);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(dest, 0, size);
		} 
		dest[size] = (byte)'\0';
		return block;
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
	public _vtt_block_t vtt_block_free_head() {
		_vtt_block_t generatedNext = this.getNext();
		vtt_block_t next = generatedNext;
		byte[] generatedCue_id = this.getCue_id();
		if (generatedCue_id != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedCue_id);
		} 
		Byte generatedCue_settings = this.getCue_settings();
		if (generatedCue_settings != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedCue_settings);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(head);
		return next;
	}
	public _vtt_block_t vtt_cue_from_caption_frame( frame, _vtt_t vtt) {
		_vtt_block_t generatedCue_tail = vtt.getCue_tail();
		double generatedDuration = generatedCue_tail.getDuration();
		Object generatedTimestamp = frame.getTimestamp();
		if (generatedCue_tail && 0 >= generatedDuration) {
			generatedCue_tail.setDuration(generatedTimestamp - generatedTimestamp);
		} 
		_vtt_block_t _vtt_block_t = new _vtt_block_t();
		// CRLF per row, plus an extra at the endvtt_block_t cue = _vtt_block_t.vtt_block_new(vtt, ((Object)0), 2 + (4 * ((32 + 2) * 15) + 1), VTT_BLOCK_TYPE.VTT_CUE);
		utf8_char_t data = cue.vtt_block_data();
		frame.caption_frame_to_text(data);
		cue.setTimestamp(generatedTimestamp)// vtt requires an extra new line;// vtt requires an extra new line
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat((byte)data, "\r\n");
		return cue;
	}
	public _vtt_block_t getNext() {
		return next;
	}
	public void setNext(_vtt_block_t newNext) {
		next = newNext;
	}
	public VTT_BLOCK_TYPE getType() {
		return type;
	}
	public void setType(VTT_BLOCK_TYPE newType) {
		type = newType;
	}
	public double getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(double newTimestamp) {
		timestamp = newTimestamp;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double newDuration) {
		duration = newDuration;
	}
	public Byte getCue_settings() {
		return cue_settings;
	}
	public void setCue_settings(Byte newCue_settings) {
		cue_settings = newCue_settings;
	}
	public byte[] getCue_id() {
		return cue_id;
	}
	public void setCue_id(byte[] newCue_id) {
		cue_id = newCue_id;
	}
	public Object getText_size() {
		return text_size;
	}
	public void setText_size(Object newText_size) {
		text_size = newText_size;
	}
	public Byte getBlock_text() {
		return block_text;
	}
	public void setBlock_text(Byte newBlock_text) {
		block_text = newBlock_text;
	}
}
