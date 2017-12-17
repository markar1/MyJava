package jaesung.sample;

public class Polymorph {

	public static void main(String[] args) {
		Tv t = new Tv();
		System.out.println(t.getPrice());
		System.out.println(t.getBounus());
		Computer c = new Computer();
		System.out.println(c.getPrice());
		System.out.println(c.getBounus());
		Radio r = new Radio();
		System.out.println(r.getPrice());
		System.out.println(r.getBounus());

		Buyer b = new Buyer();
		b.buy(t);
		b.buy(c);
		b.buy(r);
		System.out.println(b.getMoney());
		System.out.println(b.getBounusTotal());

		b.buy2(t);
		b.buy2(c);
		b.buy2(r);
		System.out.println(b.getMoney());
		System.out.println(b.getBounusTotal());

	}

}

class Item {
	private int price;
	private int bounus;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBounus() {
		return bounus;
	}

	public void setBounus(int bounus) {
		this.bounus = bounus;
	}

}

class Tv extends Item {
	public Tv() {
		setPrice(1500);
		setBounus(150);
	}
}

class Computer extends Item {
	public Computer() {
		setPrice(3500);
		setBounus(300);
	}
}

class Radio extends Item {
	public Radio() {
		setPrice(500);
		setBounus(50);
	}
}

class Buyer {
	private int money; // 총 구입금액
	private int bounusTotal; // 총 적립금

	public int getMoney() {
		return money;
	}

	public int getBounusTotal() {
		return bounusTotal;
	}

	// 상품 구매 기능
	public void buy(Tv tv) {
		money += tv.getPrice();
		bounusTotal += tv.getBounus();

	}

	public void buy(Computer com) {
		money += com.getPrice();
		bounusTotal += com.getBounus();
	}

	public void buy(Radio rad) {
		money += rad.getPrice();
		bounusTotal += rad.getBounus();
	}

	// 자식클래스 객체를 부모클래스 타입으로 변환
	// Tv, Computer, Radio => Item
	public void buy2(Item i) {
		money += i.getPrice();
		bounusTotal += i.getBounus();

	}
}
