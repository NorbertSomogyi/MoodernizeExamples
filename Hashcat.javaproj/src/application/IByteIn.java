package application;

/* 7zTypes.h -- Basic types
2018-08-04 : Igor Pavlov : Public domain */
/* #include <windows.h> */
/* typedef DWORD WRes; */
/* define _SZ_NO_INT_64, if your compiler doesn't support 64-bit integers.
   NOTES: Some code will work incorrectly in that case! */
/* typedef BoolInt Bool; */
/* inline keyword : for C++ / C99 */
/* GCC, clang: */
/*
#if defined (__GNUC__) && (__GNUC__ >= 4)
#define MY_FORCE_INLINE __attribute__((always_inline))
#define MY_NO_INLINE __attribute__((noinline))
#endif
*/
/* The following interfaces use first parameter as pointer to structure */
public class IByteIn {
	private Object Read;
	
	public IByteIn(Object Read) {
		setRead(Read);
	}
	public IByteIn() {
	}
	
	public Object getRead() {
		return Read;
	}
	public void setRead(Object newRead) {
		Read = newRead;
	}
}
