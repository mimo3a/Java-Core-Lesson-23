package ua.lviv.lgs.gescheft;

public class Produkt {
	private String name;
	private int length;
	private int bright;
	private int weght;
	
	public Produkt(String name, int length, int bright, int weght) {
		super();
		this.name = name;
		this.length = length;
		this.bright = bright;
		this.weght = weght;
	}
	public String getName() {
		return name;
	}
	public int getLength() {
		return length;
	}
	public int getBright() {
		return bright;
	}
	public int getWeght() {
		return weght;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setBright(int bright) {
		this.bright = bright;
	}
	public void setWeght(int weght) {
		this.weght = weght;
	}
	@Override
	public String toString() {
		return "Produkt [name=" + name + ", length=" + length + ", bright=" + bright + ", weght=" + weght + "]";
	}
}
