package ua.lviv.lgs.verhovnaRada;

public class Person {
	private int weight;
	private int height;
	public Person(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public int getHeight() {
		return height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + "]";
	}

}
