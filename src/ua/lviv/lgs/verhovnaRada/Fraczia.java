package ua.lviv.lgs.verhovnaRada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Fraczia {
	private String nameFractia;
	List<Deputat> fractia = new ArrayList();
	
	public Fraczia() {
		super();
		this.nameFractia  = nameFractia;
	}
	
	public List<Deputat> getFractia() {
		return fractia;
	}

	public String getNameFractia() {
		return nameFractia;
	}

	public void setNameFractia(String nameFractia) {
		this.nameFractia = nameFractia;
	}

	
	@Override
	public String toString() {
		return "Fractia [fractia=" + fractia + ", nameFractia=" + nameFractia + "]";
	}

	public void addDeputat () {
		
		Deputat dep1 = new Deputat(1,1,"ivan","petrov", true);
		dep1.setSizeOfBride(100);		
		Deputat dep2 = new Deputat(2,2,"petro","ivanov", true);
		dep2.setSizeOfBride(200);
		Deputat dep3 = new Deputat(4,4,"boris","popov", false);
		Deputat dep4 = new Deputat(5,5,"pop","borisov", true);
		dep4.setSizeOfBride(50);
		Deputat dep5 = new Deputat(6,6,"gleb","sidorov", false);
		fractia.add(dep1);
		fractia.add(dep2);
		fractia.add(dep3);
		fractia.add(dep4);
		fractia.add(dep5);
		System.out.println("First name of new deputat");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		
		System.out.println("Last name of new deputat");
		Scanner sc1 = new Scanner(System.in);
		String lastName = sc1.next();
		
		System.out.println("Weight of new deputat");
		Scanner sc2 = new Scanner(System.in);
		int weight = Integer.parseInt(sc2.next());
		
		System.out.println("Height of new deputat");
		Scanner sc3 = new Scanner(System.in);
		int height = Integer.parseInt(sc3.next());
		
		System.out.println("Is a brider or not");
		Scanner sc4 = new Scanner(System.in);
		Boolean brider = Boolean.parseBoolean(sc4.next());
		
		fractia.add(new Deputat( weight,  height, firstName, lastName, brider));
		
		
		System.out.println(fractia);
		
	}

	
	public void deleteDeputatStream() {
		
		System.out.println("Fist name of delete deputat");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		
		System.out.println("Last name of delete deputat");
		Scanner sc1 = new Scanner(System.in);
		String lastName = sc.next();
		
		Stream<Deputat> streamWitjoutDeputat =fractia.stream().
				filter((deputat) -> !deputat.getFirstName().equalsIgnoreCase(firstName)).
		        filter((deputat) -> !deputat.getLastName().equalsIgnoreCase(lastName));
		
		fractia = (streamWitjoutDeputat.collect(Collectors.toList()));
		System.out.println(fractia);
		
	}


	public void allBridersStream() {
		
		Stream<Deputat> allBriderStream = fractia.stream().filter(deputat -> deputat.getBrider());
		fractia = allBriderStream.collect(Collectors.toList());
		System.out.println("Briders = " + fractia);
	}

	public void bestBriderStream() {
		Stream<Deputat> allBriderStream = fractia.stream().filter(deputat -> deputat.getBrider());
		Stream<Integer> bridersStream = allBriderStream.map(deputat-> deputat.getSizeOfBride());		
		Integer bestBride = bridersStream.max(Integer::compareTo).get();		
		fractia = fractia.stream().filter(deputat -> deputat.getSizeOfBride() ==  bestBride).collect(Collectors.toList());
		System.out.println("The best brider = " + fractia);
	}
	public void allDeputatOfFractiaStream() {
		
		System.out.println("All deputatas of fractia");		
		fractia.stream().peek(deputat -> System.out.println(deputat)).collect(Collectors.toList());

	}
	
	public void clearFractia () {
		fractia.clear();

	}
	public void getBrideToDeputat() {
		System.out.println("¬вед≥ть	≥м'€ депутата хабарника");																																			
		Scanner sc = new Scanner(System.in);
		String firstNameBrider = sc.next();
		System.out.println("¬вед≥ть пр≥звище депутата хабарника");
		Scanner sc1 = new Scanner(System.in);
		String lastNameBrider = sc1.next();
		Iterator <Deputat>iterator = fractia.iterator();
		while(iterator.hasNext()) {
			Deputat next = iterator.next();
			String firstName = next.getFirstName();
			String lastName = next.getLastName();
			if (firstName.equalsIgnoreCase(firstNameBrider) & lastName.equalsIgnoreCase(lastNameBrider)) {
				next.bride();
			}
		}
	}
	
	

}
