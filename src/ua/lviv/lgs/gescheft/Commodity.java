package ua.lviv.lgs.gescheft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class Commodity {

	List<Produkt> myList = new ArrayList<>();
	
	public void firstMeinung() {
		myList.add(new Produkt("donna", 2000, 200, 45));
		myList.add(new Produkt("wanna", 2200, 150, 50));
		myList.add(new Produkt("foma", 200, 100, 4));
		myList.add(new Produkt("afifa", 1758, 540, 150));
		myList.add(new Produkt("barka", 345, 235, 65));
		myList.add(new Produkt("vovka", 329, 10, 330));
		allProducts();
		

	};
	public void addProduct() {

		System.out.println("Enter the name");
		Scanner sc1 = new Scanner(System.in);
		String entName = sc1.next();

		System.out.println("Enter the length");
		Scanner sc2 = new Scanner(System.in);
		int entLength = sc2.nextInt();

		System.out.println("Enter the bright");
		Scanner sc3 = new Scanner(System.in);
		int entBright = sc3.nextInt();

		System.out.println("Enter the weght");
		Scanner sc4 = new Scanner(System.in);
		int entWeght = sc4.nextInt();

		Produkt newProduct = new Produkt(entName, entLength, entBright, entWeght);

		myList.add(newProduct);
		allProducts();
		

	}
	public void deleteProduct() {
		System.out.println("Enter the name of deleted product");
		Scanner sc = new Scanner(System.in);
		String entName = sc.next();
		
		Stream<Produkt> withoutDeleted = myList.stream().filter(produkt->!produkt.getName().equalsIgnoreCase(entName));
		 myList = withoutDeleted.collect(Collectors.toList());
		 allProducts();
		
	}
	public void changeProduct() {
		System.out.println("Enter the name of changed product");
		Scanner sc = new Scanner(System.in);
		String entName = sc.next();
				
		System.out.println("Enter the name of new product");
		Scanner sc1 = new Scanner(System.in);
		String newName = sc1.next();

		System.out.println("Enter the length of new product");
		Scanner sc2 = new Scanner(System.in);
		int newLength = sc2.nextInt();
		
		System.out.println("Enter the bright of new product");
		Scanner sc3 = new Scanner(System.in);
		int newBright = sc3.nextInt();

		System.out.println("Enter the weght of new product");
		Scanner sc4 = new Scanner(System.in);
		int newWeght = sc4.nextInt();
				
		 myList.stream().forEach(e->{
			if(e.getName().equalsIgnoreCase(entName)) {
				e.setName(newName);
				e.setLength(newLength);
				e.setBright(newBright);
				e.setWeght(newWeght);
			};});
		 allProducts();
		 		
	}
	public void sortByName () {
		 Stream<Produkt> sortedName = myList.stream().sorted(new ComparatorByName());
		 myList = sortedName.collect(Collectors.toList());
		 allProducts();
		 
		
		
	}
	public void sortByLength() {
		Stream<Produkt> sortedLength = myList.stream().sorted(new ComparatorByLength());
		myList = sortedLength.collect(Collectors.toList());
		allProducts();
		
	}
	public void sortByWegth() {
		Stream<Produkt> sortedWegth = myList.stream().sorted(new ComparatorByWegth());
		myList = sortedWegth.collect(Collectors.toList());
		allProducts();
		
	}
	public void sortByBright() {
		Stream<Produkt> sortedBright = myList.stream().sorted(new ComparatorByBright());
		myList = sortedBright.collect(Collectors.toList());
		allProducts();
		
	}
	public void productByNumber() {
		System.out.println("Enter the number of the element");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		Optional<Produkt> skip = myList.stream().skip(number-1).findFirst();
		System.out.println(skip.get());
		
	}
	public void allProducts() {
		myList.stream().forEach(System.out::println);
	}
}
