package item;

public class Item {
	
	private int itemId;
	private int stage;
	private int priority;
	private String description;
	
	public Item(int itemId, int stage, int priority, String description) {
		super();
		this.itemId = itemId;
		this.stage = stage;
		this.priority = priority;
		this.description = description;
	}
	public int getStage() {
		return stage;
	}
	public void setStage(int stage) {
		this.stage = stage;
	}
	public int getItemId() {
		return itemId;
	}
	public int getPriority() {
		return priority;
	}
	public String getDescription() {
		return description;
	}
	
	

}
