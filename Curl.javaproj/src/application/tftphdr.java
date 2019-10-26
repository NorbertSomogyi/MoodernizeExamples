package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2012, Daniel Stenberg, <daniel@haxx.se>, et al.
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
/* This file is a rewrite/clone of the arpa/tftp.h file for systems without
   it. */
/* data segment size */
/*NOTHING*/
/* Using a packed struct as binary in a program is begging for problems, but
   the tftpd server was written like this so we have this struct here to make
   things build. */
public class tftphdr {
	private int th_opcode;
	private int th_block;
	private Object th_data;
	
	public tftphdr(int th_opcode, int th_block, Object th_data) {
		setTh_opcode(th_opcode);
		setTh_block(th_block);
		setTh_data(th_data);
	}
	public tftphdr() {
	}
	
	public tftphdr rw_init(int x) {
		ModernizedCProgram.newline = /* init crlf flag */0;
		ModernizedCProgram.prevchar = -1;
		ModernizedCProgram.bfs[0].setCounter(-/* pass out the first buffer */3);
		ModernizedCProgram.current = 0;
		ModernizedCProgram.bfs[1].setCounter(-2);
		ModernizedCProgram.nextone = /* ahead or behind? */x;
		return ModernizedCProgram.bfs[0].getBuf().getHdr();
	}
	public tftphdr w_init() {
		tftphdr tftphdr = new tftphdr();
		return tftphdr.rw_init(/* write-behind */0);
	}
	public tftphdr r_init() {
		tftphdr tftphdr = new tftphdr();
		return tftphdr.rw_init(/* read-ahead */1/* Have emptied current buffer by sending to net and getting ack.
		   Free it and return next buffer filled with data.
		 */);
	}
	public int getTh_opcode() {
		return th_opcode;
	}
	public void setTh_opcode(int newTh_opcode) {
		th_opcode = newTh_opcode;
	}
	public int getTh_block() {
		return th_block;
	}
	public void setTh_block(int newTh_block) {
		th_block = newTh_block;
	}
	public Object getTh_data() {
		return th_data;
	}
	public void setTh_data(Object newTh_data) {
		th_data = newTh_data;
	}
}
