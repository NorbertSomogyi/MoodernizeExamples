package application;

/*
 * structures used in undo.c
 */
// longword alignment and use filler byte
public class m_info {
	private Object m_size;
	private m_info m_next;
	
	public m_info(Object m_size, m_info m_next) {
		setM_size(m_size);
		setM_next(m_next);
	}
	public m_info() {
	}
	
	public Object getM_size() {
		return m_size;
	}
	public void setM_size(Object newM_size) {
		m_size = newM_size;
	}
	public m_info getM_next() {
		return m_next;
	}
	public void setM_next(m_info newM_next) {
		m_next = newM_next;
	}
}
/*
 * structure used to link chunks in one of the free chunk lists.
 */
