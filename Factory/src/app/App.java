package app;

import item.Item;
import multistageprocessing.MultiStageProcessing;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MultiStageProcessing processing=new MultiStageProcessing(5, 10);
		
		
		processing.addItem(new Item(1, 0, 1,"First item"));
		processing.addItem(new Item(2, 0, 4,"Second item"));
		processing.addItem(new Item(3, 0, 3,"Third item"));
		processing.addItem(new Item(4, 0, 2,"Fourth item"));


		
		processing.startProcessing();
		
		processing.shutdown();

	}

}
