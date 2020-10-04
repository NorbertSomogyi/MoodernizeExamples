package application;

public class SzAr_FreeToSzAr_Init {
	
	
	public static void SzAr_Free(Object alloc) {
		Object generatedPackPositions = this.getPackPositions();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedPackPositions);
		Object generatedFolderCRCs = this.getFolderCRCs();
		generatedFolderCRCs.SzBitUi32s_Free(alloc);
		Object generatedFoCodersOffsets = this.getFoCodersOffsets();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedFoCodersOffsets);
		Object generatedFoStartPackStreamIndex = this.getFoStartPackStreamIndex();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedFoStartPackStreamIndex);
		Object generatedFoToCoderUnpackSizes = this.getFoToCoderUnpackSizes();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedFoToCoderUnpackSizes);
		Object generatedFoToMainUnpackSizeIndex = this.getFoToMainUnpackSizeIndex();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedFoToMainUnpackSizeIndex);
		Object generatedCoderUnpackSizes = this.getCoderUnpackSizes();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedCoderUnpackSizes);
		Object generatedCodersData = this.getCodersData();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedCodersData);
		p.SzAr_Init();
	}
	public static void SzBitUi32s_Free(Object alloc) {
		Object generatedDefs = this.getDefs();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedDefs);
		this.setDefs((null));
		Object generatedVals = this.getVals();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(alloc, generatedVals);
		this.setVals((null));
	}
	public static void SzAr_Init() {
		this.setNumPackStreams(0);
		this.setNumFolders(0);
		this.setPackPositions((null));
		Object generatedFolderCRCs = this.getFolderCRCs();
		{ 
			(generatedFolderCRCs).setDefs((null));
			(generatedFolderCRCs).setVals((null));
		}
		;
		this.setFoCodersOffsets((null));
		this.setFoStartPackStreamIndex((null));
		this.setFoToCoderUnpackSizes((null));
		this.setFoToMainUnpackSizeIndex((null));
		this.setCoderUnpackSizes((null));
		this.setCodersData((null));
	}
}
