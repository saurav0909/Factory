package concurrentstagequeue;

import java.util.concurrent.ConcurrentLinkedDeque;

import item.Item;

public class ConcurrentStageQueue {
	
	private final ConcurrentLinkedDeque<Item>  queue;
	
	public ConcurrentStageQueue() {
		this.queue=new ConcurrentLinkedDeque<>();
	}
	
	public void addItem(Item item) {
		queue.addLast(item);
	}
	
	public Item getNextItem() {
		return queue.pollFirst();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	

}
