package application;

public class dictType {
	private Object[] hashFunction;
	private Object[] keyDup;
	private Object[] valDup;
	private Object[] keyCompare;
	private Object[] keyDestructor;
	private Object[] valDestructor;
	
	public dictType(Object[] hashFunction, Object[] keyDup, Object[] valDup, Object[] keyCompare, Object[] keyDestructor, Object[] valDestructor) {
		setHashFunction(hashFunction);
		setKeyDup(keyDup);
		setValDup(valDup);
		setKeyCompare(keyCompare);
		setKeyDestructor(keyDestructor);
		setValDestructor(valDestructor);
	}
	public dictType() {
	}
	
	public Object[] getHashFunction() {
		return hashFunction;
	}
	public void setHashFunction(Object[] newHashFunction) {
		hashFunction = newHashFunction;
	}
	public Object[] getKeyDup() {
		return keyDup;
	}
	public void setKeyDup(Object[] newKeyDup) {
		keyDup = newKeyDup;
	}
	public Object[] getValDup() {
		return valDup;
	}
	public void setValDup(Object[] newValDup) {
		valDup = newValDup;
	}
	public Object[] getKeyCompare() {
		return keyCompare;
	}
	public void setKeyCompare(Object[] newKeyCompare) {
		keyCompare = newKeyCompare;
	}
	public Object[] getKeyDestructor() {
		return keyDestructor;
	}
	public void setKeyDestructor(Object[] newKeyDestructor) {
		keyDestructor = newKeyDestructor;
	}
	public Object[] getValDestructor() {
		return valDestructor;
	}
	public void setValDestructor(Object[] newValDestructor) {
		valDestructor = newValDestructor;
	}
}
