package test.object;

import java.util.Iterator;

public class RunTV {

	public static void main(String[] args) {
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		tv1.setProducer("LG");
		tv1.setColor("White");
		tv1.setModelNum("LG128793519");
		tv1.setChannel(6);
		
		tv2.setProducer("SAMSUNG");
		tv2.setColor("Black");
		tv2.setModelNum("ss513161539");
		tv2.setChannel(1);
		
		tv1.powerOn();
		tv1.upChannel();
		tv1.upChannel();
		tv1.upChannel();
		for (int i = 0; i < 10; i++) {
			tv1.upVolume();
		}
		
		tv2.powerOn();
		for (int i = 0; i < 20; i++) {
			tv2.upChannel();
		}
		tv2.downChannel();
	}

}
