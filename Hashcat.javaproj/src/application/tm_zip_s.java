package application;

/* zip.h -- IO on .zip files using zlib
   Version 1.1, February 14h, 2010
   part of the MiniZip project - ( http://www.winimage.com/zLibDll/minizip.html )

         Copyright (C) 1998-2010 Gilles Vollant (minizip) ( http://www.winimage.com/zLibDll/minizip.html )

         Modifications for Zip64 support
         Copyright (C) 2009-2010 Mathias Svensson ( http://result42.com )

         For more info read MiniZip_info.txt

         ---------------------------------------------------------------------------

   Condition of use and distribution are the same than zlib :

  This software is provided 'as-is', without any express or implied
  warranty.  In no event will the authors be held liable for any damages
  arising from the use of this software.

  Permission is granted to anyone to use this software for any purpose,
  including commercial applications, and to alter it and redistribute it
  freely, subject to the following restrictions:

  1. The origin of this software must not be misrepresented; you must not
     claim that you wrote the original software. If you use this software
     in a product, an acknowledgment in the product documentation would be
     appreciated but is not required.
  2. Altered source versions must be plainly marked as such, and must not be
     misrepresented as being the original software.
  3. This notice may not be removed or altered from any source distribution.

        ---------------------------------------------------------------------------

        Changes

        See header of zip.h

*/
//#define HAVE_BZIP2
/* like the STRICT of WIN32, we define a pointer that cannot be converted
    from (void*) without cast */
/* default memLevel */
/* tm_zip contain date/time info */
public class tm_zip_s {
	private Object tm_sec;
	private Object tm_min;
	private Object tm_hour;
	private Object tm_mday;
	private Object tm_mon;
	private Object tm_year;
	
	public tm_zip_s(Object tm_sec, Object tm_min, Object tm_hour, Object tm_mday, Object tm_mon, Object tm_year) {
		setTm_sec(tm_sec);
		setTm_min(tm_min);
		setTm_hour(tm_hour);
		setTm_mday(tm_mday);
		setTm_mon(tm_mon);
		setTm_year(tm_year);
	}
	public tm_zip_s() {
	}
	
	/*
	   minizip.c
	   Version 1.1, February 14h, 2010
	   sample part of the MiniZip project - ( http://www.winimage.com/zLibDll/minizip.html )
	
	         Copyright (C) 1998-2010 Gilles Vollant (minizip) ( http://www.winimage.com/zLibDll/minizip.html )
	
	         Modifications of Unzip for Zip64
	         Copyright (C) 2007-2008 Even Rouault
	
	         Modifications for Zip64 support on both zip and unzip
	         Copyright (C) 2009-2010 Mathias Svensson ( http://result42.com )
	*/
	// In darwin and perhaps other BSD variants off_t is a 64 bit value, hence no need for specific 64 bit functions
	public Object filetime(Byte f, Object dt) {
		int ret = /* dostime */0;
		Object generatedFtLastWriteTime = ff32.getFtLastWriteTime();
		{ 
			FILETIME ftLocal = new FILETIME();
			HANDLE hFind = new HANDLE();
			WIN32_FIND_DATAA ff32 = new WIN32_FIND_DATAA();
			hFind = .FindFirstFileA(f, ff32);
			if (hFind != (HANDLE)(true)) {
				.FileTimeToLocalFileTime((generatedFtLastWriteTime), ftLocal);
				.FileTimeToDosDateTime(ftLocal, ((LPWORD)dt) + 1, ((LPWORD)dt) + 0);
				.FindClose(hFind);
				ret = 1;
			} 
		}
		return ret/* name of file to get info on */;/* return value: access, modific. and creation times */
	}
	/* name of file to get info on */
	/* return value: access, modific. and creation times */
	/* dostime */
	/* results of stat() */
	public Object getTm_sec() {
		return tm_sec;
	}
	public void setTm_sec(Object newTm_sec) {
		tm_sec = newTm_sec;
	}
	public Object getTm_min() {
		return tm_min;
	}
	public void setTm_min(Object newTm_min) {
		tm_min = newTm_min;
	}
	public Object getTm_hour() {
		return tm_hour;
	}
	public void setTm_hour(Object newTm_hour) {
		tm_hour = newTm_hour;
	}
	public Object getTm_mday() {
		return tm_mday;
	}
	public void setTm_mday(Object newTm_mday) {
		tm_mday = newTm_mday;
	}
	public Object getTm_mon() {
		return tm_mon;
	}
	public void setTm_mon(Object newTm_mon) {
		tm_mon = newTm_mon;
	}
	public Object getTm_year() {
		return tm_year;
	}
	public void setTm_year(Object newTm_year) {
		tm_year = newTm_year;
	}
}
