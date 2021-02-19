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
			default : System.out.println("���� ������ ������");
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
		System.out.println("������ 1 ��� ������ �������");
		System.out.println("������ 2 ��� �������� ��������� �������");
		System.out.println("������ 3 ��� ������� ��  �������");
		System.out.println("������ 4 ��� �������� ��������� �������");
		System.out.println("������ 5 ��� ������� ��������� �������");
		System.out.println("������ 6 ��� ������ �������� � �������");
		System.out.println("������ 7 ��� �������� �������� � �������");
		System.out.println("������ 8 ��� ������� ������ ���������");
		System.out.println("������ 9 ��� ������� ���������� ���������");
		System.out.println("������ 10 ��� ���� ����� ��������� ��������");
		};
}