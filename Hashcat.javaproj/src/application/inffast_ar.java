package application;

/* inffas8664.c is a hand tuned assembler version of inffast.c - fast decoding
 * version for AMD64 on Windows using Microsoft C compiler
 *
 * Copyright (C) 1995-2003 Mark Adler
 * For conditions of distribution and use, see copyright notice in zlib.h
 *
 * Copyright (C) 2003 Chris Anderson <christop@charm.net>
 * Please use the copyright conditions above.
 *
 * 2005 - Adaptation to Microsoft C Compiler for AMD64 by Gilles Vollant
 *
 * inffas8664.c call function inffas8664fnc in inffasx64.asm
 *  inffasx64.asm is automatically convert from AMD64 portion of inffas86.c
 *
 * Dec-29-2003 -- I added AMD64 inflate asm support.  This version is also
 * slightly quicker on x86 systems because, instead of using rep movsb to copy
 * data, it uses rep movsw, which moves data in 2-byte chunks instead of single
 * bytes.  I've tested the AMD64 code on a Fedora Core 1 + the x86_64 updates
 * from http://fedora.linux.duke.edu/fc1_x86_64
 * which is running on an Athlon 64 3000+ / Gigabyte GA-K8VT800M system with
 * 1GB ram.  The 64-bit version is about 4% faster than the 32-bit version,
 * when decompressing mozilla-source-1.3.tar.gz.
 *
 * Mar-13-2003 -- Most of this is derived from inffast.S which is derived from
 * the gcc -S output of zlib-1.2.0/inffast.c.  Zlib-1.2.0 is in beta release at
 * the moment.  I have successfully compiled and tested this code with gcc2.96,
 * gcc3.2, icc5.0, msvc6.0.  It is very close to the speed of inffast.S
 * compiled with gcc -DNO_MMX, but inffast.S is still faster on the P3 with MMX
 * enabled.  I will attempt to merge the MMX code into this version.  Newer
 * versions of this and inffast.S can be found at
 * http://www.eetbeetee.com/zlib/ and http://www.charm.net/~christop/zlib/
 *
 */
/* Mark Adler's comments from inffast.c: */
/*
   Decode literal, length, and distance codes and write out the resulting
   literal and match bytes until either not enough input or output is
   available, an end-of-block is encountered, or a data error is encountered.
   When large enough input and output buffers are supplied to inflate(), for
   example, a 16K input buffer and a 64K output buffer, more than 95% of the
   inflate execution time is spent in this routine.

   Entry assumptions:

        state->mode == LEN
        strm->avail_in >= 6
        strm->avail_out >= 258
        start >= strm->avail_out
        state->bits < 8

   On return, state->mode is one of:

        LEN -- ran out of enough output space or enough available input
        TYPE -- reached end of block code, inflate() to interpret next block
        BAD -- error in block data

   Notes:

    - The maximum input bits used by a length/distance pair is 15 bits for the
      length code, 5 bits for the length extra, 15 bits for the distance code,
      and 13 bits for the distance extra.  This totals 48 bits, or six bytes.
      Therefore if strm->avail_in >= 6, then there is enough input to avoid
      checking for available input while decoding.

    - The maximum bytes that a single length/distance pair can output is 258
      bytes, which is the maximum length that can be coded.  inflate_fast()
      requires strm->avail_out >= 258 for each loop to avoid checking for
      output space.
 */
public class inffast_ar {
	private Object esp;
	private Object ebp;
	private byte in;
	private Byte last;
	private Byte out;
	private Byte beg;
	private Byte end;
	private Byte window;
	private Object lcode;
	private Object dcode;
	private Object hold;
	private int bits;
	private int wsize;
	private int write;
	private int lmask;
	private int dmask;
	private int len;
	private int dist;
	private int status;
	
	public inffast_ar(Object esp, Object ebp, byte in, Byte last, Byte out, Byte beg, Byte end, Byte window, Object lcode, Object dcode, Object hold, int bits, int wsize, int write, int lmask, int dmask, int len, int dist, int status) {
		setEsp(esp);
		setEbp(ebp);
		setIn(in);
		setLast(last);
		setOut(out);
		setBeg(beg);
		setEnd(end);
		setWindow(window);
		setLcode(lcode);
		setDcode(dcode);
		setHold(hold);
		setBits(bits);
		setWsize(wsize);
		setWrite(write);
		setLmask(lmask);
		setDmask(dmask);
		setLen(len);
		setDist(dist);
		setStatus(status);
	}
	public inffast_ar() {
	}
	
	public Object getEsp() {
		return esp;
	}
	public void setEsp(Object newEsp) {
		esp = newEsp;
	}
	public Object getEbp() {
		return ebp;
	}
	public void setEbp(Object newEbp) {
		ebp = newEbp;
	}
	public byte getIn() {
		return in;
	}
	public void setIn(byte newIn) {
		in = newIn;
	}
	public Byte getLast() {
		return last;
	}
	public void setLast(Byte newLast) {
		last = newLast;
	}
	public Byte getOut() {
		return out;
	}
	public void setOut(Byte newOut) {
		out = newOut;
	}
	public Byte getBeg() {
		return beg;
	}
	public void setBeg(Byte newBeg) {
		beg = newBeg;
	}
	public Byte getEnd() {
		return end;
	}
	public void setEnd(Byte newEnd) {
		end = newEnd;
	}
	public Byte getWindow() {
		return window;
	}
	public void setWindow(Byte newWindow) {
		window = newWindow;
	}
	public Object getLcode() {
		return lcode;
	}
	public void setLcode(Object newLcode) {
		lcode = newLcode;
	}
	public Object getDcode() {
		return dcode;
	}
	public void setDcode(Object newDcode) {
		dcode = newDcode;
	}
	public Object getHold() {
		return hold;
	}
	public void setHold(Object newHold) {
		hold = newHold;
	}
	public int getBits() {
		return bits;
	}
	public void setBits(int newBits) {
		bits = newBits;
	}
	public int getWsize() {
		return wsize;
	}
	public void setWsize(int newWsize) {
		wsize = newWsize;
	}
	public int getWrite() {
		return write;
	}
	public void setWrite(int newWrite) {
		write = newWrite;
	}
	public int getLmask() {
		return lmask;
	}
	public void setLmask(int newLmask) {
		lmask = newLmask;
	}
	public int getDmask() {
		return dmask;
	}
	public void setDmask(int newDmask) {
		dmask = newDmask;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public int getDist() {
		return dist;
	}
	public void setDist(int newDist) {
		dist = newDist;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int newStatus) {
		status = newStatus;
	}
}
/* 64   32                               x86  x86_64 */
