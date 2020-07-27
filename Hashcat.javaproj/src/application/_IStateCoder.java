package application;

// ECoderFinishMode values are identical to ELzmaFinishMode
/* finish at any point */
/* block must be finished at the end */
public class _IStateCoder {
	private Object p;
	private Object Free;
	private Object SetProps;
	private Object Init;
	private Object Code2;
	private Object Filter;
	
	public _IStateCoder(Object p, Object Free, Object SetProps, Object Init, Object Code2, Object Filter) {
		setP(p);
		setFree(Free);
		setSetProps(SetProps);
		setInit(Init);
		setCode2(Code2);
		setFilter(Filter);
	}
	public _IStateCoder() {
	}
	
	public Object BraState_SetFromMethod(Object id, int encodeMode, Object alloc) {
		CBraState decoder = new CBraState();
		if (id < 3 || id > 9) {
			return 4;
		} 
		Object generatedP = this.getP();
		decoder = (CBraState)generatedP;
		if (!decoder) {
			decoder = (CBraState)/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, /*Error: Unsupported expression*/);
			if (!decoder) {
				return 2;
			} 
			this.setP(decoder);
			this.setFree(BraState_Free);
			this.setSetProps(BraState_SetProps);
			this.setInit(BraState_Init);
			this.setCode2(BraState_Code2);
			this.setFilter(BraState_Filter);
		} 
		decoder.setMethodId((UInt32)id);
		decoder.setEncodeMode(encodeMode);
		return 0/* ---------- SbState ---------- */;
	}
	public Object Lzma2State_SetFromMethod(Object outBuf, Object outBufSize, Object alloc) {
		Object generatedP = this.getP();
		CLzma2Dec_Spec spec = (CLzma2Dec_Spec)generatedP;
		Object generatedDecoder = spec.getDecoder();
		if (!spec) {
			spec = (CLzma2Dec_Spec)/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, /*Error: Unsupported expression*/);
			if (!spec) {
				return 2;
			} 
			this.setP(spec);
			this.setFree(Lzma2State_Free);
			this.setSetProps(Lzma2State_SetProps);
			this.setInit(Lzma2State_Init);
			this.setCode2(Lzma2State_Code2);
			this.setFilter(((Object)0));
			{ 
				((generatedDecoder).getDecoder()).setDic(((Object)0));
				(generatedDecoder).setProbs(((Object)0));
			}
			;
		} 
		spec.setOutBufMode(0);
		if (outBuf) {
			spec.setOutBufMode(1);
			generatedDecoder.setDic(outBuf);
			generatedDecoder.setDicBufSize(outBufSize);
		} 
		return 0;
	}
	public Object Lzma2State_ResetOutBuf(Object outBuf, Object outBufSize) {
		Object generatedP = this.getP();
		CLzma2Dec_Spec spec = (CLzma2Dec_Spec)generatedP;
		Object generatedOutBufMode = spec.getOutBufMode();
		if ((generatedOutBufMode && !outBuf) || (!generatedOutBufMode && outBuf)) {
			return 11;
		} 
		Object generatedDecoder = spec.getDecoder();
		if (outBuf) {
			generatedDecoder.getDecoder().setDic(outBuf);
			generatedDecoder.setDicBufSize(outBufSize);
		} 
		return 0;
	}
	public Object getP() {
		return p;
	}
	public void setP(Object newP) {
		p = newP;
	}
	public Object getFree() {
		return Free;
	}
	public void setFree(Object newFree) {
		Free = newFree;
	}
	public Object getSetProps() {
		return SetProps;
	}
	public void setSetProps(Object newSetProps) {
		SetProps = newSetProps;
	}
	public Object getInit() {
		return Init;
	}
	public void setInit(Object newInit) {
		Init = newInit;
	}
	public Object getCode2() {
		return Code2;
	}
	public void setCode2(Object newCode2) {
		Code2 = newCode2;
	}
	public Object getFilter() {
		return Filter;
	}
	public void setFilter(Object newFilter) {
		Filter = newFilter;
	}
}
