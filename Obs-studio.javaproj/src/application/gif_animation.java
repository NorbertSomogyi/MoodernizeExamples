package application;

/*    The GIF animation data
*/
public class gif_animation {
	private gif_bitmap_callback_vt bitmap_callbacks;
	private Byte gif_data;
	private int width;
	private int height;
	private int frame_count;
	private int frame_count_partial;
	private gif_frame frames;
	private int decoded_frame;
	private Object frame_image;
	private int loop_count;
	private  current_error;
	private int buffer_position;
	private int buffer_size;
	private int frame_holders;
	private int background_index;
	private int aspect_ratio;
	private int colour_table_size;
	private boolean global_colours;
	private Integer global_colour_table;
	private Integer local_colour_table;
	private Object buf;
	private Byte direct;
	private Object table;
	private Object stack;
	private byte stack_pointer;
	private int code_size;
	private int set_code_size;
	private int max_code;
	private int max_code_size;
	private int clear_code;
	private int end_code;
	private int curbit;
	private int lastbit;
	private int last_byte;
	private int firstcode;
	private int oldcode;
	private boolean zero_data_block;
	private boolean get_done;
	private boolean clear_image;
	
	public gif_animation(gif_bitmap_callback_vt bitmap_callbacks, Byte gif_data, int width, int height, int frame_count, int frame_count_partial, gif_frame frames, int decoded_frame, Object frame_image, int loop_count,  current_error, int buffer_position, int buffer_size, int frame_holders, int background_index, int aspect_ratio, int colour_table_size, boolean global_colours, Integer global_colour_table, Integer local_colour_table, Object buf, Byte direct, Object table, Object stack, byte stack_pointer, int code_size, int set_code_size, int max_code, int max_code_size, int clear_code, int end_code, int curbit, int lastbit, int last_byte, int firstcode, int oldcode, boolean zero_data_block, boolean get_done, boolean clear_image) {
		setBitmap_callbacks(bitmap_callbacks);
		setGif_data(gif_data);
		setWidth(width);
		setHeight(height);
		setFrame_count(frame_count);
		setFrame_count_partial(frame_count_partial);
		setFrames(frames);
		setDecoded_frame(decoded_frame);
		setFrame_image(frame_image);
		setLoop_count(loop_count);
		setCurrent_error(current_error);
		setBuffer_position(buffer_position);
		setBuffer_size(buffer_size);
		setFrame_holders(frame_holders);
		setBackground_index(background_index);
		setAspect_ratio(aspect_ratio);
		setColour_table_size(colour_table_size);
		setGlobal_colours(global_colours);
		setGlobal_colour_table(global_colour_table);
		setLocal_colour_table(local_colour_table);
		setBuf(buf);
		setDirect(direct);
		setTable(table);
		setStack(stack);
		setStack_pointer(stack_pointer);
		setCode_size(code_size);
		setSet_code_size(set_code_size);
		setMax_code(max_code);
		setMax_code_size(max_code_size);
		setClear_code(clear_code);
		setEnd_code(end_code);
		setCurbit(curbit);
		setLastbit(lastbit);
		setLast_byte(last_byte);
		setFirstcode(firstcode);
		setOldcode(oldcode);
		setZero_data_block(zero_data_block);
		setGet_done(get_done);
		setClear_image(clear_image);
	}
	public gif_animation() {
	}
	
	public  gif_initialise(Object size, Byte data) {
		byte gif_data;
		int index;
		gif_result return_value = new gif_result();
		/*     The GIF format is thoroughly documented; a full description
		     *    can be found at http://www.w3.org/Graphics/GIF/spec-gif89a.txt
		    */
		this.setBuffer_size((int)/*    Initialize values
		    */size);
		this.setGif_data(data);
		int generatedBuffer_size = this.getBuffer_size();
		if (generatedBuffer_size < 13) {
			return /*    Check for sufficient data to be a GIF (6-byte header + 7-byte logical screen descriptor)
			    */.GIF_INSUFFICIENT_DATA;
		} 
		Byte generatedGif_data = this.getGif_data();
		int generatedBuffer_position = this.getBuffer_position();
		gif_data = generatedGif_data + generatedBuffer_position;
		int generatedWidth = this.getWidth();
		int generatedHeight = this.getHeight();
		Integer generatedGlobal_colour_table = this.getGlobal_colour_table();
		Integer generatedLocal_colour_table = this.getLocal_colour_table();
		gif_bitmap_callback_vt generatedBitmap_callbacks = this.getBitmap_callbacks();
		Object generatedBitmap_create = generatedBitmap_callbacks.getBitmap_create();
		if (generatedBuffer_position == /*    See if we should initialise the GIF
		    */0/*    We want everything to be NULL before we start so we've no chance
		            of freeing bad pointers (paranoia)
		        */) {
			this.setFrame_image(((Object)0));
			this.setFrames(((Object)0));
			this.setLocal_colour_table(((Object)0));
			this.setGlobal_colour_table(((Object)0));
			this.setFrame_count(/*    The caller may have been lazy and not reset any values
			        */0);
			this.setFrame_count_partial(0);
			this.setDecoded_frame(-1/* 6-byte GIF file header is:
			         *
			         *    +0    3CHARS    Signature ('GIF')
			         *    +3    3CHARS    Version ('87a' or '89a')
			         */);
			if (.strncmp((byte)gif_data, "GIF", 3) != 0) {
				return .GIF_DATA_ERROR;
			} 
			gif_data += 3/*    Ensure GIF reports version 87a or 89a
			        */;
			gif_data += /*        if ((strncmp(gif_data, "87a", 3) != 0) &&
			                (strncmp(gif_data, "89a", 3) != 0))
			            LOG(("Unknown GIF format - proceeding anyway"));
			*/3/* 7-byte Logical Screen Descriptor is:
			         *
			         *    +0    SHORT    Logical Screen Width
			         *    +2    SHORT    Logical Screen Height
			         *    +4    CHAR    __Packed Fields__
			         *             1BIT    Global Colour Table Flag
			         *             3BITS    Colour Resolution
			         *             1BIT    Sort Flag
			         *             3BITS    Size of Global Colour Table
			         *    +5    CHAR    Background Colour Index
			         *    +6    CHAR    Pixel Aspect Ratio
			         */;
			this.setWidth(gif_data[0] | (gif_data[1] << 8));
			this.setHeight(gif_data[2] | (gif_data[3] << 8));
			this.setGlobal_colours((gif_data[4] & -1024));
			this.setColour_table_size((2 << (gif_data[4] & -1024)));
			this.setBackground_index(gif_data[5]);
			this.setAspect_ratio(gif_data[6]);
			this.setLoop_count(1);
			gif_data += 7/*    Some broken GIFs report the size as the screen size they were created in. As
			            such, we detect for the common cases and set the sizes as 0 if they are found
			            which results in the GIF being the maximum size of the frames.
			        */;
			if (((generatedWidth == 640) && (generatedHeight == 480)) || ((generatedWidth == 640) && (generatedHeight == 512)) || ((generatedWidth == 800) && (generatedHeight == 600)) || ((generatedWidth == 1024) && (generatedHeight == 768)) || ((generatedWidth == 1280) && (generatedHeight == 1024)) || ((generatedWidth == 1600) && (generatedHeight == 1200)) || ((generatedWidth == 0) || (generatedHeight == 0)) || ((generatedWidth > 2048) || (generatedHeight > 2048))) {
				this.setWidth(1);
				this.setHeight(1/*    Allocate some data irrespective of whether we've got any colour tables. We
				            always get the maximum size in case a GIF is lying to us. It's far better
				            to give the wrong colours than to trample over some memory somewhere.
				        */);
			} 
			this.setGlobal_colour_table((int).calloc(256, ));
			this.setLocal_colour_table((int).calloc(256, ));
			if ((generatedGlobal_colour_table == ((Object)0)) || (generatedLocal_colour_table == ((Object)0))) {
				gif.gif_finalise();
				return .GIF_INSUFFICIENT_MEMORY;
			} 
			generatedGlobal_colour_table[0] = /*    Set the first colour to a value that will never occur in reality so we
			            know if we've processed it
			        */-1024/*    Check if the GIF has no frame data (13-byte header + 1-byte termination block)
			         *    Although generally useless, the GIF specification does not expressly prohibit this
			         */;
			if (generatedBuffer_size == 14) {
				if (gif_data[0] == -1024) {
					return .GIF_OK;
				} else {
						return .GIF_INSUFFICIENT_DATA;
				} 
			} 
			if ((this.setFrames((gif_frame).malloc())) == ((Object)/*    Initialise enough workspace for 4 frames initially
			        */0)) {
				gif.gif_finalise();
				return .GIF_INSUFFICIENT_MEMORY;
			} 
			this.setFrame_holders(1);
			((generatedBitmap_create) ? (Object)0 : ._assert("gif->bitmap_callbacks.bitmap_create", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\libnsgif.c", /*    Initialise the sprite header
			        */285));
			if ((this.setFrame_image(.UNRECOGNIZEDFUNCTIONNAME(generatedWidth, generatedHeight))) == ((Object)0)) {
				gif.gif_finalise();
				return .GIF_INSUFFICIENT_MEMORY;
			} 
			this.setBuffer_position((int)(gif_data - generatedGif_data));
		} 
		boolean generatedGlobal_colours = this.getGlobal_colours();
		int generatedColour_table_size = this.getColour_table_size();
		if (generatedGlobal_colour_table[0] == /*    Do the colour map if we haven't already. As the top byte is always 0xff or 0x00
		        depending on the transparency we know if it's been filled in.
		    */-1024/*    Check for a global colour map signified by bit 7
		        */) {
			if (generatedGlobal_colours) {
				if (generatedBuffer_size < (generatedColour_table_size * 3 + 12)) {
					return .GIF_INSUFFICIENT_DATA;
				} 
				for (index = 0; index < generatedColour_table_size; index/* Gif colour map contents are r,g,b.
				                 *
				                 * We want to pack them bytewise into the 
				                 * colour table, such that the red component
				                 * is in byte 0 and the alpha component is in
				                 * byte 3.
				                 */++) {
					byte entry = (byte)generatedGlobal_colour_table[index];
					entry[0] = gif_data[/* r */0];
					entry[1] = gif_data[/* g */1];
					entry[2] = gif_data[/* b */2];
					entry[3] = /* a */-1024;
					gif_data += 3;
				}
				this.setBuffer_position((int)(gif_data - generatedGif_data));
			} else {
					int entry = generatedGlobal_colour_table;
					entry[0] = -1024;
					((byte)entry)[3] = /* Force Alpha channel to opaque */-1024;
					entry[1] = -1024;
			} 
		} 
		while ((return_value = gif.gif_initialise_frame()) == /*    Repeatedly try to initialise frames
		    */.GIF_WORKING) {
			;
		}
		if ((return_value == /*    If there was a memory error tell the caller
		    */.GIF_INSUFFICIENT_MEMORY) || (return_value == .GIF_DATA_ERROR)) {
			return return_value/*    If we didn't have some frames then a GIF_INSUFFICIENT_DATA becomes a
			        GIF_INSUFFICIENT_FRAME_DATA
			    */;
		} 
		int generatedFrame_count_partial = this.getFrame_count_partial();
		if ((return_value == .GIF_INSUFFICIENT_DATA) && (generatedFrame_count_partial > 0)) {
			return .GIF_INSUFFICIENT_FRAME_DATA;
		} 
		return /*    Return how many we got
		    */return_value/**    Updates the sprite memory size
		
		    @return GIF_INSUFFICIENT_MEMORY for a memory error
		        GIF_OK for success
		*/;
	}
	/*
	 * Copyright 2003 James Bursa <bursa@users.sourceforge.net>
	 * Copyright 2004 John Tytgat <John.Tytgat@aaug.net>
	 * Copyright 2004 Richard Wilson <richard.wilson@netsurf-browser.org>
	 * Copyright 2008 Sean Fox <dyntryx@gmail.com>
	 *
	 * This file is part of NetSurf's libnsgif, http://www.netsurf-browser.org/
	 * Licenced under the MIT License,
	 *                http://www.opensource.org/licenses/mit-license.php
	 */
	//#include <stdbool.h>
	/* NDEBUG */
	/*    READING GIF FILES
	    =================
	
	    The functions provided by this file allow for efficient progressive GIF
	    decoding. Whilst the initialisation does not ensure that there is
	    sufficient image data to complete the entire frame, it does ensure that
	    the information provided is valid. Any subsequent attempts to decode an
	    initialised GIF are guaranteed to succeed, and any bytes of the image
	    not present are assumed to be totally transparent.
	
	    To begin decoding a GIF, the 'gif' structure must be initialised with
	    the 'gif_data' and 'buffer_size' set to their initial values. The
	    'buffer_position' should initially be 0, and will be internally updated
	    as the decoding commences. The caller should then repeatedly call
	    gif_initialise() with the structure until the function returns 1, or
	    no more data is available.
	
	    Once the initialisation has begun, the decoder completes the variables
	    'frame_count' and 'frame_count_partial'. The former being the total
	    number of frames that have been successfully initialised, and the
	    latter being the number of frames that a partial amount of data is
	    available for. This assists the caller in managing the animation whilst
	    decoding is continuing.
	
	    To decode a frame, the caller must use gif_decode_frame() which updates
	    the current 'frame_image' to reflect the desired frame. The required
	    'disposal_method' is also updated to reflect how the frame should be
	    plotted. The caller must not assume that the current 'frame_image' will
	    be valid between calls if initialisation is still occurring, and should
	    either always request that the frame is decoded (no processing will
	    occur if the 'decoded_frame' has not been invalidated by initialisation)
	    or perform the check itself.
	
	    It should be noted that gif_finalise() should always be called, even if
	    no frames were initialised.  Additionally, it is the responsibility of
	    the caller to free 'gif_data'.
	
	    [rjw] - Fri 2nd April 2004
	*/
	/*    TO-DO LIST
	    =================
	
	    + Plain text and comment extensions could be implemented if there is any
	    interest in doing so.
	*/
	/*    Maximum colour table size
	*/
	/*    Internal flag that the colour table needs to be processed
	*/
	/*    Internal flag that a frame is invalid/unprocessed
	*/
	/* Transparent colour
	*/
	/*    GIF Flags
	*/
	/*    Internal GIF routines
	*/
	public  gif_initialise_sprite(int width, int height) {
		int max_width;
		int max_height;
		bitmap buffer = new bitmap();
		int generatedWidth = this.getWidth();
		int generatedHeight = this.getHeight();
		if ((width <= generatedWidth) && (height <= generatedHeight)) {
			return .GIF_OK;
		} 
		max_width = (width > generatedWidth) ? width : generatedWidth;
		max_height = (height > generatedHeight) ? height : generatedHeight;
		gif_bitmap_callback_vt generatedBitmap_callbacks = this.getBitmap_callbacks();
		Object generatedBitmap_create = generatedBitmap_callbacks.getBitmap_create();
		((generatedBitmap_create) ? (Object)0 : ._assert("gif->bitmap_callbacks.bitmap_create", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\libnsgif.c", /*    Allocate some more memory
		    */382));
		if ((buffer = .UNRECOGNIZEDFUNCTIONNAME(max_width, max_height)) == ((Object)0)) {
			return .GIF_INSUFFICIENT_MEMORY;
		} 
		Object generatedBitmap_destroy = generatedBitmap_callbacks.getBitmap_destroy();
		((generatedBitmap_destroy) ? (Object)0 : ._assert("gif->bitmap_callbacks.bitmap_destroy", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\libnsgif.c", 385));
		Object generatedFrame_image = this.getFrame_image();
		.UNRECOGNIZEDFUNCTIONNAME(generatedFrame_image);
		this.setFrame_image(buffer);
		this.setWidth(max_width);
		this.setHeight(max_height);
		this.setDecoded_frame(-/*    Invalidate our currently decoded image
		    */1);
		return .GIF_OK/**    Attempts to initialise the next frame
		
		    @return GIF_INSUFFICIENT_DATA for insufficient data to do anything
		        GIF_FRAME_DATA_ERROR for GIF frame data error
		        GIF_INSUFFICIENT_MEMORY for insufficient memory to process
		        GIF_INSUFFICIENT_FRAME_DATA for insufficient data to complete the frame
		        GIF_DATA_ERROR for GIF error (invalid frame header)
		        GIF_OK for successful decoding
		        GIF_WORKING for successful decoding if more frames are expected
		*/;
	}
	public  gif_initialise_frame() {
		int frame;
		gif_frame temp_buf = new gif_frame();
		byte gif_data;
		byte gif_end;
		int gif_bytes;
		int flags = 0;
		int width;
		int height;
		int offset_x;
		int offset_y;
		int block_size;
		int colour_table_size;
		boolean first_image = true;
		gif_result return_value = new gif_result();
		int generatedFrame_count = this.getFrame_count();
		frame = generatedFrame_count;
		Byte generatedGif_data = this.getGif_data();
		int generatedBuffer_position = this.getBuffer_position();
		gif_data = (byte)(generatedGif_data + generatedBuffer_position);
		int generatedBuffer_size = this.getBuffer_size();
		gif_end = (byte)(generatedGif_data + generatedBuffer_size);
		gif_bytes = (int)(gif_end - gif_data);
		if ((gif_bytes > 0) && (gif_data[0] == -1024)) {
			return /*    Check if we've finished
			    */.GIF_OK/*    Check if we have enough data
			     *    The shortest block of data is a 4-byte comment extension + 1-byte block terminator + 1-byte gif trailer
			    */;
		} 
		if (gif_bytes < 6) {
			return .GIF_INSUFFICIENT_DATA/*    We could theoretically get some junk data that gives us millions of frames, so
			        we ensure that we don't have a silly number
			    */;
		} 
		if (frame > 4096) {
			return .GIF_FRAME_DATA_ERROR;
		} 
		int generatedFrame_holders = this.getFrame_holders();
		gif_frame generatedFrames = this.getFrames();
		if ((int)generatedFrame_holders <= /*    Get some memory to store our pointers in etc.
		    */frame/*    Allocate more memory
		        */) {
			if ((temp_buf = (gif_frame).realloc(generatedFrames, (frame + 1) * )) == ((Object)0)) {
				return .GIF_INSUFFICIENT_MEMORY;
			} 
			this.setFrames(temp_buf);
			this.setFrame_holders(frame + 1);
		} 
		generatedFrames[frame].setFrame_pointer(generatedBuffer_position);
		generatedFrames[frame].setDisplay(0);
		generatedFrames[frame].setVirgin(1);
		generatedFrames[frame].setDisposal_method(0);
		generatedFrames[frame].setTransparency(0);
		generatedFrames[frame].setFrame_delay(100);
		generatedFrames[frame].setRedraw_required(0);
		int generatedDecoded_frame = this.getDecoded_frame();
		if (generatedDecoded_frame == /*    Invalidate any previous decoding we have of this frame
		    */frame) {
			this.setDecoded_frame(-1/*    We pretend to initialise the frames, but really we just skip over all
			        the data contained within. This is all basically a cut down version of
			        gif_decode_frame that doesn't have any of the LZW bits in it.
			    */);
		} 
		this.setBuffer_position((int)(gif_data - generatedGif_data));
		if ((return_value = gif.gif_initialise_frame_extensions(frame)) != .GIF_OK) {
			return return_value;
		} 
		gif_data = (generatedGif_data + generatedBuffer_position);
		gif_bytes = (int)(gif_end - gif_data);
		if ((gif_bytes = (int)(gif_end - gif_data)) < /*    Check if we've finished
		    */1) {
			return .GIF_INSUFFICIENT_FRAME_DATA;
		}  else if (gif_data[0] == -1024) {
			this.setBuffer_position((int)(gif_data - generatedGif_data));
			this.setFrame_count(frame + 1);
			return .GIF_OK;
		} 
		if (gif_data[0] != -1024) {
			return /*    If we're not done, there should be an image descriptor
			    */.GIF_FRAME_DATA_ERROR;
		} 
		offset_x = gif_data[1] | (gif_data[2] << /*    Do some simple boundary checking
		    */8);
		offset_y = gif_data[3] | (gif_data[4] << 8);
		width = gif_data[5] | (gif_data[6] << 8);
		height = gif_data[7] | (gif_data[8] << 8/*    Set up the redraw characteristics. We have to check for extending the area
		        due to multi-image frames.
		    */);
		if (!first_image) {
			if (generatedFrames[frame].getRedraw_x() > offset_x) {
				generatedFrames[frame].getRedraw_width() += (generatedFrames[frame].getRedraw_x() - offset_x);
				generatedFrames[frame].setRedraw_x(offset_x);
			} 
			if (generatedFrames[frame].getRedraw_y() > offset_y) {
				generatedFrames[frame].getRedraw_height() += (generatedFrames[frame].getRedraw_y() - offset_y);
				generatedFrames[frame].setRedraw_y(offset_y);
			} 
			if ((offset_x + width) > (generatedFrames[frame].getRedraw_x() + generatedFrames[frame].getRedraw_width())) {
				generatedFrames[frame].setRedraw_width((offset_x + width) - generatedFrames[frame].getRedraw_x());
			} 
			if ((offset_y + height) > (generatedFrames[frame].getRedraw_y() + generatedFrames[frame].getRedraw_height())) {
				generatedFrames[frame].setRedraw_height((offset_y + height) - generatedFrames[frame].getRedraw_y());
			} 
		} else {
				first_image = false;
				generatedFrames[frame].setRedraw_x(offset_x);
				generatedFrames[frame].setRedraw_y(offset_y);
				generatedFrames[frame].setRedraw_width(width);
				generatedFrames[frame].setRedraw_height(height);
		} 
		generatedFrames[frame].setRedraw_required(((generatedFrames[frame].getDisposal_method() == /*    if we are clearing the background then we need to redraw enough to cover the previous
		        frame too
		    */2) || (generatedFrames[frame].getDisposal_method() == 3)));
		if (gif.gif_initialise_sprite((offset_x + width), (offset_y + /*    Boundary checking - shouldn't ever happen except with junk data
		    */height))) {
			return .GIF_INSUFFICIENT_MEMORY;
		} 
		flags = gif_data[/*    Decode the flags
		    */9];
		colour_table_size = 2 << (flags & -1024);
		gif_data += /*    Move our data onwards and remember we've got a bit of this frame
		    */10;
		gif_bytes = (int)(gif_end - gif_data);
		this.setFrame_count_partial(frame + 1);
		if (flags & /*    Skip the local colour table
		    */-1024) {
			gif_data += 3 * colour_table_size;
			if ((gif_bytes = (int)(gif_end - gif_data)) < 0) {
				return .GIF_INSUFFICIENT_FRAME_DATA;
			} 
		} 
		if (gif_data[0] > /*    Ensure we have a correct code size
		    */12) {
			return .GIF_DATA_ERROR;
		} 
		/*    Move our pointer to the actual image data
		    */gif_data++;
		if (--gif_bytes < 0) {
			return .GIF_INSUFFICIENT_FRAME_DATA/*    Repeatedly skip blocks until we get a zero block or run out of data
			     *    These blocks of image data are processed later by gif_decode_frame()
			    */;
		} 
		block_size = 0;
		while (block_size != 1) {
			block_size = gif_data[0] + 1/*    Check if the frame data runs off the end of the file
			        */;
			if ((int)(gif_bytes - block_size) < 0/*    Try to recover by signaling the end of the gif.
			             *    Once we get garbage data, there is no logical
			             *    way to determine where the next frame is.
			             *    It's probably better to partially load the gif
			             *    than not at all.
			            */) {
				if (gif_bytes >= 2) {
					gif_data[0] = 0;
					gif_data[1] = -1024;
					gif_bytes = 1;
					++gif_data;
					break;
				} else {
						return .GIF_INSUFFICIENT_FRAME_DATA;
				} 
			} else {
					gif_bytes -= block_size;
					gif_data += block_size;
			} 
		}
		this.setBuffer_position((int)(gif_data - generatedGif_data));
		this.setFrame_count(frame + 1);
		generatedFrames[frame].setDisplay(1);
		if (gif_bytes < /*    Check if we've finished
		    */1) {
			return .GIF_INSUFFICIENT_FRAME_DATA;
		}  else if (gif_data[0] == -1024) {
			return .GIF_OK;
		} 
		return .GIF_WORKING/**    Attempts to initialise the frame's extensions
		
		    @return GIF_INSUFFICIENT_FRAME_DATA for insufficient data to complete the frame
		        GIF_OK for successful initialisation
		*/;
	}
	public  gif_initialise_frame_extensions(Object frame) {
		byte gif_data;
		byte gif_end;
		int gif_bytes;
		int block_size;
		Byte generatedGif_data = this.getGif_data();
		int generatedBuffer_position = this.getBuffer_position();
		gif_data = (byte)(generatedGif_data + generatedBuffer_position);
		int generatedBuffer_size = this.getBuffer_size();
		gif_end = (byte)(generatedGif_data + generatedBuffer_size);
		gif_frame generatedFrames = this.getFrames();
		while (gif_data[0] == /*    Initialise the extensions
		    */-1024) {
			++gif_data;
			gif_bytes = (int)(gif_end - gif_data);
			switch (gif_data[/*    Switch on extension label
			        */0/* 6-byte Graphic Control Extension is:
			             *
			             *    +0    CHAR    Graphic Control Label
			             *    +1    CHAR    Block Size
			             *    +2    CHAR    __Packed Fields__
			             *            3BITS    Reserved
			             *            3BITS    Disposal Method
			             *            1BIT    User Input Flag
			             *            1BIT    Transparent Color Flag
			             *    +3    SHORT    Delay Time
			             *    +5    CHAR    Transparent Color Index
			            */]) {
			case -1024:
					if (gif_bytes < 6) {
						return .GIF_INSUFFICIENT_FRAME_DATA;
					} 
					generatedFrames[frame].setFrame_delay(gif_data[3] | (gif_data[4] << 8));
					if (gif_data[2] & -1024) {
						generatedFrames[frame].setTransparency(1);
						generatedFrames[frame].setTransparency_index(gif_data[5]);
					} 
					generatedFrames[frame].setDisposal_method(((gif_data[2] & -1024) >> 2/*    I have encountered documentation and GIFs in the wild that use
					                 *    0x04 to restore the previous frame, rather than the officially
					                 *    documented 0x03.  I believe some (older?) software may even actually
					                 *    export this way.  We handle this as a type of "quirks" mode.
					                */));
					if (generatedFrames[frame].getDisposal_method() == 4) {
						generatedFrames[frame].setDisposal_method(3);
					} 
					gif_data += (2 + gif_data[1]);
					break;
			case -1024:
					if (gif_bytes < 17) {
						return .GIF_INSUFFICIENT_FRAME_DATA;
					} 
					if ((gif_data[1] == -1024) && (.strncmp((byte)gif_data + 2, "NETSCAPE2.0", 11) == 0) && (gif_data[13] == -1024) && (gif_data[14] == -1024)) {
						this.setLoop_count(gif_data[15] | (gif_data[16] << 8));
					} 
					gif_data += (2 + gif_data[1]);
					break;
			case -1024:
					++gif_data;
					break;
			default:
					gif_data += (2 + gif_data[1]);
			}
			gif_bytes = (int)(gif_end - /*    Repeatedly skip blocks until we get a zero block or run out of data
			         *    This data is ignored by this gif decoder
			        */gif_data);
			block_size = 0;
			while (gif_data[0] != -1024) {
				block_size = gif_data[0] + 1;
				if ((gif_bytes -= block_size) < 0) {
					return .GIF_INSUFFICIENT_FRAME_DATA;
				} 
				gif_data += block_size;
			}
			++gif_data;
		}
		this.setBuffer_position((int)(gif_data - generatedGif_data));
		return .GIF_OK/**    Decodes a GIF frame.
		
		    @return GIF_FRAME_DATA_ERROR for GIF frame data error
		        GIF_INSUFFICIENT_FRAME_DATA for insufficient data to complete the frame
		        GIF_DATA_ERROR for GIF error (invalid frame header)
		        GIF_INSUFFICIENT_DATA for insufficient data to do anything
		        GIF_INSUFFICIENT_MEMORY for insufficient memory to process
		        GIF_OK for successful decoding
		        If a frame does not contain any image data, GIF_OK is returned and
		            gif->current_error is set to GIF_FRAME_NO_DISPLAY
		*/;
	}
	public  gif_decode_frame(int frame) {
		int index = 0;
		byte gif_data;
		byte gif_end;
		int gif_bytes;
		int width;
		int height;
		int offset_x;
		int offset_y;
		int flags;
		int colour_table_size;
		int interlace;
		int colour_table;
		// Set to 0 for no warningsint frame_data = 0;
		int frame_scanline;
		int save_buffer_position;
		gif_result return_value = .GIF_OK;
		int x;
		int y;
		int decode_y;
		int burst_bytes;
		int last_undisposed_frame = (frame - 1);
		byte colour;
		int generatedFrame_count_partial = this.getFrame_count_partial();
		if (frame >= generatedFrame_count_partial) {
			return .GIF_INSUFFICIENT_DATA;
		} 
		gif_frame generatedFrames = this.getFrames();
		if (generatedFrames[frame].getDisplay() == /*    Ensure this frame is supposed to be decoded
		    */0) {
			this.setCurrent_error(.GIF_FRAME_NO_DISPLAY);
			return .GIF_OK;
		} 
		boolean generatedClear_image = this.getClear_image();
		int generatedDecoded_frame = this.getDecoded_frame();
		if ((!generatedClear_image) && ((int)frame == generatedDecoded_frame)) {
			return .GIF_OK;
		} 
		Byte generatedGif_data = this.getGif_data();
		gif_data = generatedGif_data + generatedFrames[frame].getFrame_pointer();
		int generatedBuffer_size = this.getBuffer_size();
		gif_end = generatedGif_data + generatedBuffer_size;
		gif_bytes = (int)(gif_end - gif_data/*    Check if we have enough data
		     *    The shortest block of data is a 10-byte image descriptor + 1-byte gif trailer
		    */);
		if (gif_bytes < 12) {
			return .GIF_INSUFFICIENT_FRAME_DATA;
		} 
		int generatedBuffer_position = this.getBuffer_position();
		save_buffer_position = generatedBuffer_position;
		this.setBuffer_position((int)(gif_data - generatedGif_data));
		if ((return_value = gif.gif_skip_frame_extensions()) != /*    Skip any extensions because we all ready processed them
		    */.GIF_OK) {
			;
		} 
		gif_data = (generatedGif_data + generatedBuffer_position);
		gif_bytes = (int)(gif_end - gif_data);
		if (gif_bytes < /*    Ensure we have enough data for the 10-byte image descriptor + 1-byte gif trailer
		    */12) {
			return_value = .GIF_INSUFFICIENT_FRAME_DATA;
			;
		} 
		if (gif_data[0] != -1024) {
			return_value = .GIF_DATA_ERROR;
			;
		} 
		offset_x = gif_data[1] | (gif_data[2] << 8);
		offset_y = gif_data[3] | (gif_data[4] << 8);
		width = gif_data[5] | (gif_data[6] << 8);
		height = gif_data[7] | (gif_data[8] << 8/*    Boundary checking - shouldn't ever happen except unless the data has been
		        modified since initialisation.
		    */);
		int generatedWidth = this.getWidth();
		int generatedHeight = this.getHeight();
		if ((offset_x + width > generatedWidth) || (offset_y + height > generatedHeight)) {
			return_value = .GIF_DATA_ERROR;
			;
		} 
		flags = gif_data[/*    Decode the flags
		    */9];
		colour_table_size = 2 << (flags & -1024);
		interlace = flags & -1024;
		gif_data += /*    Move our pointer to the colour table or image data (if no colour table is given)
		    */10;
		gif_bytes = (int)(gif_end - gif_data);
		Integer generatedLocal_colour_table = this.getLocal_colour_table();
		Integer generatedGlobal_colour_table = this.getGlobal_colour_table();
		if (flags & /*    Set up the colour table
		    */-1024) {
			if (gif_bytes < (int)(3 * colour_table_size)) {
				return_value = .GIF_INSUFFICIENT_FRAME_DATA;
				;
			} 
			colour_table = generatedLocal_colour_table;
			if (!generatedClear_image) {
				for (index = 0; index < colour_table_size; index/* Gif colour map contents are r,g,b.
				                 *
				                 * We want to pack them bytewise into the 
				                 * colour table, such that the red component
				                 * is in byte 0 and the alpha component is in
				                 * byte 3.
				                 */++) {
					byte entry = (byte)colour_table[index];
					entry[0] = gif_data[/* r */0];
					entry[1] = gif_data[/* g */1];
					entry[2] = gif_data[/* b */2];
					entry[3] = /* a */-1024;
					gif_data += 3;
				}
			} else {
					gif_data += 3 * colour_table_size;
			} 
			gif_bytes = (int)(gif_end - gif_data);
		} else {
				colour_table = generatedGlobal_colour_table;
		} 
		if (gif_bytes < /*    Check if we've finished
		    */1) {
			return_value = .GIF_INSUFFICIENT_FRAME_DATA;
			;
		}  else if (gif_data[0] == -1024) {
			return_value = .GIF_OK;
			;
		} 
		gif_bitmap_callback_vt generatedBitmap_callbacks = this.getBitmap_callbacks();
		Object generatedBitmap_get_buffer = generatedBitmap_callbacks.getBitmap_get_buffer();
		((generatedBitmap_get_buffer) ? (Object)0 : ._assert("gif->bitmap_callbacks.bitmap_get_buffer", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\libnsgif.c", /*    Get the frame data
		    */885));
		Object generatedFrame_image = this.getFrame_image();
		frame_data = (Object).UNRECOGNIZEDFUNCTIONNAME(generatedFrame_image);
		if (!frame_data) {
			return .GIF_INSUFFICIENT_MEMORY;
		} 
		int generatedSet_code_size = this.getSet_code_size();
		int generatedClear_code = this.getClear_code();
		Object generatedBuf = this.getBuf();
		byte generatedStack_pointer = this.getStack_pointer();
		Object generatedStack = this.getStack();
		 generatedCurrent_error = this.getCurrent_error();
		int generatedBackground_index = this.getBackground_index();
		if (!generatedClear_image) {
			if (gif_bytes < 2) {
				return_value = .GIF_INSUFFICIENT_FRAME_DATA;
				;
			}  else if ((gif_bytes == 2) && (gif_data[1] == -1024)) {
				return_value = .GIF_OK;
				;
			} 
			if ((frame == 0) || (generatedDecoded_frame == -/*    If the previous frame's disposal method requires we restore the background
			         *    colour or this is the first frame, clear the frame data
			        */1)) {
				.memset((byte)frame_data, -1024, generatedWidth * generatedHeight * );
				this.setDecoded_frame(frame/* The line below would fill the image with its background color, but because GIFs support
				             * transparency we likely wouldn't want to do that. */);
			}  else if ((frame != 0) && (generatedFrames[frame - 1].getDisposal_method() == /* memset((char*)frame_data, colour_table[gif->background_index], gif->width * gif->height * sizeof(int)); */2)) {
				this.setClear_image(1);
				if ((return_value = gif.gif_decode_frame((frame - 1))) != .GIF_OK) {
					;
				} 
				this.setClear_image(0/*    If the previous frame's disposal method requires we restore the previous
				         *    image, find the last image set to "do not dispose" and get that frame data
				        */);
			}  else if ((frame != 0) && (generatedFrames[frame - 1].getDisposal_method() == 3)) {
				while ((last_undisposed_frame != -1) && (generatedFrames[last_undisposed_frame--].getDisposal_method() == 3)) {
				}
				if (last_undisposed_frame == -/*    If we don't find one, clear the frame data
				                */1) {
					.memset((byte)frame_data, -1024, generatedWidth * generatedHeight * /* see notes above on transparency vs. background color */);
				} else {
						if ((return_value = gif.gif_decode_frame(last_undisposed_frame)) != .GIF_OK) {
							;
						} 
						((generatedBitmap_get_buffer) ? (Object)0 : ._assert("gif->bitmap_callbacks.bitmap_get_buffer", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\libnsgif.c", 935));
						frame_data = (Object).UNRECOGNIZEDFUNCTIONNAME(generatedFrame_image);
						if (!frame_data) {
							return .GIF_INSUFFICIENT_MEMORY;
						} 
				} 
			} 
			this.setDecoded_frame(frame);
			this.setSet_code_size(gif_data[/*    Initialise the LZW decoding
			        */0]);
			this.setBuffer_position((int)(gif_data - generatedGif_data + 1));
			this.setCode_size(generatedSet_code_size + /*    Set our code variables
			        */1);
			this.setClear_code((1 << generatedSet_code_size));
			this.setEnd_code(generatedClear_code + 1);
			this.setMax_code_size(generatedClear_code << 1);
			this.setMax_code(generatedClear_code + 2);
			this.setCurbit(this.setLastbit(0));
			this.setLast_byte(2);
			this.setGet_done(0);
			this.setDirect(generatedBuf);
			gif.gif_init_LZW();
			for (y = 0; y < height; /*    Decompress the data
			        */y++) {
				if (interlace) {
					decode_y = ModernizedCProgram.gif_interlaced_line(height, y) + offset_y;
				} else {
						decode_y = y + offset_y;
				} 
				frame_scanline = frame_data + offset_x + (decode_y * generatedWidth);
				x = width;
				while (x > 0) {
					burst_bytes = (int)(generatedStack_pointer - generatedStack);
					if (burst_bytes > 0) {
						if (burst_bytes > x) {
							burst_bytes = x;
						} 
						x -= burst_bytes;
						while (burst_bytes-- > 0) {
							colour = --generatedStack_pointer;
							if (((generatedFrames[frame].getTransparency()) && (colour != generatedFrames[frame].getTransparency_index())) || (!generatedFrames[frame].getTransparency())) {
								frame_scanline = colour_table[colour];
							} 
							frame_scanline++;
						}
					} else {
							if (!gif/*    Unexpected end of frame, try to recover
							                        */.gif_next_LZW()) {
								if (generatedCurrent_error == .GIF_END_OF_FRAME) {
									return_value = .GIF_OK;
								} else {
										return_value = generatedCurrent_error;
								} 
								;
							} 
					} 
				}
			}
		} else {
				if (generatedFrames[frame].getDisposal_method() == /*    Clear our frame
				        */2) {
					for (y = 0; y < height; y++) {
						frame_scanline = frame_data + offset_x + ((offset_y + y) * generatedWidth);
						if (generatedFrames[frame].getTransparency()) {
							.memset(frame_scanline, -1024, width * 4);
						} else {
								.memset(frame_scanline, colour_table[generatedBackground_index], width * 4);
						} 
					}
				} 
		} 
		Object generatedBitmap_set_opaque = generatedBitmap_callbacks.getBitmap_set_opaque();
		if (generatedBitmap_set_opaque) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedFrame_image, generatedFrames[frame].getOpaque());
		} 
		Object generatedBitmap_modified = generatedBitmap_callbacks.getBitmap_modified();
		if (generatedBitmap_modified) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedFrame_image);
		} 
		this.setBuffer_position(/*    Restore the buffer position
		    */save_buffer_position);
		return /*    Success!
		    */return_value/**    Skips the frame's extensions (which have been previously initialised)
		
		    @return GIF_INSUFFICIENT_FRAME_DATA for insufficient data to complete the frame
		        GIF_OK for successful decoding
		*/;
	}
	public  gif_skip_frame_extensions() {
		byte gif_data;
		byte gif_end;
		int gif_bytes;
		int block_size;
		Byte generatedGif_data = this.getGif_data();
		int generatedBuffer_position = this.getBuffer_position();
		gif_data = (byte)(generatedGif_data + generatedBuffer_position);
		int generatedBuffer_size = this.getBuffer_size();
		gif_end = (byte)(generatedGif_data + generatedBuffer_size);
		gif_bytes = (int)(gif_end - gif_data);
		while (gif_data[0] == /*    Skip the extensions
		    */-1024) {
			++gif_data;
			switch (gif_data[/*    Switch on extension label
			        */0/*    Move the pointer to the first data sub-block
			             *    1 byte for the extension label
			            */]) {
			case -1024:
					++gif_data;
					break;
			default:
					gif_data += (2 + gif_data[1]);
			}
			gif_bytes = (int)(gif_end - /*    Repeatedly skip blocks until we get a zero block or run out of data
			         *    This data is ignored by this gif decoder
			        */gif_data);
			block_size = 0;
			while (gif_data[0] != -1024) {
				block_size = gif_data[0] + 1;
				if ((gif_bytes -= block_size) < 0) {
					return .GIF_INSUFFICIENT_FRAME_DATA;
				} 
				gif_data += block_size;
			}
			++gif_data;
		}
		this.setBuffer_position((int)(gif_data - generatedGif_data));
		return .GIF_OK;
	}
	/*    Releases any workspace held by the animation
	*/
	public void gif_finalise() {
		Object generatedFrame_image = this.getFrame_image();
		gif_bitmap_callback_vt generatedBitmap_callbacks = this.getBitmap_callbacks();
		Object generatedBitmap_destroy = generatedBitmap_callbacks.getBitmap_destroy();
		if (generatedFrame_image) {
			((generatedBitmap_destroy) ? (Object)0 : ._assert("gif->bitmap_callbacks.bitmap_destroy", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\libnsgif.c", 1115));
			.UNRECOGNIZEDFUNCTIONNAME(generatedFrame_image);
		} 
		this.setFrame_image(((Object)0));
		gif_frame generatedFrames = this.getFrames();
		.free(generatedFrames);
		this.setFrames(((Object)0));
		Integer generatedLocal_colour_table = this.getLocal_colour_table();
		.free(generatedLocal_colour_table);
		this.setLocal_colour_table(((Object)0));
		Integer generatedGlobal_colour_table = this.getGlobal_colour_table();
		.free(generatedGlobal_colour_table);
		this.setGlobal_colour_table(((Object)0/**
		 * Initialise LZW decoding
		 */));
	}
	/*    Release all our memory blocks
	    */
	/*    Internal LZW routines
	*/
	public void gif_init_LZW() {
		int i;
		this.setCurrent_error(0);
		int generatedClear_code = this.getClear_code();
		Object generatedStack = this.getStack();
		if (generatedClear_code >= (1 << 12)) {
			this.setStack_pointer(generatedStack);
			this.setCurrent_error(.GIF_FRAME_DATA_ERROR);
			return ;
		} 
		Object generatedTable = this.getTable();
		.memset(generatedTable, -1024, (1 << 12) * /* initialise our table */8);
		for (i = 0; i < generatedClear_code; ++i) {
			generatedTable[1][i] = i;
		}
		int generatedSet_code_size = this.getSet_code_size();
		this.setCode_size(generatedSet_code_size + /* update our LZW parameters */1);
		this.setMax_code_size(generatedClear_code << 1);
		this.setMax_code(generatedClear_code + 2);
		this.setStack_pointer(generatedStack);
		int generatedFirstcode = this.getFirstcode();
		int generatedCode_size = this.getCode_size();
		do {
			this.setFirstcode(this.setOldcode(gif.gif_next_code(generatedCode_size)));
		} while (generatedFirstcode == generatedClear_code);
		byte generatedStack_pointer = this.getStack_pointer();
		generatedStack_pointer++ = generatedFirstcode;
	}
	public boolean gif_next_LZW() {
		int code;
		int incode;
		int block_size;
		int new_code;
		int generatedCode_size = this.getCode_size();
		code = gif.gif_next_code(generatedCode_size);
		int generatedClear_code = this.getClear_code();
		int generatedEnd_code = this.getEnd_code();
		boolean generatedZero_data_block = this.getZero_data_block();
		Byte generatedGif_data = this.getGif_data();
		int generatedBuffer_position = this.getBuffer_position();
		if (code < 0) {
			this.setCurrent_error(code);
			return 0;
		}  else if (code == generatedClear_code) {
			gif.gif_init_LZW();
			return 1;
		}  else if (code == generatedEnd_code) {
			if (generatedZero_data_block) {
				this.setCurrent_error(.GIF_FRAME_DATA_ERROR);
				return 0;
			} 
			block_size = 0;
			while (block_size != 1) {
				block_size = generatedGif_data[generatedBuffer_position] + 1;
				generatedBuffer_position += block_size;
			}
			this.setCurrent_error(.GIF_FRAME_DATA_ERROR);
			return 0;
		} 
		incode = code;
		int generatedMax_code = this.getMax_code();
		byte generatedStack_pointer = this.getStack_pointer();
		int generatedFirstcode = this.getFirstcode();
		int generatedOldcode = this.getOldcode();
		if (code >= generatedMax_code) {
			generatedStack_pointer++ = generatedFirstcode;
			code = generatedOldcode;
		} 
		Object generatedTable = this.getTable();
		while (code >= generatedClear_code) {
			generatedStack_pointer++ = generatedTable[1][code];
			new_code = generatedTable[0][code];
			if (new_code < generatedClear_code) {
				code = new_code;
				break;
			} 
			generatedStack_pointer++ = generatedTable[1][new_code];
			code = generatedTable[0][new_code];
			if (code == new_code) {
				this.setCurrent_error(.GIF_FRAME_DATA_ERROR);
				return 0;
			} 
		}
		generatedStack_pointer++ = this.setFirstcode(generatedTable[1][code]);
		int generatedMax_code_size = this.getMax_code_size();
		if ((code = generatedMax_code) < (1 << 12)) {
			generatedTable[0][code] = generatedOldcode;
			generatedTable[1][code] = generatedFirstcode;
			++generatedMax_code;
			if ((generatedMax_code >= generatedMax_code_size) && (generatedMax_code_size < (1 << 12))) {
				this.setMax_code_size(generatedMax_code_size << 1);
				++generatedCode_size;
			} 
		} 
		this.setOldcode(incode);
		return 1;
	}
	public int gif_next_code(int code_size) {
		int i;
		int j;
		int end;
		int count;
		int ret;
		byte b;
		(Object)code_size;
		int generatedCurbit = this.getCurbit();
		int generatedCode_size = this.getCode_size();
		end = generatedCurbit + generatedCode_size;
		int generatedLastbit = this.getLastbit();
		boolean generatedGet_done = this.getGet_done();
		Object generatedBuf = this.getBuf();
		Byte generatedDirect = this.getDirect();
		int generatedLast_byte = this.getLast_byte();
		Byte generatedGif_data = this.getGif_data();
		int generatedBuffer_position = this.getBuffer_position();
		int generatedBuffer_size = this.getBuffer_size();
		if (end >= generatedLastbit) {
			if (generatedGet_done) {
				return .GIF_END_OF_FRAME;
			} 
			generatedBuf[0] = generatedDirect[generatedLast_byte - 2];
			generatedBuf[1] = generatedDirect[generatedLast_byte - 1];
			this.setDirect(generatedGif_data + generatedBuffer_position);
			this.setZero_data_block(((count = generatedDirect[0]) == 0));
			if ((generatedBuffer_position + count) >= generatedBuffer_size) {
				return .GIF_INSUFFICIENT_FRAME_DATA;
			} 
			if (count == 0) {
				this.setGet_done(1);
			} else {
					generatedDirect -= 1;
					generatedBuf[2] = generatedDirect[2];
					generatedBuf[3] = generatedDirect[3];
			} 
			generatedBuffer_position += count + 1;
			this.setLast_byte(2 + /* update our variables */count);
			this.setCurbit((generatedCurbit - generatedLastbit) + 16);
			this.setLastbit((2 + count) << 3);
			end = generatedCurbit + generatedCode_size;
		} 
		i = generatedCurbit >> 3;
		if (i < 2) {
			b = generatedBuf;
		} else {
				b = generatedDirect;
		} 
		ret = b[i];
		j = (end >> 3) - 1;
		if (i <= j) {
			ret |=  (b[i + 1] << 8);
			if (i < j) {
				ret |=  (b[i + 2] << 16);
			} 
		} 
		ret = (ret >> (generatedCurbit % 8)) & ModernizedCProgram.maskTbl[generatedCode_size];
		generatedCurbit += generatedCode_size;
		return ret;
	}
	public gif_bitmap_callback_vt getBitmap_callbacks() {
		return bitmap_callbacks;
	}
	public void setBitmap_callbacks(gif_bitmap_callback_vt newBitmap_callbacks) {
		bitmap_callbacks = newBitmap_callbacks;
	}
	public Byte getGif_data() {
		return gif_data;
	}
	public void setGif_data(Byte newGif_data) {
		gif_data = newGif_data;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public int getFrame_count() {
		return frame_count;
	}
	public void setFrame_count(int newFrame_count) {
		frame_count = newFrame_count;
	}
	public int getFrame_count_partial() {
		return frame_count_partial;
	}
	public void setFrame_count_partial(int newFrame_count_partial) {
		frame_count_partial = newFrame_count_partial;
	}
	public gif_frame getFrames() {
		return frames;
	}
	public void setFrames(gif_frame newFrames) {
		frames = newFrames;
	}
	public int getDecoded_frame() {
		return decoded_frame;
	}
	public void setDecoded_frame(int newDecoded_frame) {
		decoded_frame = newDecoded_frame;
	}
	public Object getFrame_image() {
		return frame_image;
	}
	public void setFrame_image(Object newFrame_image) {
		frame_image = newFrame_image;
	}
	public int getLoop_count() {
		return loop_count;
	}
	public void setLoop_count(int newLoop_count) {
		loop_count = newLoop_count;
	}
	public  getCurrent_error() {
		return current_error;
	}
	public void setCurrent_error( newCurrent_error) {
		current_error = newCurrent_error;
	}
	public int getBuffer_position() {
		return buffer_position;
	}
	public void setBuffer_position(int newBuffer_position) {
		buffer_position = newBuffer_position;
	}
	public int getBuffer_size() {
		return buffer_size;
	}
	public void setBuffer_size(int newBuffer_size) {
		buffer_size = newBuffer_size;
	}
	public int getFrame_holders() {
		return frame_holders;
	}
	public void setFrame_holders(int newFrame_holders) {
		frame_holders = newFrame_holders;
	}
	public int getBackground_index() {
		return background_index;
	}
	public void setBackground_index(int newBackground_index) {
		background_index = newBackground_index;
	}
	public int getAspect_ratio() {
		return aspect_ratio;
	}
	public void setAspect_ratio(int newAspect_ratio) {
		aspect_ratio = newAspect_ratio;
	}
	public int getColour_table_size() {
		return colour_table_size;
	}
	public void setColour_table_size(int newColour_table_size) {
		colour_table_size = newColour_table_size;
	}
	public boolean getGlobal_colours() {
		return global_colours;
	}
	public void setGlobal_colours(boolean newGlobal_colours) {
		global_colours = newGlobal_colours;
	}
	public Integer getGlobal_colour_table() {
		return global_colour_table;
	}
	public void setGlobal_colour_table(Integer newGlobal_colour_table) {
		global_colour_table = newGlobal_colour_table;
	}
	public Integer getLocal_colour_table() {
		return local_colour_table;
	}
	public void setLocal_colour_table(Integer newLocal_colour_table) {
		local_colour_table = newLocal_colour_table;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
	public Byte getDirect() {
		return direct;
	}
	public void setDirect(Byte newDirect) {
		direct = newDirect;
	}
	public Object getTable() {
		return table;
	}
	public void setTable(Object newTable) {
		table = newTable;
	}
	public Object getStack() {
		return stack;
	}
	public void setStack(Object newStack) {
		stack = newStack;
	}
	public byte getStack_pointer() {
		return stack_pointer;
	}
	public void setStack_pointer(byte newStack_pointer) {
		stack_pointer = newStack_pointer;
	}
	public int getCode_size() {
		return code_size;
	}
	public void setCode_size(int newCode_size) {
		code_size = newCode_size;
	}
	public int getSet_code_size() {
		return set_code_size;
	}
	public void setSet_code_size(int newSet_code_size) {
		set_code_size = newSet_code_size;
	}
	public int getMax_code() {
		return max_code;
	}
	public void setMax_code(int newMax_code) {
		max_code = newMax_code;
	}
	public int getMax_code_size() {
		return max_code_size;
	}
	public void setMax_code_size(int newMax_code_size) {
		max_code_size = newMax_code_size;
	}
	public int getClear_code() {
		return clear_code;
	}
	public void setClear_code(int newClear_code) {
		clear_code = newClear_code;
	}
	public int getEnd_code() {
		return end_code;
	}
	public void setEnd_code(int newEnd_code) {
		end_code = newEnd_code;
	}
	public int getCurbit() {
		return curbit;
	}
	public void setCurbit(int newCurbit) {
		curbit = newCurbit;
	}
	public int getLastbit() {
		return lastbit;
	}
	public void setLastbit(int newLastbit) {
		lastbit = newLastbit;
	}
	public int getLast_byte() {
		return last_byte;
	}
	public void setLast_byte(int newLast_byte) {
		last_byte = newLast_byte;
	}
	public int getFirstcode() {
		return firstcode;
	}
	public void setFirstcode(int newFirstcode) {
		firstcode = newFirstcode;
	}
	public int getOldcode() {
		return oldcode;
	}
	public void setOldcode(int newOldcode) {
		oldcode = newOldcode;
	}
	public boolean getZero_data_block() {
		return zero_data_block;
	}
	public void setZero_data_block(boolean newZero_data_block) {
		zero_data_block = newZero_data_block;
	}
	public boolean getGet_done() {
		return get_done;
	}
	public void setGet_done(boolean newGet_done) {
		get_done = newGet_done;
	}
	public boolean getClear_image() {
		return clear_image;
	}
	public void setClear_image(boolean newClear_image) {
		clear_image = newClear_image;
	}
}
