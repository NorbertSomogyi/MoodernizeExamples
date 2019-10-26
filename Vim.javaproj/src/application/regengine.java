package application;

/* vi:set ts=8 sts=4 sw=4 noet:
 *
 * NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE
 *
 * This is NOT the original regular expression code as written by Henry
 * Spencer.  This code has been modified specifically for use with Vim, and
 * should not be used apart from compiling Vim.  If you want a good regular
 * expression library, get the original code.
 *
 * NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE
 */
/*
 * The number of sub-matches is limited to 10.
 * The first one (index 0) is the whole match, referenced with "\0".
 * The second one (index 1) is the first sub-match, referenced with "\1".
 * This goes up to the tenth (index 9), referenced with "\9".
 */
/*
 * In the NFA engine: how many braces are allowed.
 * TODO(RE): Use dynamic memory allocation instead of static, like here
 */
/*
 * In the NFA engine: how many states are allowed
 */
/* Which regexp engine to use? Needed for vim_regcomp().
 * Must match with 'regexpengine'. */
public class regengine {
	private Object regcomp;
	private Object regfree;
	private Object regexec_nl;
	private Object regexec_multi;
	private Object expr;
	
	public regengine(Object regcomp, Object regfree, Object regexec_nl, Object regexec_multi, Object expr) {
		setRegcomp(regcomp);
		setRegfree(regfree);
		setRegexec_nl(regexec_nl);
		setRegexec_multi(regexec_multi);
		setExpr(expr);
	}
	public regengine() {
	}
	
	public Object getRegcomp() {
		return regcomp;
	}
	public void setRegcomp(Object newRegcomp) {
		regcomp = newRegcomp;
	}
	public Object getRegfree() {
		return regfree;
	}
	public void setRegfree(Object newRegfree) {
		regfree = newRegfree;
	}
	public Object getRegexec_nl() {
		return regexec_nl;
	}
	public void setRegexec_nl(Object newRegexec_nl) {
		regexec_nl = newRegexec_nl;
	}
	public Object getRegexec_multi() {
		return regexec_multi;
	}
	public void setRegexec_multi(Object newRegexec_multi) {
		regexec_multi = newRegexec_multi;
	}
	public Object getExpr() {
		return expr;
	}
	public void setExpr(Object newExpr) {
		expr = newExpr;
	}
}
/*
 * Structure returned by vim_regcomp() to pass on to vim_regexec().
 * This is the general structure. For the actual matcher, two specific
 * structures are used. See code below.
 */
