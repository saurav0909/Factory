package simplestagequeue;

import java.util.ArrayDeque;
import java.util.Deque;

import item.Item;

public class SimpleStageQueue {
	
	private Deque<Item> queue;
	
	public SimpleStageQueue() {
		this.queue=new ArrayDeque<>();
	}
	
	public void addItem(Item item) {
		queue.addLast(item);
	}
	
	public Item getNextItem() {
		return  queue.pollFirst();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}

}
