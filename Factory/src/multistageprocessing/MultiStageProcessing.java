package multistageprocessing;

import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

import item.Item;

public class MultiStageProcessing {
	
	private ExecutorService executor;
	private int numStages;
	private  final PriorityBlockingQueue<Item> queue;
	
	public MultiStageProcessing(int numStages, int numThreads) {
		this.numStages=numStages;
		this.executor=Executors.newFixedThreadPool(numThreads);
		this.queue=new PriorityBlockingQueue<>(11, Comparator.comparingInt(Item::getPriority).reversed());
	}
	
	public void addItem(Item item) {
		queue.offer(item);
	}
	
	public void startProcessing() {
		for(int i=0;i<numStages;i++) {
			final int stage=i;
			executor.submit(()->{
				while(true) {
					try {
						Item item=queue.take();
						if(item.getStage()==stage) {
							processItem(item);
							item.setStage(stage+1);
							if(item.getStage()<numStages) {
								queue.offer(item);
							}
						}else {
							queue.offer(item);
						}
					}catch (InterruptedException e) {
						// TODO: handle exception
						
						Thread.currentThread().interrupt();
						break;
					}
				}
			});
		}
	}
	
	private void processItem(Item item) {
		
		System.out.println("Processed item: "+item.getItemId());
	}
	
	public void shutdown() {
		executor.shutdown();
	}

}
