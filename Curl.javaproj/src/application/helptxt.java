package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2019, Daniel Stenberg, <daniel@haxx.se>, et al.
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
/* keep this as LAST include */
/*
 * The help output is generated with the following command
 ---------------------------------------------------------

  cd $srcroot/docs/cmdline-opts
  ./gen.pl listhelp
 */
public class helptxt {
	private Object opt;
	private Object desc;
	
	public helptxt(Object opt, Object desc) {
		setOpt(opt);
		setDesc(desc);
	}
	public helptxt() {
	}
	
	public Object getOpt() {
		return opt;
	}
	public void setOpt(Object newOpt) {
		opt = newOpt;
	}
	public Object getDesc() {
		return desc;
	}
	public void setDesc(Object newDesc) {
		desc = newDesc;
	}
}
