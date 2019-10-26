package application;

// From http://msdn.microsoft.com/en-us/library/windows/hardware/ff559006.aspx
// Packed as the size must be 512 bytes exactly
public class _IDENTIFY_DEVICE_DATA {
	private  GeneralConfiguration;
	private Object NumCylinders;
	private Object ReservedWord2;
	private Object NumHeads;
	private Object Retired1;
	private Object NumSectorsPerTrack;
	private Object VendorUnique1;
	private Object SerialNumber;
	private Object Retired2;
	private Object Obsolete1;
	private Object FirmwareRevision;
	private Object ModelNumber;
	private Object MaximumBlockTransfer;
	private Object VendorUnique2;
	private Object ReservedWord48;
	private  Capabilities;
	private Object ObsoleteWords51;
	private Object TranslationFieldsValid;
	private Object Reserved3;
	private Object NumberOfCurrentCylinders;
	private Object NumberOfCurrentHeads;
	private Object CurrentSectorsPerTrack;
	private Object CurrentSectorCapacity;
	private Object CurrentMultiSectorSetting;
	private Object MultiSectorSettingValid;
	private Object ReservedByte59;
	private Object UserAddressableSectors;
	private Object ObsoleteWord62;
	private Object MultiWordDMASupport;
	private Object MultiWordDMAActive;
	private Object AdvancedPIOModes;
	private Object ReservedByte64;
	private Object MinimumMWXferCycleTime;
	private Object RecommendedMWXferCycleTime;
	private Object MinimumPIOCycleTime;
	private Object MinimumPIOCycleTimeIORDY;
	private Object ReservedWords69;
	private Object QueueDepth;
	private Object ReservedWord75;
	private Object ReservedWords76;
	private Object MajorRevision;
	private Object MinorRevision;
	private  CommandSetSupport;
	private  CommandSetActive;
	private Object UltraDMASupport;
	private Object UltraDMAActive;
	private Object ReservedWord89;
	private Object HardwareResetResult;
	private Object CurrentAcousticValue;
	private Object RecommendedAcousticValue;
	private Object ReservedWord95;
	private Object Max48BitLBA;
	private Object StreamingTransferTime;
	private Object ReservedWord105;
	private  PhysicalLogicalSectorSize;
	private Object InterSeekDelay;
	private Object WorldWideName;
	private Object ReservedForWorldWideName128;
	private Object ReservedForTlcTechnicalReport;
	private Object WordsPerLogicalSector;
	private  CommandSetSupportExt;
	private  CommandSetActiveExt;
	private Object ReservedForExpandedSupportandActive;
	private Object MsnSupport;
	private Object ReservedWord1274;
	private  SecurityStatus;
	private Object ReservedWord129;
	private  CfaPowerModel;
	private Object ReservedForCfaWord161;
	private  DataSetManagementFeature;
	private Object ReservedForCfaWord170;
	private Object CurrentMediaSerialNumber;
	private Object ReservedWord206;
	private Object ReservedWord207;
	private  BlockAlignment;
	private Object WriteReadVerifySectorCountMode3Only;
	private Object WriteReadVerifySectorCountMode2Only;
	private  NVCacheCapabilities;
	private Object NVCacheSizeLSW;
	private Object NVCacheSizeMSW;
	private Object NominalMediaRotationRate;
	private Object ReservedWord218;
	private  NVCacheOptions;
	private Object ReservedWord220;
	private Object Signature;
	private Object CheckSum;
	
	public _IDENTIFY_DEVICE_DATA( GeneralConfiguration, Object NumCylinders, Object ReservedWord2, Object NumHeads, Object Retired1, Object NumSectorsPerTrack, Object VendorUnique1, Object SerialNumber, Object Retired2, Object Obsolete1, Object FirmwareRevision, Object ModelNumber, Object MaximumBlockTransfer, Object VendorUnique2, Object ReservedWord48,  Capabilities, Object ObsoleteWords51, Object TranslationFieldsValid, Object Reserved3, Object NumberOfCurrentCylinders, Object NumberOfCurrentHeads, Object CurrentSectorsPerTrack, Object CurrentSectorCapacity, Object CurrentMultiSectorSetting, Object MultiSectorSettingValid, Object ReservedByte59, Object UserAddressableSectors, Object ObsoleteWord62, Object MultiWordDMASupport, Object MultiWordDMAActive, Object AdvancedPIOModes, Object ReservedByte64, Object MinimumMWXferCycleTime, Object RecommendedMWXferCycleTime, Object MinimumPIOCycleTime, Object MinimumPIOCycleTimeIORDY, Object ReservedWords69, Object QueueDepth, Object ReservedWord75, Object ReservedWords76, Object MajorRevision, Object MinorRevision,  CommandSetSupport,  CommandSetActive, Object UltraDMASupport, Object UltraDMAActive, Object ReservedWord89, Object HardwareResetResult, Object CurrentAcousticValue, Object RecommendedAcousticValue, Object ReservedWord95, Object Max48BitLBA, Object StreamingTransferTime, Object ReservedWord105,  PhysicalLogicalSectorSize, Object InterSeekDelay, Object WorldWideName, Object ReservedForWorldWideName128, Object ReservedForTlcTechnicalReport, Object WordsPerLogicalSector,  CommandSetSupportExt,  CommandSetActiveExt, Object ReservedForExpandedSupportandActive, Object MsnSupport, Object ReservedWord1274,  SecurityStatus, Object ReservedWord129,  CfaPowerModel, Object ReservedForCfaWord161,  DataSetManagementFeature, Object ReservedForCfaWord170, Object CurrentMediaSerialNumber, Object ReservedWord206, Object ReservedWord207,  BlockAlignment, Object WriteReadVerifySectorCountMode3Only, Object WriteReadVerifySectorCountMode2Only,  NVCacheCapabilities, Object NVCacheSizeLSW, Object NVCacheSizeMSW, Object NominalMediaRotationRate, Object ReservedWord218,  NVCacheOptions, Object ReservedWord220, Object Signature, Object CheckSum) {
		setGeneralConfiguration(GeneralConfiguration);
		setNumCylinders(NumCylinders);
		setReservedWord2(ReservedWord2);
		setNumHeads(NumHeads);
		setRetired1(Retired1);
		setNumSectorsPerTrack(NumSectorsPerTrack);
		setVendorUnique1(VendorUnique1);
		setSerialNumber(SerialNumber);
		setRetired2(Retired2);
		setObsolete1(Obsolete1);
		setFirmwareRevision(FirmwareRevision);
		setModelNumber(ModelNumber);
		setMaximumBlockTransfer(MaximumBlockTransfer);
		setVendorUnique2(VendorUnique2);
		setReservedWord48(ReservedWord48);
		setCapabilities(Capabilities);
		setObsoleteWords51(ObsoleteWords51);
		setTranslationFieldsValid(TranslationFieldsValid);
		setReserved3(Reserved3);
		setNumberOfCurrentCylinders(NumberOfCurrentCylinders);
		setNumberOfCurrentHeads(NumberOfCurrentHeads);
		setCurrentSectorsPerTrack(CurrentSectorsPerTrack);
		setCurrentSectorCapacity(CurrentSectorCapacity);
		setCurrentMultiSectorSetting(CurrentMultiSectorSetting);
		setMultiSectorSettingValid(MultiSectorSettingValid);
		setReservedByte59(ReservedByte59);
		setUserAddressableSectors(UserAddressableSectors);
		setObsoleteWord62(ObsoleteWord62);
		setMultiWordDMASupport(MultiWordDMASupport);
		setMultiWordDMAActive(MultiWordDMAActive);
		setAdvancedPIOModes(AdvancedPIOModes);
		setReservedByte64(ReservedByte64);
		setMinimumMWXferCycleTime(MinimumMWXferCycleTime);
		setRecommendedMWXferCycleTime(RecommendedMWXferCycleTime);
		setMinimumPIOCycleTime(MinimumPIOCycleTime);
		setMinimumPIOCycleTimeIORDY(MinimumPIOCycleTimeIORDY);
		setReservedWords69(ReservedWords69);
		setQueueDepth(QueueDepth);
		setReservedWord75(ReservedWord75);
		setReservedWords76(ReservedWords76);
		setMajorRevision(MajorRevision);
		setMinorRevision(MinorRevision);
		setCommandSetSupport(CommandSetSupport);
		setCommandSetActive(CommandSetActive);
		setUltraDMASupport(UltraDMASupport);
		setUltraDMAActive(UltraDMAActive);
		setReservedWord89(ReservedWord89);
		setHardwareResetResult(HardwareResetResult);
		setCurrentAcousticValue(CurrentAcousticValue);
		setRecommendedAcousticValue(RecommendedAcousticValue);
		setReservedWord95(ReservedWord95);
		setMax48BitLBA(Max48BitLBA);
		setStreamingTransferTime(StreamingTransferTime);
		setReservedWord105(ReservedWord105);
		setPhysicalLogicalSectorSize(PhysicalLogicalSectorSize);
		setInterSeekDelay(InterSeekDelay);
		setWorldWideName(WorldWideName);
		setReservedForWorldWideName128(ReservedForWorldWideName128);
		setReservedForTlcTechnicalReport(ReservedForTlcTechnicalReport);
		setWordsPerLogicalSector(WordsPerLogicalSector);
		setCommandSetSupportExt(CommandSetSupportExt);
		setCommandSetActiveExt(CommandSetActiveExt);
		setReservedForExpandedSupportandActive(ReservedForExpandedSupportandActive);
		setMsnSupport(MsnSupport);
		setReservedWord1274(ReservedWord1274);
		setSecurityStatus(SecurityStatus);
		setReservedWord129(ReservedWord129);
		setCfaPowerModel(CfaPowerModel);
		setReservedForCfaWord161(ReservedForCfaWord161);
		setDataSetManagementFeature(DataSetManagementFeature);
		setReservedForCfaWord170(ReservedForCfaWord170);
		setCurrentMediaSerialNumber(CurrentMediaSerialNumber);
		setReservedWord206(ReservedWord206);
		setReservedWord207(ReservedWord207);
		setBlockAlignment(BlockAlignment);
		setWriteReadVerifySectorCountMode3Only(WriteReadVerifySectorCountMode3Only);
		setWriteReadVerifySectorCountMode2Only(WriteReadVerifySectorCountMode2Only);
		setNVCacheCapabilities(NVCacheCapabilities);
		setNVCacheSizeLSW(NVCacheSizeLSW);
		setNVCacheSizeMSW(NVCacheSizeMSW);
		setNominalMediaRotationRate(NominalMediaRotationRate);
		setReservedWord218(ReservedWord218);
		setNVCacheOptions(NVCacheOptions);
		setReservedWord220(ReservedWord220);
		setSignature(Signature);
		setCheckSum(CheckSum);
	}
	public _IDENTIFY_DEVICE_DATA() {
	}
	
	public  getGeneralConfiguration() {
		return GeneralConfiguration;
	}
	public void setGeneralConfiguration( newGeneralConfiguration) {
		GeneralConfiguration = newGeneralConfiguration;
	}
	public Object getNumCylinders() {
		return NumCylinders;
	}
	public void setNumCylinders(Object newNumCylinders) {
		NumCylinders = newNumCylinders;
	}
	public Object getReservedWord2() {
		return ReservedWord2;
	}
	public void setReservedWord2(Object newReservedWord2) {
		ReservedWord2 = newReservedWord2;
	}
	public Object getNumHeads() {
		return NumHeads;
	}
	public void setNumHeads(Object newNumHeads) {
		NumHeads = newNumHeads;
	}
	public Object getRetired1() {
		return Retired1;
	}
	public void setRetired1(Object newRetired1) {
		Retired1 = newRetired1;
	}
	public Object getNumSectorsPerTrack() {
		return NumSectorsPerTrack;
	}
	public void setNumSectorsPerTrack(Object newNumSectorsPerTrack) {
		NumSectorsPerTrack = newNumSectorsPerTrack;
	}
	public Object getVendorUnique1() {
		return VendorUnique1;
	}
	public void setVendorUnique1(Object newVendorUnique1) {
		VendorUnique1 = newVendorUnique1;
	}
	public Object getSerialNumber() {
		return SerialNumber;
	}
	public void setSerialNumber(Object newSerialNumber) {
		SerialNumber = newSerialNumber;
	}
	public Object getRetired2() {
		return Retired2;
	}
	public void setRetired2(Object newRetired2) {
		Retired2 = newRetired2;
	}
	public Object getObsolete1() {
		return Obsolete1;
	}
	public void setObsolete1(Object newObsolete1) {
		Obsolete1 = newObsolete1;
	}
	public Object getFirmwareRevision() {
		return FirmwareRevision;
	}
	public void setFirmwareRevision(Object newFirmwareRevision) {
		FirmwareRevision = newFirmwareRevision;
	}
	public Object getModelNumber() {
		return ModelNumber;
	}
	public void setModelNumber(Object newModelNumber) {
		ModelNumber = newModelNumber;
	}
	public Object getMaximumBlockTransfer() {
		return MaximumBlockTransfer;
	}
	public void setMaximumBlockTransfer(Object newMaximumBlockTransfer) {
		MaximumBlockTransfer = newMaximumBlockTransfer;
	}
	public Object getVendorUnique2() {
		return VendorUnique2;
	}
	public void setVendorUnique2(Object newVendorUnique2) {
		VendorUnique2 = newVendorUnique2;
	}
	public Object getReservedWord48() {
		return ReservedWord48;
	}
	public void setReservedWord48(Object newReservedWord48) {
		ReservedWord48 = newReservedWord48;
	}
	public  getCapabilities() {
		return Capabilities;
	}
	public void setCapabilities( newCapabilities) {
		Capabilities = newCapabilities;
	}
	public Object getObsoleteWords51() {
		return ObsoleteWords51;
	}
	public void setObsoleteWords51(Object newObsoleteWords51) {
		ObsoleteWords51 = newObsoleteWords51;
	}
	public Object getTranslationFieldsValid() {
		return TranslationFieldsValid;
	}
	public void setTranslationFieldsValid(Object newTranslationFieldsValid) {
		TranslationFieldsValid = newTranslationFieldsValid;
	}
	public Object getReserved3() {
		return Reserved3;
	}
	public void setReserved3(Object newReserved3) {
		Reserved3 = newReserved3;
	}
	public Object getNumberOfCurrentCylinders() {
		return NumberOfCurrentCylinders;
	}
	public void setNumberOfCurrentCylinders(Object newNumberOfCurrentCylinders) {
		NumberOfCurrentCylinders = newNumberOfCurrentCylinders;
	}
	public Object getNumberOfCurrentHeads() {
		return NumberOfCurrentHeads;
	}
	public void setNumberOfCurrentHeads(Object newNumberOfCurrentHeads) {
		NumberOfCurrentHeads = newNumberOfCurrentHeads;
	}
	public Object getCurrentSectorsPerTrack() {
		return CurrentSectorsPerTrack;
	}
	public void setCurrentSectorsPerTrack(Object newCurrentSectorsPerTrack) {
		CurrentSectorsPerTrack = newCurrentSectorsPerTrack;
	}
	public Object getCurrentSectorCapacity() {
		return CurrentSectorCapacity;
	}
	public void setCurrentSectorCapacity(Object newCurrentSectorCapacity) {
		CurrentSectorCapacity = newCurrentSectorCapacity;
	}
	public Object getCurrentMultiSectorSetting() {
		return CurrentMultiSectorSetting;
	}
	public void setCurrentMultiSectorSetting(Object newCurrentMultiSectorSetting) {
		CurrentMultiSectorSetting = newCurrentMultiSectorSetting;
	}
	public Object getMultiSectorSettingValid() {
		return MultiSectorSettingValid;
	}
	public void setMultiSectorSettingValid(Object newMultiSectorSettingValid) {
		MultiSectorSettingValid = newMultiSectorSettingValid;
	}
	public Object getReservedByte59() {
		return ReservedByte59;
	}
	public void setReservedByte59(Object newReservedByte59) {
		ReservedByte59 = newReservedByte59;
	}
	public Object getUserAddressableSectors() {
		return UserAddressableSectors;
	}
	public void setUserAddressableSectors(Object newUserAddressableSectors) {
		UserAddressableSectors = newUserAddressableSectors;
	}
	public Object getObsoleteWord62() {
		return ObsoleteWord62;
	}
	public void setObsoleteWord62(Object newObsoleteWord62) {
		ObsoleteWord62 = newObsoleteWord62;
	}
	public Object getMultiWordDMASupport() {
		return MultiWordDMASupport;
	}
	public void setMultiWordDMASupport(Object newMultiWordDMASupport) {
		MultiWordDMASupport = newMultiWordDMASupport;
	}
	public Object getMultiWordDMAActive() {
		return MultiWordDMAActive;
	}
	public void setMultiWordDMAActive(Object newMultiWordDMAActive) {
		MultiWordDMAActive = newMultiWordDMAActive;
	}
	public Object getAdvancedPIOModes() {
		return AdvancedPIOModes;
	}
	public void setAdvancedPIOModes(Object newAdvancedPIOModes) {
		AdvancedPIOModes = newAdvancedPIOModes;
	}
	public Object getReservedByte64() {
		return ReservedByte64;
	}
	public void setReservedByte64(Object newReservedByte64) {
		ReservedByte64 = newReservedByte64;
	}
	public Object getMinimumMWXferCycleTime() {
		return MinimumMWXferCycleTime;
	}
	public void setMinimumMWXferCycleTime(Object newMinimumMWXferCycleTime) {
		MinimumMWXferCycleTime = newMinimumMWXferCycleTime;
	}
	public Object getRecommendedMWXferCycleTime() {
		return RecommendedMWXferCycleTime;
	}
	public void setRecommendedMWXferCycleTime(Object newRecommendedMWXferCycleTime) {
		RecommendedMWXferCycleTime = newRecommendedMWXferCycleTime;
	}
	public Object getMinimumPIOCycleTime() {
		return MinimumPIOCycleTime;
	}
	public void setMinimumPIOCycleTime(Object newMinimumPIOCycleTime) {
		MinimumPIOCycleTime = newMinimumPIOCycleTime;
	}
	public Object getMinimumPIOCycleTimeIORDY() {
		return MinimumPIOCycleTimeIORDY;
	}
	public void setMinimumPIOCycleTimeIORDY(Object newMinimumPIOCycleTimeIORDY) {
		MinimumPIOCycleTimeIORDY = newMinimumPIOCycleTimeIORDY;
	}
	public Object getReservedWords69() {
		return ReservedWords69;
	}
	public void setReservedWords69(Object newReservedWords69) {
		ReservedWords69 = newReservedWords69;
	}
	public Object getQueueDepth() {
		return QueueDepth;
	}
	public void setQueueDepth(Object newQueueDepth) {
		QueueDepth = newQueueDepth;
	}
	public Object getReservedWord75() {
		return ReservedWord75;
	}
	public void setReservedWord75(Object newReservedWord75) {
		ReservedWord75 = newReservedWord75;
	}
	public Object getReservedWords76() {
		return ReservedWords76;
	}
	public void setReservedWords76(Object newReservedWords76) {
		ReservedWords76 = newReservedWords76;
	}
	public Object getMajorRevision() {
		return MajorRevision;
	}
	public void setMajorRevision(Object newMajorRevision) {
		MajorRevision = newMajorRevision;
	}
	public Object getMinorRevision() {
		return MinorRevision;
	}
	public void setMinorRevision(Object newMinorRevision) {
		MinorRevision = newMinorRevision;
	}
	public  getCommandSetSupport() {
		return CommandSetSupport;
	}
	public void setCommandSetSupport( newCommandSetSupport) {
		CommandSetSupport = newCommandSetSupport;
	}
	public  getCommandSetActive() {
		return CommandSetActive;
	}
	public void setCommandSetActive( newCommandSetActive) {
		CommandSetActive = newCommandSetActive;
	}
	public Object getUltraDMASupport() {
		return UltraDMASupport;
	}
	public void setUltraDMASupport(Object newUltraDMASupport) {
		UltraDMASupport = newUltraDMASupport;
	}
	public Object getUltraDMAActive() {
		return UltraDMAActive;
	}
	public void setUltraDMAActive(Object newUltraDMAActive) {
		UltraDMAActive = newUltraDMAActive;
	}
	public Object getReservedWord89() {
		return ReservedWord89;
	}
	public void setReservedWord89(Object newReservedWord89) {
		ReservedWord89 = newReservedWord89;
	}
	public Object getHardwareResetResult() {
		return HardwareResetResult;
	}
	public void setHardwareResetResult(Object newHardwareResetResult) {
		HardwareResetResult = newHardwareResetResult;
	}
	public Object getCurrentAcousticValue() {
		return CurrentAcousticValue;
	}
	public void setCurrentAcousticValue(Object newCurrentAcousticValue) {
		CurrentAcousticValue = newCurrentAcousticValue;
	}
	public Object getRecommendedAcousticValue() {
		return RecommendedAcousticValue;
	}
	public void setRecommendedAcousticValue(Object newRecommendedAcousticValue) {
		RecommendedAcousticValue = newRecommendedAcousticValue;
	}
	public Object getReservedWord95() {
		return ReservedWord95;
	}
	public void setReservedWord95(Object newReservedWord95) {
		ReservedWord95 = newReservedWord95;
	}
	public Object getMax48BitLBA() {
		return Max48BitLBA;
	}
	public void setMax48BitLBA(Object newMax48BitLBA) {
		Max48BitLBA = newMax48BitLBA;
	}
	public Object getStreamingTransferTime() {
		return StreamingTransferTime;
	}
	public void setStreamingTransferTime(Object newStreamingTransferTime) {
		StreamingTransferTime = newStreamingTransferTime;
	}
	public Object getReservedWord105() {
		return ReservedWord105;
	}
	public void setReservedWord105(Object newReservedWord105) {
		ReservedWord105 = newReservedWord105;
	}
	public  getPhysicalLogicalSectorSize() {
		return PhysicalLogicalSectorSize;
	}
	public void setPhysicalLogicalSectorSize( newPhysicalLogicalSectorSize) {
		PhysicalLogicalSectorSize = newPhysicalLogicalSectorSize;
	}
	public Object getInterSeekDelay() {
		return InterSeekDelay;
	}
	public void setInterSeekDelay(Object newInterSeekDelay) {
		InterSeekDelay = newInterSeekDelay;
	}
	public Object getWorldWideName() {
		return WorldWideName;
	}
	public void setWorldWideName(Object newWorldWideName) {
		WorldWideName = newWorldWideName;
	}
	public Object getReservedForWorldWideName128() {
		return ReservedForWorldWideName128;
	}
	public void setReservedForWorldWideName128(Object newReservedForWorldWideName128) {
		ReservedForWorldWideName128 = newReservedForWorldWideName128;
	}
	public Object getReservedForTlcTechnicalReport() {
		return ReservedForTlcTechnicalReport;
	}
	public void setReservedForTlcTechnicalReport(Object newReservedForTlcTechnicalReport) {
		ReservedForTlcTechnicalReport = newReservedForTlcTechnicalReport;
	}
	public Object getWordsPerLogicalSector() {
		return WordsPerLogicalSector;
	}
	public void setWordsPerLogicalSector(Object newWordsPerLogicalSector) {
		WordsPerLogicalSector = newWordsPerLogicalSector;
	}
	public  getCommandSetSupportExt() {
		return CommandSetSupportExt;
	}
	public void setCommandSetSupportExt( newCommandSetSupportExt) {
		CommandSetSupportExt = newCommandSetSupportExt;
	}
	public  getCommandSetActiveExt() {
		return CommandSetActiveExt;
	}
	public void setCommandSetActiveExt( newCommandSetActiveExt) {
		CommandSetActiveExt = newCommandSetActiveExt;
	}
	public Object getReservedForExpandedSupportandActive() {
		return ReservedForExpandedSupportandActive;
	}
	public void setReservedForExpandedSupportandActive(Object newReservedForExpandedSupportandActive) {
		ReservedForExpandedSupportandActive = newReservedForExpandedSupportandActive;
	}
	public Object getMsnSupport() {
		return MsnSupport;
	}
	public void setMsnSupport(Object newMsnSupport) {
		MsnSupport = newMsnSupport;
	}
	public Object getReservedWord1274() {
		return ReservedWord1274;
	}
	public void setReservedWord1274(Object newReservedWord1274) {
		ReservedWord1274 = newReservedWord1274;
	}
	public  getSecurityStatus() {
		return SecurityStatus;
	}
	public void setSecurityStatus( newSecurityStatus) {
		SecurityStatus = newSecurityStatus;
	}
	public Object getReservedWord129() {
		return ReservedWord129;
	}
	public void setReservedWord129(Object newReservedWord129) {
		ReservedWord129 = newReservedWord129;
	}
	public  getCfaPowerModel() {
		return CfaPowerModel;
	}
	public void setCfaPowerModel( newCfaPowerModel) {
		CfaPowerModel = newCfaPowerModel;
	}
	public Object getReservedForCfaWord161() {
		return ReservedForCfaWord161;
	}
	public void setReservedForCfaWord161(Object newReservedForCfaWord161) {
		ReservedForCfaWord161 = newReservedForCfaWord161;
	}
	public  getDataSetManagementFeature() {
		return DataSetManagementFeature;
	}
	public void setDataSetManagementFeature( newDataSetManagementFeature) {
		DataSetManagementFeature = newDataSetManagementFeature;
	}
	public Object getReservedForCfaWord170() {
		return ReservedForCfaWord170;
	}
	public void setReservedForCfaWord170(Object newReservedForCfaWord170) {
		ReservedForCfaWord170 = newReservedForCfaWord170;
	}
	public Object getCurrentMediaSerialNumber() {
		return CurrentMediaSerialNumber;
	}
	public void setCurrentMediaSerialNumber(Object newCurrentMediaSerialNumber) {
		CurrentMediaSerialNumber = newCurrentMediaSerialNumber;
	}
	public Object getReservedWord206() {
		return ReservedWord206;
	}
	public void setReservedWord206(Object newReservedWord206) {
		ReservedWord206 = newReservedWord206;
	}
	public Object getReservedWord207() {
		return ReservedWord207;
	}
	public void setReservedWord207(Object newReservedWord207) {
		ReservedWord207 = newReservedWord207;
	}
	public  getBlockAlignment() {
		return BlockAlignment;
	}
	public void setBlockAlignment( newBlockAlignment) {
		BlockAlignment = newBlockAlignment;
	}
	public Object getWriteReadVerifySectorCountMode3Only() {
		return WriteReadVerifySectorCountMode3Only;
	}
	public void setWriteReadVerifySectorCountMode3Only(Object newWriteReadVerifySectorCountMode3Only) {
		WriteReadVerifySectorCountMode3Only = newWriteReadVerifySectorCountMode3Only;
	}
	public Object getWriteReadVerifySectorCountMode2Only() {
		return WriteReadVerifySectorCountMode2Only;
	}
	public void setWriteReadVerifySectorCountMode2Only(Object newWriteReadVerifySectorCountMode2Only) {
		WriteReadVerifySectorCountMode2Only = newWriteReadVerifySectorCountMode2Only;
	}
	public  getNVCacheCapabilities() {
		return NVCacheCapabilities;
	}
	public void setNVCacheCapabilities( newNVCacheCapabilities) {
		NVCacheCapabilities = newNVCacheCapabilities;
	}
	public Object getNVCacheSizeLSW() {
		return NVCacheSizeLSW;
	}
	public void setNVCacheSizeLSW(Object newNVCacheSizeLSW) {
		NVCacheSizeLSW = newNVCacheSizeLSW;
	}
	public Object getNVCacheSizeMSW() {
		return NVCacheSizeMSW;
	}
	public void setNVCacheSizeMSW(Object newNVCacheSizeMSW) {
		NVCacheSizeMSW = newNVCacheSizeMSW;
	}
	public Object getNominalMediaRotationRate() {
		return NominalMediaRotationRate;
	}
	public void setNominalMediaRotationRate(Object newNominalMediaRotationRate) {
		NominalMediaRotationRate = newNominalMediaRotationRate;
	}
	public Object getReservedWord218() {
		return ReservedWord218;
	}
	public void setReservedWord218(Object newReservedWord218) {
		ReservedWord218 = newReservedWord218;
	}
	public  getNVCacheOptions() {
		return NVCacheOptions;
	}
	public void setNVCacheOptions( newNVCacheOptions) {
		NVCacheOptions = newNVCacheOptions;
	}
	public Object getReservedWord220() {
		return ReservedWord220;
	}
	public void setReservedWord220(Object newReservedWord220) {
		ReservedWord220 = newReservedWord220;
	}
	public Object getSignature() {
		return Signature;
	}
	public void setSignature(Object newSignature) {
		Signature = newSignature;
	}
	public Object getCheckSum() {
		return CheckSum;
	}
	public void setCheckSum(Object newCheckSum) {
		CheckSum = newCheckSum;
	}
}
