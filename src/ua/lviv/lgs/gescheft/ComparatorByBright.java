package ua.lviv.lgs.gescheft;

import java.util.Comparator;



public class ComparatorByBright implements Comparator<Produkt>{
	public int compare(Produkt p1, Produkt p2) {
		
		if(p1.getBright()>p2.getBright()) {
			return 1;
		} else if (p1.getBright()<p2.getBright()) {
			return -1;
		} else {
			return 0;
		}
	}

}
