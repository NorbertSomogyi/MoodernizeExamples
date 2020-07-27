package application;

public class __pthread_tls_key {
	private Object destructor;
	
	public __pthread_tls_key(Object destructor) {
		setDestructor(destructor);
	}
	public __pthread_tls_key() {
	}
	
	public Object getDestructor() {
		return destructor;
	}
	public void setDestructor(Object newDestructor) {
		destructor = newDestructor;
	}
}
