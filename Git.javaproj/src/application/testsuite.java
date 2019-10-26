package application;

public class testsuite {
	private string_list tests;
	private string_list failed;
	private int next;
	private int quiet;
	private int immediate;
	private int verbose;
	private int verbose_log;
	private int trace;
	private int write_junit_xml;
	
	public testsuite(string_list tests, string_list failed, int next, int quiet, int immediate, int verbose, int verbose_log, int trace, int write_junit_xml) {
		setTests(tests);
		setFailed(failed);
		setNext(next);
		setQuiet(quiet);
		setImmediate(immediate);
		setVerbose(verbose);
		setVerbose_log(verbose_log);
		setTrace(trace);
		setWrite_junit_xml(write_junit_xml);
	}
	public testsuite() {
	}
	
	public string_list getTests() {
		return tests;
	}
	public void setTests(string_list newTests) {
		tests = newTests;
	}
	public string_list getFailed() {
		return failed;
	}
	public void setFailed(string_list newFailed) {
		failed = newFailed;
	}
	public int getNext() {
		return next;
	}
	public void setNext(int newNext) {
		next = newNext;
	}
	public int getQuiet() {
		return quiet;
	}
	public void setQuiet(int newQuiet) {
		quiet = newQuiet;
	}
	public int getImmediate() {
		return immediate;
	}
	public void setImmediate(int newImmediate) {
		immediate = newImmediate;
	}
	public int getVerbose() {
		return verbose;
	}
	public void setVerbose(int newVerbose) {
		verbose = newVerbose;
	}
	public int getVerbose_log() {
		return verbose_log;
	}
	public void setVerbose_log(int newVerbose_log) {
		verbose_log = newVerbose_log;
	}
	public int getTrace() {
		return trace;
	}
	public void setTrace(int newTrace) {
		trace = newTrace;
	}
	public int getWrite_junit_xml() {
		return write_junit_xml;
	}
	public void setWrite_junit_xml(int newWrite_junit_xml) {
		write_junit_xml = newWrite_junit_xml;
	}
}
