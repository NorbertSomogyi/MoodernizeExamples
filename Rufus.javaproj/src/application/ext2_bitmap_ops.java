package application;

public class ext2_bitmap_ops {
	private int type;
	private Object new_bmap;
	private Object free_bmap;
	private Object copy_bmap;
	private Object resize_bmap;
	private Object mark_bmap;
	private Object unmark_bmap;
	private Object test_bmap;
	private Object mark_bmap_extent;
	private Object unmark_bmap_extent;
	private Object test_clear_bmap_extent;
	private Object set_bmap_range;
	private Object get_bmap_range;
	private Object clear_bmap;
	private Object print_stats;
	private Object find_first_zero;
	private Object find_first_set;
	
	public ext2_bitmap_ops(int type, Object new_bmap, Object free_bmap, Object copy_bmap, Object resize_bmap, Object mark_bmap, Object unmark_bmap, Object test_bmap, Object mark_bmap_extent, Object unmark_bmap_extent, Object test_clear_bmap_extent, Object set_bmap_range, Object get_bmap_range, Object clear_bmap, Object print_stats, Object find_first_zero, Object find_first_set) {
		setType(type);
		setNew_bmap(new_bmap);
		setFree_bmap(free_bmap);
		setCopy_bmap(copy_bmap);
		setResize_bmap(resize_bmap);
		setMark_bmap(mark_bmap);
		setUnmark_bmap(unmark_bmap);
		setTest_bmap(test_bmap);
		setMark_bmap_extent(mark_bmap_extent);
		setUnmark_bmap_extent(unmark_bmap_extent);
		setTest_clear_bmap_extent(test_clear_bmap_extent);
		setSet_bmap_range(set_bmap_range);
		setGet_bmap_range(get_bmap_range);
		setClear_bmap(clear_bmap);
		setPrint_stats(print_stats);
		setFind_first_zero(find_first_zero);
		setFind_first_set(find_first_set);
	}
	public ext2_bitmap_ops() {
	}
	
	public int getType() {
		return type;
	}
	public void setType(int newType) {
		type = newType;
	}
	public Object getNew_bmap() {
		return new_bmap;
	}
	public void setNew_bmap(Object newNew_bmap) {
		new_bmap = newNew_bmap;
	}
	public Object getFree_bmap() {
		return free_bmap;
	}
	public void setFree_bmap(Object newFree_bmap) {
		free_bmap = newFree_bmap;
	}
	public Object getCopy_bmap() {
		return copy_bmap;
	}
	public void setCopy_bmap(Object newCopy_bmap) {
		copy_bmap = newCopy_bmap;
	}
	public Object getResize_bmap() {
		return resize_bmap;
	}
	public void setResize_bmap(Object newResize_bmap) {
		resize_bmap = newResize_bmap;
	}
	public Object getMark_bmap() {
		return mark_bmap;
	}
	public void setMark_bmap(Object newMark_bmap) {
		mark_bmap = newMark_bmap;
	}
	public Object getUnmark_bmap() {
		return unmark_bmap;
	}
	public void setUnmark_bmap(Object newUnmark_bmap) {
		unmark_bmap = newUnmark_bmap;
	}
	public Object getTest_bmap() {
		return test_bmap;
	}
	public void setTest_bmap(Object newTest_bmap) {
		test_bmap = newTest_bmap;
	}
	public Object getMark_bmap_extent() {
		return mark_bmap_extent;
	}
	public void setMark_bmap_extent(Object newMark_bmap_extent) {
		mark_bmap_extent = newMark_bmap_extent;
	}
	public Object getUnmark_bmap_extent() {
		return unmark_bmap_extent;
	}
	public void setUnmark_bmap_extent(Object newUnmark_bmap_extent) {
		unmark_bmap_extent = newUnmark_bmap_extent;
	}
	public Object getTest_clear_bmap_extent() {
		return test_clear_bmap_extent;
	}
	public void setTest_clear_bmap_extent(Object newTest_clear_bmap_extent) {
		test_clear_bmap_extent = newTest_clear_bmap_extent;
	}
	public Object getSet_bmap_range() {
		return set_bmap_range;
	}
	public void setSet_bmap_range(Object newSet_bmap_range) {
		set_bmap_range = newSet_bmap_range;
	}
	public Object getGet_bmap_range() {
		return get_bmap_range;
	}
	public void setGet_bmap_range(Object newGet_bmap_range) {
		get_bmap_range = newGet_bmap_range;
	}
	public Object getClear_bmap() {
		return clear_bmap;
	}
	public void setClear_bmap(Object newClear_bmap) {
		clear_bmap = newClear_bmap;
	}
	public Object getPrint_stats() {
		return print_stats;
	}
	public void setPrint_stats(Object newPrint_stats) {
		print_stats = newPrint_stats;
	}
	public Object getFind_first_zero() {
		return find_first_zero;
	}
	public void setFind_first_zero(Object newFind_first_zero) {
		find_first_zero = newFind_first_zero;
	}
	public Object getFind_first_set() {
		return find_first_set;
	}
	public void setFind_first_set(Object newFind_first_set) {
		find_first_set = newFind_first_set;
	}
}
