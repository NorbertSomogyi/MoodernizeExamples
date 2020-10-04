package application;

public class AllocUnitsRareToInsertNode {
	
	
	private static Object AllocUnitsRare(int indx) {
		int i;
		Object retVal;
		Object generatedGlueCount = this.getGlueCount();
		Object generatedFreeList = this.getFreeList();
		if (generatedGlueCount == 0) {
			p.GlueFreeBlocks();
			if (generatedFreeList[indx] != 0) {
				return p.RemoveNode(indx);
			} 
		} 
		i = indx;
		Object generatedIndx2Units = this.getIndx2Units();
		Object generatedUnitsStart = this.getUnitsStart();
		Object generatedText = this.getText();
		do {
			if (++i == (4 + 4 + 4 + ((128 + 3 - 1 * 4 - 2 * 4 - 3 * 4) / 4))) {
				UInt32 numBytes = ((UInt32)((generatedIndx2Units[indx])) * 12);
				generatedGlueCount--;
				return ((UInt32)(generatedUnitsStart - generatedText) > numBytes) ? (generatedUnitsStart -= numBytes) : ((null));
			} 
		} while (generatedFreeList[i] == 0);
		retVal = p.RemoveNode(i);
		p.SplitBlock(retVal, i, indx);
		return retVal;
	}
	public static void SplitBlock(Object ptr, int oldIndx, int newIndx) {
		Object generatedIndx2Units = this.getIndx2Units();
		int i;
		int nu = (generatedIndx2Units[oldIndx]) - (generatedIndx2Units[newIndx]);
		ptr = (Byte)ptr + ((UInt32)((generatedIndx2Units[newIndx])) * 12);
		Object generatedUnits2Indx = this.getUnits2Indx();
		if ((generatedIndx2Units[i = (generatedUnits2Indx[(size_t)(nu) - 1])]) != nu) {
			int k = (generatedIndx2Units[--i]);
			p.InsertNode(((Byte)ptr) + ((UInt32)(k) * 12), nu - k - 1);
		} 
		p.InsertNode(ptr, i);
	}
	private static void InsertNode(Object node, int indx) {
		Object generatedFreeList = this.getFreeList();
		((CPpmd_Void_Ref)node) = generatedFreeList[indx];
		generatedFreeList[indx] = (node);
	}
}
