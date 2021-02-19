package ua.lviv.lgs.gescheft;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Produkt>{

	
	public int compare(Produkt p1, Produkt p2) {
		
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
	

}
