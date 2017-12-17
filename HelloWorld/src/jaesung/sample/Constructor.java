package jaesung.sample;

public class Constructor {

	public static void main(String[] args) {
		Human3 person = new Human3();
		// 생성자를 통해 멤버변수에 값을 초기화했음
		System.out.println(person.name);
		System.out.println(person.age);

		Human3 p1 = new Human3(); // 영희, 10
		Human3 p2 = new Human3("철수"); // 철수, 10
		Human3 p3 = new Human3(20); // 영희, 20
		Human3 p4 = new Human3("혜교", 25); // 혜교, 25

		// 접근제어
		// Human3읜 멤버는 default 접근제어 적용
		// 패키지 내 클래스에서 접근 가능
		p1.name = "수지";
		p1.age = 22;

		// Human5의 멤버는 private로 선언
		// 따라서, Human5에 선언된 변수는
		// Constructor 에서는 볼 수 없음
		Human5 p5 = new Human5();
		// p5.name = "지현";
		// p5.age = 22;

		// Human6의 멤버는 public로 선언
		Human6 p6 = new Human6();
		p6.name = "지현";
		p6.age = 35;

		// private으로 선언된 멤버변수에 접근하려면?
		// setter/getter 메서드를 사용
		// setXxxx변수명() / getXxxx변수명() : Xxxx는 변수명

	}

}

class Human3 {
	String name;
	int age;

	// 생성자
	public Human3() {
		name = "영희";
		age = 10;
	}

	// 또 다른 유형의 생성자
	public Human3(String pname) {
		name = pname;
	}

	public Human3(int age) {
		this.age = age;
	}

	public Human3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 생성자를 여러 형태로 정의하는 것을
	// 생성자 다중정의(overloading)라 함

}

class CallConstruct {
	String msg;

	public CallConstruct() {
		this("테스트"); // 생성자 관련 코드는 언제나 맨 첫줄에!
		// msg = "테스트";
		// Callconstruct("테스트"); // 오류!
	}

	public CallConstruct(String msg) {
		this.msg = msg;
	}

}

// this() 를 이용해서 생성자 재작성하기
class Human4 {
	String name;
	int age;

	public Human4() {
		this("재성", 100);
	}

	public Human4(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human4(String name) {
		this(name, 99);
	}

	public Human4(int age) {
		this("혜교", age);
	}

}

class Human5 {
	private String name;
	private int age;
}

class Human6 {
	public String name;
	public int age;

}