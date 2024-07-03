package stagequeue;

import java.util.Deque;
import java.util.LinkedList;

import item.Item;

public class StageQueue {
	
	private Deque<Item> queue;

	public StageQueue() {
		this.queue = new LinkedList<>();
	}
	
	public void addItem(Item item) {
		queue.add(item);
	}
	
	public Item getNextItem() {
		return queue.pollFirst();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	
	

}
