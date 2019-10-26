package application;

public class ILookInStream {
	private Object Look;
	private Object Skip;
	private Object Read;
	private Object Seek;
	
	public ILookInStream(Object Look, Object Skip, Object Read, Object Seek) {
		setLook(Look);
		setSkip(Skip);
		setRead(Read);
		setSeek(Seek);
	}
	public ILookInStream() {
	}
	
	public Object LookInStream_SeekRead_ForArc(Object offset, Object buf, Object size) {
		{ 
			int __result__ = (ModernizedCProgram.LookInStream_SeekTo(stream, offset));
			if (__result__ != 0) {
				return __result__;
			} 
		}
		;
		return ModernizedCProgram.LookInStream_Read(stream, buf, size/* return LookInStream_Read2(stream, buf, size, SZ_ERROR_NO_ARCHIVE); */);
	}
	/* 7zDec.c -- Decoding from 7z folder
	2019-02-02 : Igor Pavlov : Public domain */
	/* #define _7ZIP_PPMD_SUPPPORT */
	public Object SzDecodeLzma(Object props, int propsSize, Object inSize, Object outBuffer, Object outSize, Object allocMain) {
		CLzmaDec state = new CLzmaDec();
		SRes res = 0;
		{ 
			(state).setDic(((Object)0));
			(state).setProbs(((Object)0));
		}
		;
		{ 
			int __result__ = (state.LzmaDec_AllocateProbs(props, propsSize, allocMain));
			if (__result__ != 0) {
				return __result__;
			} 
		}
		;
		state.setDic(outBuffer);
		state.setDicBufSize(outSize);
		state.LzmaDec_Init();
		Object generatedDicPos = state.getDicPos();
		for (; ; ) {
			Object inBuf = ((Object)0);
			size_t lookahead = (1 << 18);
			if (lookahead > inSize) {
				lookahead = (size_t)inSize;
			} 
			res = .UNRECOGNIZEDFUNCTIONNAME(inStream, inBuf, lookahead);
			if (res != 0) {
				break;
			} 
			{ 
				SizeT inProcessed = (SizeT)lookahead;
				SizeT dicPos = generatedDicPos;
				ELzmaStatus status = new ELzmaStatus();
				res = state.LzmaDec_DecodeToDic(outSize, (Byte)inBuf, inProcessed, .LZMA_FINISH_END, status);
				lookahead -= inProcessed;
				inSize -= inProcessed;
				if (res != 0) {
					break;
				} 
				if (status == .LZMA_STATUS_FINISHED_WITH_MARK) {
					if (outSize != generatedDicPos || inSize != 0) {
						res = 1;
					} 
					break;
				} 
				if (outSize == generatedDicPos && inSize == 0 && status == .LZMA_STATUS_MAYBE_FINISHED_WITHOUT_MARK) {
					break;
				} 
				if (inProcessed == 0 && dicPos == generatedDicPos) {
					res = 1;
					break;
				} 
				res = .UNRECOGNIZEDFUNCTIONNAME(inStream, inProcessed);
				if (res != 0) {
					break;
				} 
			}
		}
		state.LzmaDec_FreeProbs(allocMain);
		return res;
	}
	public Object SzDecodeLzma2(Object props, int propsSize, Object inSize, Object outBuffer, Object outSize, Object allocMain) {
		CLzma2Dec state = new CLzma2Dec();
		SRes res = 0;
		Object generatedDecoder = (state).getDecoder();
		{ 
			(generatedDecoder).setDic(((Object)0));
			(generatedDecoder).setProbs(((Object)0));
		}
		;
		if (propsSize != 1) {
			return 1;
		} 
		{ 
			int __result__ = (state.Lzma2Dec_AllocateProbs(props[0], allocMain));
			if (__result__ != 0) {
				return __result__;
			} 
		}
		;
		generatedDecoder.setDic(outBuffer);
		generatedDecoder.setDicBufSize(outSize);
		state.Lzma2Dec_Init();
		for (; ; ) {
			Object inBuf = ((Object)0);
			size_t lookahead = (1 << 18);
			if (lookahead > inSize) {
				lookahead = (size_t)inSize;
			} 
			res = .UNRECOGNIZEDFUNCTIONNAME(inStream, inBuf, lookahead);
			if (res != 0) {
				break;
			} 
			{ 
				SizeT inProcessed = (SizeT)lookahead;
				SizeT dicPos = generatedDecoder.getDicPos();
				ELzmaStatus status = new ELzmaStatus();
				res = state.Lzma2Dec_DecodeToDic(outSize, (Byte)inBuf, inProcessed, .LZMA_FINISH_END, status);
				lookahead -= inProcessed;
				inSize -= inProcessed;
				if (res != 0) {
					break;
				} 
				if (status == .LZMA_STATUS_FINISHED_WITH_MARK) {
					if (outSize != generatedDecoder.getDicPos() || inSize != 0) {
						res = 1;
					} 
					break;
				} 
				if (inProcessed == 0 && dicPos == generatedDecoder.getDicPos()) {
					res = 1;
					break;
				} 
				res = .UNRECOGNIZEDFUNCTIONNAME(inStream, inProcessed);
				if (res != 0) {
					break;
				} 
			}
		}
		generatedDecoder.LzmaDec_FreeProbs(allocMain);
		return res;
	}
	public Object SzDecodeCopy(Object inSize, Object outBuffer) {
		while (inSize > 0) {
			Object inBuf;
			size_t curSize = (1 << 18);
			if (curSize > inSize) {
				curSize = (size_t)inSize;
			} 
			{ 
				int __result__ = (.UNRECOGNIZEDFUNCTIONNAME(inStream, inBuf, curSize));
				if (__result__ != 0) {
					return __result__;
				} 
			}
			;
			if (curSize == 0) {
				return 6;
			} 
			.memcpy(outBuffer, inBuf, curSize);
			outBuffer += curSize;
			inSize -= curSize;
			{ 
				int __result__ = (.UNRECOGNIZEDFUNCTIONNAME(inStream, curSize));
				if (__result__ != 0) {
					return __result__;
				} 
			}
			;
		}
		return 0;
	}
	public Object SzFolder_Decode2(Object folder, Object propsData, Object unpackSizes, Object packPositions, Object startPos, Object outBuffer, Object outSize, Object allocMain, Object tempBuf) {
		UInt32 ci = new UInt32();
		SizeT[] tempSizes = new SizeT[]{0, 0, 0};
		SizeT tempSize3 = 0;
		Byte tempBuf3 = 0;
		{ 
			int __result__ = (ModernizedCProgram.CheckSupportedFolder(folder));
			if (__result__ != 0) {
				return __result__;
			} 
		}
		;
		Object generatedBufs = p.getBufs();
		Object generatedLims = p.getLims();
		Object generatedCode = (p).getCode();
		Object generatedDest = p.getDest();
		Object generatedDestLim = p.getDestLim();
		Object generatedState = p.getState();
		for (ci = 0; ci < folder.getNumCoders(); ci++) {
			CSzCoderInfo coder = folder.getCoders()[ci];
			if (ModernizedCProgram.IS_MAIN_METHOD((UInt32)coder.getMethodID())) {
				UInt32 si = 0;
				UInt64 offset = new UInt64();
				UInt64 inSize = new UInt64();
				Byte outBufCur = outBuffer;
				SizeT outSizeCur = outSize;
				if (folder.getNumCoders() == 4) {
					UInt32[] indices = new UInt32[]{3, 2, 0};
					UInt64 unpackSize = unpackSizes[ci];
					si = indices[ci];
					if (ci < 2) {
						Byte temp = new Byte();
						outSizeCur = (SizeT)unpackSize;
						if (outSizeCur != unpackSize) {
							return 2;
						} 
						temp = (Byte).UNRECOGNIZEDFUNCTIONNAME(allocMain, outSizeCur);
						if (!temp && outSizeCur != 0) {
							return 2;
						} 
						outBufCur = tempBuf[1 - ci] = temp;
						tempSizes[1 - ci] = outSizeCur;
					}  else if (ci == 2) {
						if (unpackSize > /* check it */outSize) {
							return 5;
						} 
						tempBuf3 = outBufCur = outBuffer + (outSize - (size_t)unpackSize);
						tempSize3 = outSizeCur = (SizeT)unpackSize;
					} else {
							return 4;
					} 
				} 
				offset = packPositions[si];
				inSize = packPositions[(size_t)si + 1] - offset;
				{ 
					int __result__ = (ModernizedCProgram.LookInStream_SeekTo(inStream, startPos + offset));
					if (__result__ != 0) {
						return __result__;
					} 
				}
				;
				if (coder.getMethodID() == 0) {
					if (inSize != /* check it */outSizeCur) {
						return 1;
					} 
					{ 
						int __result__ = (inStream.SzDecodeCopy(inSize, outBufCur));
						if (__result__ != 0) {
							return __result__;
						} 
					}
					;
				}  else if (coder.getMethodID() == -1024) {
					{ 
						int __result__ = (inStream.SzDecodeLzma(propsData + coder.getPropsOffset(), coder.getPropsSize(), inSize, outBufCur, outSizeCur, allocMain));
						if (__result__ != 0) {
							return __result__;
						} 
					}
					;
				}  else if (coder.getMethodID() == -1024) {
					{ 
						int __result__ = (inStream.SzDecodeLzma2(propsData + coder.getPropsOffset(), coder.getPropsSize(), inSize, outBufCur, outSizeCur, allocMain));
						if (__result__ != 0) {
							return __result__;
						} 
					}
					;
				} else {
						return 4;
				} 
			}  else if (coder.getMethodID() == -1024) {
				UInt64 offset = packPositions[1];
				UInt64 s3Size = packPositions[2] - offset;
				if (ci != 3) {
					return 4;
				} 
				tempSizes[2] = (SizeT)s3Size;
				if (tempSizes[2] != s3Size) {
					return 2;
				} 
				tempBuf[2] = (Byte).UNRECOGNIZEDFUNCTIONNAME(allocMain, tempSizes[2]);
				if (!tempBuf[2] && tempSizes[2] != 0) {
					return 2;
				} 
				{ 
					int __result__ = (ModernizedCProgram.LookInStream_SeekTo(inStream, startPos + offset));
					if (__result__ != 0) {
						return __result__;
					} 
				}
				;
				{ 
					int __result__ = (inStream.SzDecodeCopy(s3Size, tempBuf[2]));
					if (__result__ != 0) {
						return __result__;
					} 
				}
				;
				if ((tempSizes[0] & 3) != 0 || (tempSizes[1] & 3) != 0 || tempSize3 + tempSizes[0] + tempSizes[1] != outSize) {
					return 1;
				} 
				{ 
					CBcj2Dec p = new CBcj2Dec();
					generatedBufs[0] = tempBuf3;
					generatedLims[0] = tempBuf3 + tempSize3;
					generatedBufs[1] = tempBuf[0];
					generatedLims[1] = tempBuf[0] + tempSizes[0];
					generatedBufs[2] = tempBuf[1];
					generatedLims[2] = tempBuf[1] + tempSizes[1];
					generatedBufs[3] = tempBuf[2];
					generatedLims[3] = tempBuf[2] + tempSizes[2];
					p.setDest(outBuffer);
					p.setDestLim(outBuffer + outSize);
					p.Bcj2Dec_Init();
					{ 
						int __result__ = (p.Bcj2Dec_Decode());
						if (__result__ != 0) {
							return __result__;
						} 
					}
					;
					{ 
						int i;
						for (i = 0; i < 4; i++) {
							if (generatedBufs[i] != generatedLims[i]) {
								return 1;
							} 
						}
						if (!(generatedCode == 0)) {
							return 1;
						} 
						if (generatedDest != generatedDestLim || generatedState != .BCJ2_STREAM_MAIN) {
							return 1;
						} 
					}
				}
			}  else if (ci == 1) {
				if (coder.getMethodID() == 3) {
					if (coder.getPropsSize() != 1) {
						return 4;
					} 
					{ 
						Byte[] state = new Byte();
						ModernizedCProgram.Delta_Init(state);
						ModernizedCProgram.Delta_Decode(state, (int)(propsData[coder.getPropsOffset()]) + 1, outBuffer, outSize);
					}
				} else {
						if (coder.getPropsSize() != 0) {
							return 4;
						} 
						switch (coder.getMethodID()) {
						case -1024:
								ModernizedCProgram.ARMT_Convert(outBuffer, outSize, 0, 0);
								break;
						case -1024:
								{ 
									UInt32 state = new UInt32();
									{ 
										state = 0;
									}
									;
									ModernizedCProgram.x86_Convert(outBuffer, outSize, 0, state, 0);
									break;
								}
						case -1024:
								ModernizedCProgram.SPARC_Convert(outBuffer, outSize, 0, 0);
								break;
						case -1024:
								ModernizedCProgram.IA64_Convert(outBuffer, outSize, 0, 0);
								break;
						case -1024:
								ModernizedCProgram.ARM_Convert(outBuffer, outSize, 0, 0);
								break;
						case -1024:
								ModernizedCProgram.PPC_Convert(outBuffer, outSize, 0, 0);
								break;
						default:
								return 4;
						}
				} 
			} else {
					return 4;
			} 
		}
		return 0;
	}
	public Object SzAr_DecodeFolder(Object p, Object folderIndex, Object startPos, Object outBuffer, Object outSize, Object allocMain) {
		SRes res = new SRes();
		CSzFolder folder = new CSzFolder();
		CSzData sd = new CSzData();
		Byte data = p.getCodersData() + p.getFoCodersOffsets()[folderIndex];
		sd.setData(data);
		sd.setSize(p.getFoCodersOffsets()[(size_t)folderIndex + 1] - p.getFoCodersOffsets()[folderIndex]);
		res = folder.SzGetNextFolderItem(sd);
		if (res != 0) {
			return res;
		} 
		Object generatedSize = sd.getSize();
		Object generatedUnpackStream = folder.getUnpackStream();
		if (generatedSize != 0 || generatedUnpackStream != p.getFoToMainUnpackSizeIndex()[folderIndex] || outSize != ModernizedCProgram.SzAr_GetFolderUnpackSize(p, folderIndex)) {
			return 11;
		} 
		{ 
			int i;
			Byte[] tempBuf = new Byte[]{0, 0, 0};
			res = inStream.SzFolder_Decode2(folder, data, p.getCoderUnpackSizes()[p.getFoToCoderUnpackSizes()[folderIndex]], p.getPackPositions() + p.getFoStartPackStreamIndex()[folderIndex], startPos, outBuffer, (SizeT)outSize, allocMain, tempBuf);
			for (i = 0; i < 3; i++) {
				.UNRECOGNIZEDFUNCTIONNAME(allocMain, tempBuf[i]);
			}
			if (res == 0) {
				if (((p.getFolderCRCs()).getDefs() && ((p.getFolderCRCs()).getDefs()[(folderIndex) >> 3] & (-1024 >> ((folderIndex) & 7))) != 0)) {
					if (ModernizedCProgram.CrcCalc(outBuffer, outSize) != p.getFolderCRCs().getVals()[folderIndex]) {
						res = 3;
					} 
				} 
			} 
			return res;
		}
	}
	public Object SzArEx_Extract(Object p, Object fileIndex, Object blockIndex, Object tempBuf, Object outBufferSize, Object offset, Object outSizeProcessed, Object allocMain, Object allocTemp) {
		UInt32 folderIndex = p.getFileToFolder()[fileIndex];
		SRes res = 0;
		offset = 0;
		outSizeProcessed = 0;
		if (folderIndex == (UInt32)-1) {
			.UNRECOGNIZEDFUNCTIONNAME(allocMain, tempBuf);
			blockIndex = folderIndex;
			tempBuf = ((Object)0);
			outBufferSize = 0;
			return 0;
		} 
		if (tempBuf == ((Object)0) || blockIndex != folderIndex) {
			UInt64 unpackSizeSpec = ModernizedCProgram.SzAr_GetFolderUnpackSize(p.getDb(), folderIndex/*
			    UInt64 unpackSizeSpec =
			        p->UnpackPositions[p->FolderToFile[(size_t)folderIndex + 1]] -
			        p->UnpackPositions[p->FolderToFile[folderIndex]];
			    */);
			size_t unpackSize = (size_t)unpackSizeSpec;
			if (unpackSize != unpackSizeSpec) {
				return 2;
			} 
			blockIndex = folderIndex;
			.UNRECOGNIZEDFUNCTIONNAME(allocMain, tempBuf);
			tempBuf = ((Object)0);
			if (res == 0) {
				outBufferSize = unpackSize;
				if (unpackSize != 0) {
					tempBuf = (Byte).UNRECOGNIZEDFUNCTIONNAME(allocMain, unpackSize);
					if (tempBuf == ((Object)0)) {
						res = 2;
					} 
				} 
				if (res == 0) {
					res = inStream.SzAr_DecodeFolder(p.getDb(), folderIndex, p.getDataPos(), tempBuf, unpackSize, allocTemp);
				} 
			} 
		} 
		if (res == 0) {
			UInt64 unpackPos = p.getUnpackPositions()[fileIndex];
			offset = (size_t)(unpackPos - p.getUnpackPositions()[p.getFolderToFile()[folderIndex]]);
			outSizeProcessed = (size_t)(p.getUnpackPositions()[(size_t)fileIndex + 1] - unpackPos);
			if (offset + outSizeProcessed > outBufferSize) {
				return 11;
			} 
			if (((p.getCRCs()).getDefs() && ((p.getCRCs()).getDefs()[(fileIndex) >> 3] & (-1024 >> ((fileIndex) & 7))) != 0)) {
				if (ModernizedCProgram.CrcCalc(tempBuf + offset, outSizeProcessed) != p.getCRCs().getVals()[fileIndex]) {
					res = 3;
				} 
			} 
		} 
		return res;
	}
	public Object getLook() {
		return Look;
	}
	public void setLook(Object newLook) {
		Look = newLook;
	}
	public Object getSkip() {
		return Skip;
	}
	public void setSkip(Object newSkip) {
		Skip = newSkip;
	}
	public Object getRead() {
		return Read;
	}
	public void setRead(Object newRead) {
		Read = newRead;
	}
	public Object getSeek() {
		return Seek;
	}
	public void setSeek(Object newSeek) {
		Seek = newSeek;
	}
}
