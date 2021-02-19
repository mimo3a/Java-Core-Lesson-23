package ua.lviv.lgs.gescheft;

import java.util.Scanner;

public class ApplicationCommodity {
	public static void main(String[] args) {
		Commodity com = new Commodity();		
		com.firstMeinung();
		
		while(true) {
			
			menu();
			Scanner sc = new Scanner(System.in);
			String menuNumber = sc.next();
			switch (menuNumber) {
			case "1" : com.addProduct();
			break;
			case "2" : com.deleteProduct();
			break;			
			case "3" : com.changeProduct();
			break;
			case "4" : com.sortByName();
			break;
			case "5" : com.sortByLength();
			break;
			case "6" : com.sortByBright();
			break;
			case "7" : com.sortByWegth();
			break;
			case "8" : com.productByNumber();			
			break;
			case "9" : System.out.println("Exit from programm");
			System.exit(0);
			break;
			default : System.out.println("Not found");
			break;
			}			
		}
	}
	public static void menu () {
		System.out.println(" ������ 1 ��� ������ �����");
		System.out.println(" ������ 2 ��� �������� �����");
		System.out.println(" ������ 3 ��� ������� �����");
		System.out.println(" ������ 4 ��� ��������� �� �������");
		System.out.println(" ������ 5 ��� ��������� �� ��������");
		System.out.println(" ������ 6 ��� ��������� �� �������");
		System.out.println(" ������ 7 ��� ��������� �� �����");
		System.out.println(" ������ 8 ��� ������� �-��� ������� ��������");
		System.out.println(" ������ 9 ��� ����� � ��������");
		
		
	}

}
