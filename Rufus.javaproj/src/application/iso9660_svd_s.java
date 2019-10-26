package application;

public class iso9660_svd_s {
	private Object type;
	private Object id;
	private Object version;
	private byte flags;
	private Object system_id;
	private Object volume_id;
	private Object unused2;
	private Object volume_space_size;
	private Object escape_sequences;
	private Object volume_set_size;
	private Object volume_sequence_number;
	private Object logical_block_size;
	private Object path_table_size;
	private Object type_l_path_table;
	private Object opt_type_l_path_table;
	private Object type_m_path_table;
	private Object opt_type_m_path_table;
	private iso9660_dir_s root_directory_record;
	private byte root_directory_filename;
	private Object volume_set_id;
	private Object publisher_id;
	private Object preparer_id;
	private Object application_id;
	private Object copyright_file_id;
	private Object abstract_file_id;
	private Object bibliographic_file_id;
	private iso9660_ltime_s creation_date;
	private iso9660_ltime_s modification_date;
	private iso9660_ltime_s expiration_date;
	private iso9660_ltime_s effective_date;
	private Object file_structure_version;
	private Object unused4;
	private Object application_data;
	private Object unused5;
	
	public iso9660_svd_s(Object type, Object id, Object version, byte flags, Object system_id, Object volume_id, Object unused2, Object volume_space_size, Object escape_sequences, Object volume_set_size, Object volume_sequence_number, Object logical_block_size, Object path_table_size, Object type_l_path_table, Object opt_type_l_path_table, Object type_m_path_table, Object opt_type_m_path_table, iso9660_dir_s root_directory_record, byte root_directory_filename, Object volume_set_id, Object publisher_id, Object preparer_id, Object application_id, Object copyright_file_id, Object abstract_file_id, Object bibliographic_file_id, iso9660_ltime_s creation_date, iso9660_ltime_s modification_date, iso9660_ltime_s expiration_date, iso9660_ltime_s effective_date, Object file_structure_version, Object unused4, Object application_data, Object unused5) {
		setType(type);
		setId(id);
		setVersion(version);
		setFlags(flags);
		setSystem_id(system_id);
		setVolume_id(volume_id);
		setUnused2(unused2);
		setVolume_space_size(volume_space_size);
		setEscape_sequences(escape_sequences);
		setVolume_set_size(volume_set_size);
		setVolume_sequence_number(volume_sequence_number);
		setLogical_block_size(logical_block_size);
		setPath_table_size(path_table_size);
		setType_l_path_table(type_l_path_table);
		setOpt_type_l_path_table(opt_type_l_path_table);
		setType_m_path_table(type_m_path_table);
		setOpt_type_m_path_table(opt_type_m_path_table);
		setRoot_directory_record(root_directory_record);
		setRoot_directory_filename(root_directory_filename);
		setVolume_set_id(volume_set_id);
		setPublisher_id(publisher_id);
		setPreparer_id(preparer_id);
		setApplication_id(application_id);
		setCopyright_file_id(copyright_file_id);
		setAbstract_file_id(abstract_file_id);
		setBibliographic_file_id(bibliographic_file_id);
		setCreation_date(creation_date);
		setModification_date(modification_date);
		setExpiration_date(expiration_date);
		setEffective_date(effective_date);
		setFile_structure_version(file_structure_version);
		setUnused4(unused4);
		setApplication_data(application_data);
		setUnused5(unused5);
	}
	public iso9660_svd_s() {
	}
	
	public Object getType() {
		return type;
	}
	public void setType(Object newType) {
		type = newType;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public byte getFlags() {
		return flags;
	}
	public void setFlags(byte newFlags) {
		flags = newFlags;
	}
	public Object getSystem_id() {
		return system_id;
	}
	public void setSystem_id(Object newSystem_id) {
		system_id = newSystem_id;
	}
	public Object getVolume_id() {
		return volume_id;
	}
	public void setVolume_id(Object newVolume_id) {
		volume_id = newVolume_id;
	}
	public Object getUnused2() {
		return unused2;
	}
	public void setUnused2(Object newUnused2) {
		unused2 = newUnused2;
	}
	public Object getVolume_space_size() {
		return volume_space_size;
	}
	public void setVolume_space_size(Object newVolume_space_size) {
		volume_space_size = newVolume_space_size;
	}
	public Object getEscape_sequences() {
		return escape_sequences;
	}
	public void setEscape_sequences(Object newEscape_sequences) {
		escape_sequences = newEscape_sequences;
	}
	public Object getVolume_set_size() {
		return volume_set_size;
	}
	public void setVolume_set_size(Object newVolume_set_size) {
		volume_set_size = newVolume_set_size;
	}
	public Object getVolume_sequence_number() {
		return volume_sequence_number;
	}
	public void setVolume_sequence_number(Object newVolume_sequence_number) {
		volume_sequence_number = newVolume_sequence_number;
	}
	public Object getLogical_block_size() {
		return logical_block_size;
	}
	public void setLogical_block_size(Object newLogical_block_size) {
		logical_block_size = newLogical_block_size;
	}
	public Object getPath_table_size() {
		return path_table_size;
	}
	public void setPath_table_size(Object newPath_table_size) {
		path_table_size = newPath_table_size;
	}
	public Object getType_l_path_table() {
		return type_l_path_table;
	}
	public void setType_l_path_table(Object newType_l_path_table) {
		type_l_path_table = newType_l_path_table;
	}
	public Object getOpt_type_l_path_table() {
		return opt_type_l_path_table;
	}
	public void setOpt_type_l_path_table(Object newOpt_type_l_path_table) {
		opt_type_l_path_table = newOpt_type_l_path_table;
	}
	public Object getType_m_path_table() {
		return type_m_path_table;
	}
	public void setType_m_path_table(Object newType_m_path_table) {
		type_m_path_table = newType_m_path_table;
	}
	public Object getOpt_type_m_path_table() {
		return opt_type_m_path_table;
	}
	public void setOpt_type_m_path_table(Object newOpt_type_m_path_table) {
		opt_type_m_path_table = newOpt_type_m_path_table;
	}
	public iso9660_dir_s getRoot_directory_record() {
		return root_directory_record;
	}
	public void setRoot_directory_record(iso9660_dir_s newRoot_directory_record) {
		root_directory_record = newRoot_directory_record;
	}
	public byte getRoot_directory_filename() {
		return root_directory_filename;
	}
	public void setRoot_directory_filename(byte newRoot_directory_filename) {
		root_directory_filename = newRoot_directory_filename;
	}
	public Object getVolume_set_id() {
		return volume_set_id;
	}
	public void setVolume_set_id(Object newVolume_set_id) {
		volume_set_id = newVolume_set_id;
	}
	public Object getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(Object newPublisher_id) {
		publisher_id = newPublisher_id;
	}
	public Object getPreparer_id() {
		return preparer_id;
	}
	public void setPreparer_id(Object newPreparer_id) {
		preparer_id = newPreparer_id;
	}
	public Object getApplication_id() {
		return application_id;
	}
	public void setApplication_id(Object newApplication_id) {
		application_id = newApplication_id;
	}
	public Object getCopyright_file_id() {
		return copyright_file_id;
	}
	public void setCopyright_file_id(Object newCopyright_file_id) {
		copyright_file_id = newCopyright_file_id;
	}
	public Object getAbstract_file_id() {
		return abstract_file_id;
	}
	public void setAbstract_file_id(Object newAbstract_file_id) {
		abstract_file_id = newAbstract_file_id;
	}
	public Object getBibliographic_file_id() {
		return bibliographic_file_id;
	}
	public void setBibliographic_file_id(Object newBibliographic_file_id) {
		bibliographic_file_id = newBibliographic_file_id;
	}
	public iso9660_ltime_s getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(iso9660_ltime_s newCreation_date) {
		creation_date = newCreation_date;
	}
	public iso9660_ltime_s getModification_date() {
		return modification_date;
	}
	public void setModification_date(iso9660_ltime_s newModification_date) {
		modification_date = newModification_date;
	}
	public iso9660_ltime_s getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(iso9660_ltime_s newExpiration_date) {
		expiration_date = newExpiration_date;
	}
	public iso9660_ltime_s getEffective_date() {
		return effective_date;
	}
	public void setEffective_date(iso9660_ltime_s newEffective_date) {
		effective_date = newEffective_date;
	}
	public Object getFile_structure_version() {
		return file_structure_version;
	}
	public void setFile_structure_version(Object newFile_structure_version) {
		file_structure_version = newFile_structure_version;
	}
	public Object getUnused4() {
		return unused4;
	}
	public void setUnused4(Object newUnused4) {
		unused4 = newUnused4;
	}
	public Object getApplication_data() {
		return application_data;
	}
	public void setApplication_data(Object newApplication_data) {
		application_data = newApplication_data;
	}
	public Object getUnused5() {
		return unused5;
	}
	public void setUnused5(Object newUnused5) {
		unused5 = newUnused5;
	}
}
/*! \brief A data type for a list of ISO9660
  statbuf file pointers returned from the various
  Cdio iso9660 readdir routines.
 */
/*! \brief A data type for a list of ISO9660
  statbuf drectory pointer returned from the variious
  Cdio iso9660 readdir routines.
 */
