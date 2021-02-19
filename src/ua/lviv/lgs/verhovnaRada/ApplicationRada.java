package ua.lviv.lgs.verhovnaRada;

import java.util.Scanner;

public class ApplicationRada {
	public static void main(String[] args) {
		VerchovnaRada vr1 = new VerchovnaRada();
		while(true) {
			menu();
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			switch (input) {
			case "1" : vr1.addFractia();
			break;
			case "2" : vr1.deleteFractia();
			break;
			case "3" : vr1.allFractias();
			break;
			case "4" : vr1.clearExFractia();
			break;
			case "5" : vr1.exactlyFractia();
			break;
			case "6" : vr1.addDeputatToExactFractia();
			break;
			case "7" : vr1.deleteDeputatFromExactFractia();
			break;
			case "8" : vr1.allBridersOfFractia();
			break;
			case "9" : vr1.bestBriderOfFractia();
			break;	
			case "10" : vr1.getBrideExactDeputat();
			break;	
			default : System.out.println("Немає такого пункту");
			break;
			}
		}
//		vr1.addFractia();
//		vr1.addFractia();
//		vr1.addDeputatToExactFractia();
//		vr1.exactlyFractia();
//		vr1.deleteDeputatFromExactFractia();
//		vr1.allBridersOfFractia();
//		vr1.bestBriderOfFractia();
//		vr1.allDeputatFractia();
		

	}
	public static void menu () {
		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
		System.out.println("Введіть 10 щоб дати хабар потрібному депутату");
		};
}