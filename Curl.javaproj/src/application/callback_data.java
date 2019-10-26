package application;

/***************************************************************************
 *                                  _   _ ____  _
 *  Project                     ___| | | |  _ \| |
 *                             / __| | | | |_) | |
 *                            | (__| |_| |  _ <| |___
 *                             \___|\___/|_| \_\_____|
 *
 * Copyright (C) 1998 - 2016, Daniel Stenberg, <daniel@haxx.se>, et al.
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
 * FTP wildcard pattern matching
 * </DESC>
 */
public class callback_data {
	private _iobuf output;
	
	public callback_data(_iobuf output) {
		setOutput(output);
	}
	public callback_data() {
	}
	
	public long file_is_coming(Object finfo, int remains) {
		.printf("%3d %40s %10luB ", remains, finfo.getFilename(), (long)finfo.getSize());
		switch (finfo.getFiletype()) {
		case CURLFILETYPE_FILE:
				.printf("FILE ");
				break;
		case CURLFILETYPE_DIRECTORY:
				.printf(" DIR\n");
				break;
		default:
				.printf("OTHER\n");
				break;
		}
		if (finfo.getFiletype() == CURLFILETYPE_FILE) {
			if (finfo.getSize() > /* do not transfer files >= 50B */50) {
				.printf("SKIPPED\n");
				return CURL_CHUNK_BGN_FUNC_SKIP;
			} 
			ModernizedCProgram.data.setOutput(.fopen(finfo.getFilename(), "wb"));
			if (!ModernizedCProgram.data.getOutput()) {
				return CURL_CHUNK_BGN_FUNC_FAIL;
			} 
		} 
		return CURL_CHUNK_BGN_FUNC_OK;
	}
	public long file_is_downloaded() {
		if (ModernizedCProgram.data.getOutput()) {
			.printf("DOWNLOADED\n");
			.fclose(ModernizedCProgram.data.getOutput());
			ModernizedCProgram.data.setOutput(-1024);
		} 
		return CURL_CHUNK_END_FUNC_OK;
	}
	public _iobuf getOutput() {
		return output;
	}
	public void setOutput(_iobuf newOutput) {
		output = newOutput;
	}
}
