package application;

/* nfa_pim_T stores a Postponed Invisible Match. */
public class nfa_pim_S {
	private int result;
	private Object state;
	private  subs;
	private  end;
	
	public nfa_pim_S(int result, Object state,  subs,  end) {
		setResult(result);
		setState(state);
		setSubs(subs);
		setEnd(end);
	}
	public nfa_pim_S() {
	}
	
	public void copy_pim(nfa_pim_S from) {
		int generatedResult = from.getResult();
		this.setResult(generatedResult);
		Object generatedState = from.getState();
		this.setState(generatedState);
		 generatedSubs = this.getSubs();
		Object generatedNorm = generatedSubs.getNorm();
		generatedNorm.copy_sub(generatedNorm);
		 generatedEnd = from.getEnd();
		this.setEnd(generatedEnd);
	}
	public int pim_equal(nfa_pim_S two) {
		int generatedResult = this.getResult();
		int one_unused = (one == NULL || generatedResult == 0);
		int two_unused = (two == NULL || generatedResult == 0);
		if (one_unused) {
			return /* one is unused: equal when two is also unused */two_unused;
		} 
		if (two_unused) {
			return /* one is used and two is not: not equal */FALSE;
		} 
		Object generatedState = this.getState();
		if (generatedState.getId() != generatedState.getId()) {
			return FALSE;
		} 
		 generatedEnd = this.getEnd();
		Object generatedPos = generatedEnd.getPos();
		if (/* compare the position */REG_MULTI) {
			return generatedPos.getLnum() == generatedPos.getLnum() && generatedPos.getCol() == generatedPos.getCol();
		} 
		Object generatedPtr = generatedEnd.getPtr();
		return generatedPtr == generatedPtr;
	}
	/*
	 * Copy postponed invisible match info from "from" to "to".
	 */
	public int getResult() {
		return result;
	}
	public void setResult(int newResult) {
		result = newResult;
	}
	public Object getState() {
		return state;
	}
	public void setState(Object newState) {
		state = newState;
	}
	public  getSubs() {
		return subs;
	}
	public void setSubs( newSubs) {
		subs = newSubs;
	}
	public  getEnd() {
		return end;
	}
	public void setEnd( newEnd) {
		end = newEnd;
	}
}
