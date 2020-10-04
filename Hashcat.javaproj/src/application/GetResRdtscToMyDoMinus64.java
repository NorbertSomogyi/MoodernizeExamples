package application;

public class GetResRdtscToMyDoMinus64 {
	
	
	private static _LARGE_INTEGER GetResRdtsc(Object fComputeTimeQueryPerf) {
		LARGE_INTEGER LIres = new LARGE_INTEGER();
		LARGE_INTEGER endTime64 = new LARGE_INTEGER();
		endTime64.myGetRDTSC32();
		LIres.setLowPart(LIres.setHighPart(0));
		LIres.MyDoMinus64(endTime64, beginTime64);
		return LIres;
	}
	//   printf("rdtsc = %I64x\n",__rdtsc());
	// printf("rdtsc = %I64x\n",__rdtsc());
	public static void myGetRDTSC32() {
		DWORD dwEdx = new DWORD();
		DWORD dwEax = new DWORD();
		_asm;
		this.setLowPart(dwEax);
		this.setHighPart(dwEdx);
	}
	private static void MyDoMinus64(_LARGE_INTEGER A, _LARGE_INTEGER B) {
		Object generatedHighPart = A.getHighPart();
		this.setHighPart(generatedHighPart - generatedHighPart);
		Object generatedLowPart = A.getLowPart();
		if (generatedLowPart >= generatedLowPart) {
			this.setLowPart(generatedLowPart - generatedLowPart);
		} else {
				this.setLowPart(generatedLowPart - generatedLowPart);
				generatedHighPart--;
		} 
	}
}
