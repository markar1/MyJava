package jaesung.sample;

public class Composition {

	public static void main(String[] args) {
		// Has- a 관계 알아보기
		ACircle ac = new ACircle();
		BCircle bc = new BCircle();

		ac.r = 15; // 반지름
		bc.r = 32;

		ac.p.x = 45; // 좌표
		ac.p.y = 12;

		// 모든 클래스의 조상 : Object
		// 따라서, Object클래스에 정의된
		// toString() 이나 equals() 메서드를
		// 재정의해서 사용할 수 있음

	}

}

class circle {
	// int x; // 좌표
	// int y;
	Point p = new Point(); // 포함관계
	int r; // 반지금

}

class ACircle extends circle {
	int x;
}

class BCircle extends circle {

}

class Point {
	int x;
	int y;

}