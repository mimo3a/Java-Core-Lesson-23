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
		System.out.println(" Введіть 1 щоб Додати товар");
		System.out.println(" Введіть 2 щоб Видалити товар");
		System.out.println(" Введіть 3 щоб Замінити товар");
		System.out.println(" Введіть 4 щоб Сортувати за назвоню");
		System.out.println(" Введіть 5 щоб Сортувати за довжиною");
		System.out.println(" Введіть 6 щоб Сортувати за шириною");
		System.out.println(" Введіть 7 щоб Сортувати за вагою");
		System.out.println(" Введіть 8 щоб Вивести і-тий елемент колекції");
		System.out.println(" Введіть 9 щоб Вийти з програми");
		
		
	}

}
