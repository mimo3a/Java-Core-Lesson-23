package ua.lviv.lgs.verhovnaRada;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ua.lviv.lgs.verhovnaRada.Fraczia;







public class VerchovnaRada {
	List <Fraczia>verhovnaRada = new ArrayList();

	

	public List<Fraczia> getVerhovnaRada() {
		return verhovnaRada;
	}

	public void setVerhovnaRada(List<Fraczia> verhovnaRada) {
		this.verhovnaRada = verhovnaRada;
	}
	public void addFractia() {
		System.out.println("¬вед≥ть назву фракц≥≥ що додаЇтьс€");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Fraczia fr = new Fraczia();
		fr.setNameFractia(name);
		verhovnaRada.add(fr);
		allFractias ();
	}
	public void deleteFractia() {
		System.out.println("¬вед≥ть назву фракц≥≥ що видал€Їтьс€");
		Scanner sc = new Scanner(System.in);
		String deletedFractia = sc.next();
		Stream<Fraczia> vercRadaWithoutFractia = verhovnaRada.stream().filter(fractia -> !fractia.getNameFractia().equalsIgnoreCase(deletedFractia));
		verhovnaRada = vercRadaWithoutFractia.collect(Collectors.toList());
		allFractias ();
		
	}
	public void allFractias () {
		verhovnaRada.stream().peek(e->System.out.println(e)).collect(Collectors.toList());
	}
	public void exactlyFractia() {
		System.out.println("¬вед≥ть назву конкретно≥ фракц≥≥ що треба вивести");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		Stream<Fraczia> exFractiaStream = verhovnaRada.stream().filter(fr->fr.getNameFractia().equalsIgnoreCase(exactName));
		exFractiaStream.peek(e->e.allDeputatOfFractiaStream()).collect(Collectors.toList());		
	}
	public void addDeputatToExactFractia () {
		
		System.out.println("¬вед≥ть назву фракц≥≥ куди додаЇтьс€ депутат");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		
		Stream<Fraczia> exFractiaStream = verhovnaRada.stream().filter(fr->fr.getNameFractia().equalsIgnoreCase(exactName));
		
		exFractiaStream.peek(fractia -> fractia.addDeputat()).collect(Collectors.toList());
		System.out.println("ok");
				
	}
	public void deleteDeputatFromExactFractia () {
		System.out.println("¬вед≥ть назву фракц≥≥ зв≥дки видал€Їтьс€ депутат");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		
		Stream<Fraczia> exFractiaStream = verhovnaRada.stream().filter(fr->fr.getNameFractia().equalsIgnoreCase(exactName));
		exFractiaStream.peek(fractia -> fractia.deleteDeputatStream()).collect(Collectors.toList());
	
	}
	public void allBridersOfFractia () {
		System.out.println("¬вед≥ть назву фракц≥≥ з €ко≥ треба вивести хабарник≥в");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		
		Stream<Fraczia> exFractiaStream = verhovnaRada.stream().filter(fr->fr.getNameFractia().equalsIgnoreCase(exactName));
		exFractiaStream.peek(fractia -> fractia.allBridersStream()).collect(Collectors.toList());
		
	}
	public void bestBriderOfFractia () {
		System.out.println("¬вед≥ть назву фракц≥≥ з €ко≥ треба вивести найб≥льшого хабарника");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		
		Stream<Fraczia> exFractiaStream = verhovnaRada.stream().filter(fr->fr.getNameFractia().equalsIgnoreCase(exactName));
		exFractiaStream.peek(fractia -> fractia.bestBriderStream()).collect(Collectors.toList());
		
	}
	public void allDeputatFractia () {
		System.out.println("¬вед≥ть назву фракц≥≥ щоб вивести вс≥х депутат≥в");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		
		Stream<Fraczia> exFractiaStream = verhovnaRada.stream().filter(fr->fr.getNameFractia().equalsIgnoreCase(exactName));
		exFractiaStream.peek(fractia -> fractia.allDeputatOfFractiaStream()).collect(Collectors.toList());
		
	}
	public void clearExFractia() {
		System.out.println("¬вед≥ть назву фракц≥≥ щоб видалити вс≥х депутат≥в");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		
		Stream<Fraczia> exFractiaStream = verhovnaRada.stream().filter(fr->fr.getNameFractia().equalsIgnoreCase(exactName));
		exFractiaStream.peek(fractia -> fractia.clearFractia()).collect(Collectors.toList());
		
		
	}
	public void getBrideExactDeputat () {
		System.out.println("¬вед≥ть назву фракц≥≥ депутату €ко≥ треба дати хабар");
		Scanner sc = new Scanner(System.in);
		String exactName = sc.next();
		
		Stream<Fraczia> exFractiaStream = verhovnaRada.stream().filter(fr->fr.getNameFractia().equalsIgnoreCase(exactName));
		exFractiaStream.peek(fractia -> fractia.getBrideToDeputat()).collect(Collectors.toList());
		
	}
}
