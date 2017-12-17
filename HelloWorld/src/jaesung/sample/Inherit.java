package jaesung.sample;

public class Inherit {

	public static void main(String[] args) {
		Eagle e1 = new Eagle();
		e1.eat();
		e1.sleep();
		e1.fly();

		Tiger t1 = new Tiger();
		t1.eat();
		t1.sleep();
		t1.run();

		Goldfish g1 = new Goldfish();
		g1.eat();
		g1.sleep();
		g1.swim();

		// 부모클래스를 객체로 만들수도 있다!
		// 부모 클래스를 객체화 못하게 하고 싶다면
		// 추상 클래스로 만들면 된다. abstract
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();

		// 다형성 - 타입 형변환
		// 상속관계에 있는 자식클래스의 객체는
		// 부모 클래스의 타입으로 변환 가능
		Animal a = e1;
		a = t1;
		a = g1;

		// 다운캐스팅
		// Tiger t = a;
		// Goldfish g = a;
		// Eagle e = a;

	}

}

class Animal {
	private String eyes;
	private String mouth;

	public Animal() {

	}

	public void eat() {
		System.out.println("지금은 먹는중");
	}

	public void sleep() {
		System.out.println("지금은 자는중");
	}
}

class Eagle extends Animal {
	private String wing;

	public void fly() {
		System.out.println("지금은 나는중");
	}
}

class Tiger extends Animal {
	private String leg;

	public void run() {
		System.out.println("지금은 달리는중");
	}
}

class Goldfish extends Animal {
	private String fin;

	public void swim() {
		System.out.println("지금은 헤엄치는중");
	}
}

class User {
	private String userId;
	private String passwd;
	private String addr;
	private Zipcode zip; // 사용자는 주소정보를 가짐
							// has-a 관계 현성
}

class Zipcode {
	private String zipcode;
	private String sido;
	private String gugun;
	private String dong;
	private String bunji;

}

class Device {
	protected String name;

}

class Camera extends Device {
	public String showName() {
		return name;
	}
}