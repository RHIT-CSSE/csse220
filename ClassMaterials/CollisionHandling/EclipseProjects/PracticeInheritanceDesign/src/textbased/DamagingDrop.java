package textbased;

public class DamagingDrop {
	
	private boolean shouldRemove = false;

	public DamagingDrop() {
			
	}
	
	
	public boolean shouldRemove() {
		return this.shouldRemove;
	}
	
	public void onRemove() {
		System.out.println();
	}
	
	

}
