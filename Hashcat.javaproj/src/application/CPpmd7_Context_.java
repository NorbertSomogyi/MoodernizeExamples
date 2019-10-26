package application;

/* Ppmd7.h -- PPMdH compression codec
2018-07-04 : Igor Pavlov : Public domain
This code is based on PPMd var.H (2001): Dmitry Shkarin : Public domain */
/* This code supports virtual RangeDecoder and includes the implementation
of RangeCoder from 7z, instead of RangeCoder from original PPMd var.H.
If you need the compatibility with original PPMd var.H, you can use external RangeDecoder */
public class CPpmd7_Context_ {
	private Object NumStats;
	private Object SummFreq;
	private Object Stats;
	private Object Suffix;
	
	public CPpmd7_Context_(Object NumStats, Object SummFreq, Object Stats, Object Suffix) {
		setNumStats(NumStats);
		setSummFreq(SummFreq);
		setStats(Stats);
		setSuffix(Suffix);
	}
	public CPpmd7_Context_() {
	}
	
	public Object getNumStats() {
		return NumStats;
	}
	public void setNumStats(Object newNumStats) {
		NumStats = newNumStats;
	}
	public Object getSummFreq() {
		return SummFreq;
	}
	public void setSummFreq(Object newSummFreq) {
		SummFreq = newSummFreq;
	}
	public Object getStats() {
		return Stats;
	}
	public void setStats(Object newStats) {
		Stats = newStats;
	}
	public Object getSuffix() {
		return Suffix;
	}
	public void setSuffix(Object newSuffix) {
		Suffix = newSuffix;
	}
}
