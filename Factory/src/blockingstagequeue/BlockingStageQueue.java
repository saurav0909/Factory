package blockingstagequeue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

import item.Item;

public class BlockingStageQueue {
	
	private BlockingDeque<Item> queue;
	
	public BlockingStageQueue() {
		this.queue=new LinkedBlockingDeque<>();
	}
	
	public void addItem(Item item) throws InterruptedException {
		queue.putLast(item);
	}
	
	public Item getNextItem() throws InterruptedException{
		return queue.takeFirst();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	

}
