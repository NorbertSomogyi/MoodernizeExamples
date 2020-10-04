package application;

/* unzip.h -- IO for uncompress .zip files using zlib
   Version 1.1, February 14h, 2010
   part of the MiniZip project - ( http://www.winimage.com/zLibDll/minizip.html )

         Copyright (C) 1998-2010 Gilles Vollant (minizip) ( http://www.winimage.com/zLibDll/minizip.html )

         Modifications of Unzip for Zip64
         Copyright (C) 2007-2008 Even Rouault

         Modifications for Zip64 support on both zip and unzip
         Copyright (C) 2009-2010 Mathias Svensson ( http://result42.com )

         For more info read MiniZip_info.txt

         ---------------------------------------------------------------------------------

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

  ---------------------------------------------------------------------------------

        Changes

        See header of unzip64.c

*/
/* like the STRICT of WIN32, we define a pointer that cannot be converted
    from (void*) without cast */
/* tm_unz contain date/time info */
public class tm_unz_s {
	private Object tm_sec;
	private Object tm_min;
	private Object tm_hour;
	private Object tm_mday;
	private Object tm_mon;
	private Object tm_year;
	
	public tm_unz_s(Object tm_sec, Object tm_min, Object tm_hour, Object tm_mday, Object tm_mon, Object tm_year) {
		setTm_sec(tm_sec);
		setTm_min(tm_min);
		setTm_hour(tm_hour);
		setTm_mday(tm_mday);
		setTm_mon(tm_mon);
		setTm_year(tm_year);
	}
	public tm_unz_s() {
	}
	
	public void unz64local_DosDateToTmuDate(Object ulDosDate) {
		ZPOS64_T uDate = new ZPOS64_T();
		uDate = (ZPOS64_T)(ulDosDate >> 16);
		this.setTm_mday((uInt)(uDate & -1024));
		this.setTm_mon((uInt)((((uDate) & -1024) / -1024) - 1));
		this.setTm_year((uInt)(((uDate & -1024) / -1024) + 1980));
		this.setTm_hour((uInt)((ulDosDate & -1024) / -1024));
		this.setTm_min((uInt)((ulDosDate & -1024) / -1024));
		this.setTm_sec((uInt)(2 * (ulDosDate & -1024/*
		  Get Info about the current file in the zipfile, with internal only info
		*/)));
	}
	/*
	   miniunz.c
	   Version 1.1, February 14h, 2010
	   sample part of the MiniZip project - ( http://www.winimage.com/zLibDll/minizip.html )
	
	         Copyright (C) 1998-2010 Gilles Vollant (minizip) ( http://www.winimage.com/zLibDll/minizip.html )
	
	         Modifications of Unzip for Zip64
	         Copyright (C) 2007-2008 Even Rouault
	
	         Modifications for Zip64 support on both zip and unzip
	         Copyright (C) 2009-2010 Mathias Svensson ( http://result42.com )
	*/
	// In darwin and perhaps other BSD variants off_t is a 64 bit value, hence no need for specific 64 bit functions
	/*
	  mini unzip, demo of unzip package
	
	  usage :
	  Usage : miniunz [-exvlo] file.zip [file_to_extract] [-d extractdir]
	
	  list the file in the zipfile, and print the content of FILE_ID.ZIP or README.TXT
	    if it exists
	*/
	/* change_file_date : change the date/time of a file
	    filename : the filename of the file where date/time must be modified
	    dosdate : the new date at the MSDos format (4 bytes)
	    tmu_date : the SAME new date at the tm_unz format */
	public void change_file_date(Object filename, Object dosdate) {
		HANDLE hFile = new HANDLE();
		FILETIME ftm = new FILETIME();
		FILETIME ftLocal = new FILETIME();
		FILETIME ftCreate = new FILETIME();
		FILETIME ftLastAcc = new FILETIME();
		FILETIME ftLastWrite = new FILETIME();
		hFile = /*Error: Function owner not recognized*/CreateFileA(filename, -1024 | -1024, 0, (null), 3, 0, (null));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GetFileTime(hFile, ftCreate, ftLastAcc, ftLastWrite);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/DosDateTimeToFileTime((WORD)(dosdate >> 16), (WORD)dosdate, ftLocal);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LocalFileTimeToFileTime(ftLocal, ftm);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetFileTime(hFile, ftm, ftLastAcc, ftm);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(hFile);
	}
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
