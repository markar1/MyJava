package jaesung.sample;

public class Class2 {

	// 클래스 구성요소 5가지
	// 필드 (인스턴수/클래스 변수)
	// 메서드
	// 생성자
	// 인스턴스 초기화블록
	// static 초기화블록

	public static void main(String[] args) {
		Human2 tom = new Human2();
		tom.name = "톰";
		tom.age = "54";
		// tom.count = 12;
		// 클래스 변수이므로 사용법이 틀림
		Human2.count = 1;

		Human2 jane = new Human2();
		tom.name = "제인";
		tom.age = "30";
		Human2.count = 2;

		// null 비교
		// Human2 john; (x)
		Human2 john = null;
		// john.name = "존"; // 객체가 null인 상태에서
		// 인스턴스변수에 값을 지정
		// int num = null; // 기본 자료형에는 null 사용불가
		int num1;
		int num2 = 0;

		// 객체가 null인지 알아보자
		if (john == null) {
			System.out.println("객체가 생성되지 않았어요.");
		} else {

		}

		// 클래스 변수에 접근 : . 표기법 사용
		// 객체명.인스변수명

		john = new Human2();
		john.name = "존";
		john.age = "23";

		// 클래스 변수 다루기 = static으로 선언된 멤버변수
		// 클래스명.클래스변수명
		// john.count (x)
		Human2.count = 3;

		// 멤버변수 초기값 알아보기
		// 객체 생성 후 변수에는 기본값이 자동으로 초기화됨

		DefaultInt di = new DefaultInt();
		System.out.println(di.b);
		System.out.println(di.s);
		System.out.println(di.i);
		System.out.println(di.l);
		System.out.println(di.f);
		System.out.println(di.d);
		System.out.println(di.bool);
		System.out.println(di.str);
		System.out.println(di.jack);

	}

}

class Human2 {
	String name; // 인스턴스 변수
	String age;
	static int count; // 클래스 변수 (사람수)

}

class DefaultInt {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	String str;
	Human2 jack;
}