package application;

/* silently allow all missing PROMISOR objects */
public enum missing_action {
	MA_ERROR, 
	MA_ALLOW_ANY, 
	MA_PRINT, 
	MA_ALLOW_PROMISOR
}
