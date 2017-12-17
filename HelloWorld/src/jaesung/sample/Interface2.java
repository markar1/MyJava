package jaesung.sample;

public class Interface2 {

	public static void main(String[] args) {
		System.out.println(Choices.YES);
		Choices.p.walk();
	}

}

interface Choices {
	// 상수 선언
	public static final int YES = 1;
	int NO = 2;

	// person12 p12; // 상수를 선언시 초기화 필수!
	Person12 p = new Person12();

}

interface walkable2 {
	void walk();
}

interface swimmable {
	void swin();

}

class Lion implements walkable2 {

	@Override
	public void walk() {

	}

}

// 인터페이스 다중 구현
class Turtle implements walkable2, swimmable {

	@Override
	public void swin() {

	}

	@Override
	public void walk() {

	}

}