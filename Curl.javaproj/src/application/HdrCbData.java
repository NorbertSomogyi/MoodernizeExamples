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
/*
 * curl operates using a single HdrCbData struct variable, a
 * pointer to this is passed as userdata pointer to tool_header_cb.
 *
 * 'outs' member is a pointer to the OutStruct variable used to keep
 * track of information relative to curl's output writing.
 *
 * 'heads' member is a pointer to the OutStruct variable used to keep
 * track of information relative to header response writing.
 *
 * 'honor_cd_filename' member is TRUE when tool_header_cb is allowed
 * to honor Content-Disposition filename property and accordingly
 * set 'outs' filename, otherwise FALSE;
 */
public class HdrCbData {
	private GlobalConfig global;
	private OperationConfig config;
	private OutStruct outs;
	private OutStruct heads;
	private  honor_cd_filename;
	
	public HdrCbData(GlobalConfig global, OperationConfig config, OutStruct outs, OutStruct heads,  honor_cd_filename) {
		setGlobal(global);
		setConfig(config);
		setOuts(outs);
		setHeads(heads);
		setHonor_cd_filename(honor_cd_filename);
	}
	public HdrCbData() {
	}
	
	public GlobalConfig getGlobal() {
		return global;
	}
	public void setGlobal(GlobalConfig newGlobal) {
		global = newGlobal;
	}
	public OperationConfig getConfig() {
		return config;
	}
	public void setConfig(OperationConfig newConfig) {
		config = newConfig;
	}
	public OutStruct getOuts() {
		return outs;
	}
	public void setOuts(OutStruct newOuts) {
		outs = newOuts;
	}
	public OutStruct getHeads() {
		return heads;
	}
	public void setHeads(OutStruct newHeads) {
		heads = newHeads;
	}
	public  getHonor_cd_filename() {
		return honor_cd_filename;
	}
	public void setHonor_cd_filename( newHonor_cd_filename) {
		honor_cd_filename = newHonor_cd_filename;
	}
}
