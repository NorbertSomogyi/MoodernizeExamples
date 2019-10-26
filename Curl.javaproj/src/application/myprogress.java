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
/* <DESC>
 * Use the progress callbacks, old and/or new one depending on available
 * libcurl version.
 * </DESC>
 */
/* In libcurl 7.61.0, support was added for extracting the time in plain
   microseconds. Older libcurl versions are stuck in using 'double' for this
   information so we complicate this example a bit by supporting either
   approach. */
/* microseconds */
public class myprogress {
	private double lastruntime;
	private Object curl;
	
	public myprogress(double lastruntime, Object curl) {
		setLastruntime(lastruntime);
		setCurl(curl);
	}
	public myprogress() {
	}
	
	public double getLastruntime() {
		return lastruntime;
	}
	public void setLastruntime(double newLastruntime) {
		lastruntime = newLastruntime;
	}
	public Object getCurl() {
		return curl;
	}
	public void setCurl(Object newCurl) {
		curl = newCurl;
	}
}
