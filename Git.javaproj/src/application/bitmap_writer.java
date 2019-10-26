package application;

public class bitmap_writer {
	private ewah_bitmap commits;
	private ewah_bitmap trees;
	private ewah_bitmap blobs;
	private ewah_bitmap tags;
	private  bitmaps;
	private  reused;
	private packing_data to_pack;
	private bitmapped_commit selected;
	private int selected_nr;
	private int selected_alloc;
	private progress progress;
	private int show_progress;
	private Object pack_checksum;
	
	public bitmap_writer(ewah_bitmap commits, ewah_bitmap trees, ewah_bitmap blobs, ewah_bitmap tags,  bitmaps,  reused, packing_data to_pack, bitmapped_commit selected, int selected_nr, int selected_alloc, progress progress, int show_progress, Object pack_checksum) {
		setCommits(commits);
		setTrees(trees);
		setBlobs(blobs);
		setTags(tags);
		setBitmaps(bitmaps);
		setReused(reused);
		setTo_pack(to_pack);
		setSelected(selected);
		setSelected_nr(selected_nr);
		setSelected_alloc(selected_alloc);
		setProgress(progress);
		setShow_progress(show_progress);
		setPack_checksum(pack_checksum);
	}
	public bitmap_writer() {
	}
	
	public ewah_bitmap getCommits() {
		return commits;
	}
	public void setCommits(ewah_bitmap newCommits) {
		commits = newCommits;
	}
	public ewah_bitmap getTrees() {
		return trees;
	}
	public void setTrees(ewah_bitmap newTrees) {
		trees = newTrees;
	}
	public ewah_bitmap getBlobs() {
		return blobs;
	}
	public void setBlobs(ewah_bitmap newBlobs) {
		blobs = newBlobs;
	}
	public ewah_bitmap getTags() {
		return tags;
	}
	public void setTags(ewah_bitmap newTags) {
		tags = newTags;
	}
	public  getBitmaps() {
		return bitmaps;
	}
	public void setBitmaps( newBitmaps) {
		bitmaps = newBitmaps;
	}
	public  getReused() {
		return reused;
	}
	public void setReused( newReused) {
		reused = newReused;
	}
	public packing_data getTo_pack() {
		return to_pack;
	}
	public void setTo_pack(packing_data newTo_pack) {
		to_pack = newTo_pack;
	}
	public bitmapped_commit getSelected() {
		return selected;
	}
	public void setSelected(bitmapped_commit newSelected) {
		selected = newSelected;
	}
	public int getSelected_nr() {
		return selected_nr;
	}
	public void setSelected_nr(int newSelected_nr) {
		selected_nr = newSelected_nr;
	}
	public int getSelected_alloc() {
		return selected_alloc;
	}
	public void setSelected_alloc(int newSelected_alloc) {
		selected_alloc = newSelected_alloc;
	}
	public progress getProgress() {
		return progress;
	}
	public void setProgress(progress newProgress) {
		progress = newProgress;
	}
	public int getShow_progress() {
		return show_progress;
	}
	public void setShow_progress(int newShow_progress) {
		show_progress = newShow_progress;
	}
	public Object getPack_checksum() {
		return pack_checksum;
	}
	public void setPack_checksum(Object newPack_checksum) {
		pack_checksum = newPack_checksum;
	}
}
