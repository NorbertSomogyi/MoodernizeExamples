package application;

/*
 * Generic constants related to iterators.
 */
/*
 * The attempt to advance the iterator was successful; the iterator
 * reflects the new current entry.
 */
/*
 * The iterator is exhausted and has been freed.
 */
/*
 * The iterator experienced an error. The iteration has been aborted
 * and the iterator has been freed.
 */
/*
 * Return values for selector functions for merge iterators. The
 * numerical values of these constants are important and must be
 * compatible with ITER_DONE and ITER_ERROR.
 */
public enum iterator_selection {
	ITER_SELECT_DONE, 
	ITER_SELECT_ERROR, 
	ITER_CURRENT_SELECTION_MASK, 
	ITER_CURRENT_SELECTION_0, 
	ITER_CURRENT_SELECTION_1, 
	ITER_YIELD_CURRENT, 
	ITER_SKIP_SECONDARY, 
	ITER_SELECT_0, 
	ITER_SELECT_0_SKIP_1, 
	ITER_SKIP_0, 
	ITER_SELECT_1, 
	ITER_SELECT_1_SKIP_0, 
	ITER_SKIP_1
}
