package application;

public class grep_expr {
	private grep_expr_node node;
	private int hit;
	private  u;
	
	public grep_expr(grep_expr_node node, int hit,  u) {
		setNode(node);
		setHit(hit);
		setU(u);
	}
	public grep_expr() {
	}
	
	public grep_expr_node getNode() {
		return node;
	}
	public void setNode(grep_expr_node newNode) {
		node = newNode;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int newHit) {
		hit = newHit;
	}
	public  getU() {
		return u;
	}
	public void setU( newU) {
		u = newU;
	}
}
