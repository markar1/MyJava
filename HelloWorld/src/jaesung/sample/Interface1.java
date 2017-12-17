package jaesung.sample;

public class Interface1 {

	public static void main(String[] args) {
		Person10 p10 = new Person10();
		p10.work();

		Duck10 d10 = new Duck10();
		d10.work();

		Person10[] p10a = new Person10[3];
		p10a[0] = new Person10();
		p10a[1] = new Person10();
		p10a[2] = new Person10();

		p10a[0].work();
		p10a[1].work();
		p10a[2].work(); // 사람이 증가하면 코드 증가

		Walkable.letThemWork(p10a);

		Person10[] p10b = new Person10[3];
		p10b[0] = new Person10();
		// p10b[1] = new Duck10(); // 컴파일 오류
		// Person10 타입 배열에 Duck 타입 클래스 저장 시도
		p10b[2] = new Person10();

		// 첫번째 시도 - Object 배열 사용
		Object[] obj = new Object[3];
		obj[0] = new Person10();
		obj[1] = new Duck10();
		obj[2] = new Person10();

		// Walkable.letThemWork((Person10[]) obj);
		// 어느정도 진행은 되지만 근본적인 해결은 안됨

		// 두번째 해결방법 - Walkable에 메서드 추가
		// letThemWork(Duck10[] list)

		// 세번째 해결방법 - 상속
		// MoveObject (walk) = Person, Duck
		// 만일 Fish, Bird 라는 객체를 추가하면?

		// 최종 해결책 - 인터페이스
		Walkables wk; // 인터페이스 변수 선언
		// new Walkabloes(); // 객체화 X

		Person12 p12 = new Person12();
		Duck12 d12 = new Duck12();
		// 인터페이스를 구현한 클래스

		Walkables wk1 = new Person12();
		Walkables wk2 = new Duck12();
		// Person12, Duck12는
		// Walkables를 구현한 클래스이므로
		// upcasting이 가능 - 상속에서 형변환과 동일

		wk1.walk();
		wk2.walk();

		Walkables[] wks = new Walkables[3];
		wks[0] = new Person12();
		wks[1] = new Duck12();
		wks[2] = new Cat12();

		Walkable.letThemWalk(wks);

		// 프린터 출력하기
		Printable p = new HPPrinter();
		p.print();

		p = new CannonPrinter();
		p.print();

		// 인터페이스 없이 출력
		HPPrinters hp = new HPPrinters();
		hp.speedyPrint();

		CannonPrinters cannon = new CannonPrinters();
		cannon.colorulprint();
	}

}

// 인터페이스 = 추상메서드 + 상수 로만 구성
interface Hello {
	int A = 1;

	void B();
}

class Person10 {
	public void work() {
		System.out.println("사람이 걸어요");
	}
}

class Duck10 {
	public void work() {
		System.out.println("오리가 걸어요");
	}
}

class Walkable { // 기능위주 클래스 : 메서드는 static으로 선언
	public static void letThemWork(Person10[] list) {
		for (Person10 p : list) {
			p.work();
		}
		// for(int i = 0; i < list.length; ++i) {
		// Person10 p = list[i];
		// p.work();
		// }
	}

	// 두번째 해결책 - 객체가 추가되면 메서드도 계속 추가
	public static void letThemWork(Duck10[] list) {
		for (Duck10 d : list) {
			d.work();
		}
	}

	// 인터페이스로 구현한 객체를 처리
	public static void letThemWalk(Walkables[] list) {
		for (Walkables w : list) {
			w.walk();
		}
	}
}

interface Walkables {
	void walk();
}

class Person12 implements Walkables {

	@Override
	public void walk() {
		System.out.println("사람이 걷는다");
	}

}

class Duck12 implements Walkables {

	@Override
	public void walk() {
		System.out.println("오리가 걷는다");
	}

}

class Cat12 implements Walkables {
	@Override
	public void walk() {
		System.out.println("고양이가 걷는다");
	}
}

// 윈도우에서 프린터를 제대로 사용할 수 있으려면
// Printable 이라는 인터페이스를 만들어
// 각 제조사에게 배포하고 그것을 토대로
// 프린터 드라이버를 작성하게 함

// 윈도우(제공자)가 제시하는 계약(인터페이스)에 따라
// 제조사(사용자)는 그것에 따라 코드를 작성(계약이행)
interface Printable {
	void print();
}

class HPPrinter implements Printable {
	public void print() {
		System.out.println("HP 프린터로 출력합니다.");
	}
}

class CannonPrinter implements Printable {
	public void print() {
		System.out.println("Cannon 프린터로 출력합니다.");
	}
}

// 인터페이스를 사용하지 않는 경우
class CannonPrinters {
	public void colorulprint() {
		System.out.println("칼라풀하게 출력");
	}
}

class HPPrinters {
	public void speedyPrint() {
		System.out.println("최강속도로 출력");
	}
}