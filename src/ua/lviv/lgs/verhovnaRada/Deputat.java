package ua.lviv.lgs.verhovnaRada;

import java.util.Scanner;

public class Deputat extends Person{
	private String firstName;
	private String lastName;
	private Boolean brider;
	private int sizeOfBride;
	public Deputat(int weight, int height, String firstName, String lastName, Boolean brider) {
		super(weight, height);
		this.firstName = firstName;
		this.lastName = lastName;
		this.brider = brider;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Boolean getBrider() {
		return brider;
	}
	public int getSizeOfBride() {
		return sizeOfBride;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setBrider(Boolean briber) {
		this.brider = briber;
	}
	public void setSizeOfBride(int sizeOfBribe) {
		this.sizeOfBride = sizeOfBribe;
	}
	@Override
	public String toString() {
		return "Deputat [firstName=" + firstName + ", lastName=" + lastName + ", brider=" + brider + ", sizeOfBribe="
				+ sizeOfBride + ", getWeight()=" + getWeight() + ", getHeight()=" + getHeight() + "]";
	}
	public void bride() {
		
		if(brider == false) {
			System.out.println("��� ������� �� ���� ������");
		} else {
			System.out.println("������ ����� ������");
			Scanner sc = new Scanner(System.in);
			int ammountOfBride = Integer.parseInt(sc.next());
			if(ammountOfBride > 5000) {
				System.out.println("������ ��'������ ��������");
			} else {
				sizeOfBride = ammountOfBride;
				System.out.println(sizeOfBride);
			}
			
		
		}
	}
	

}
