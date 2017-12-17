package jaesung.sample;

import java.util.Date;
import java.util.Random;

public class Methods {

	public static void main(String[] args) {
		printPoem();

		System.out.println(add(10, 16));

		// 메서드 사용하기
		sayhello();
		sayhello2();
		sayhello3("안녕하세요. 자바!!");
		sayhello3("안녕하세요. C#!!!");

		System.out.println(sayhello4("안녕하세요. 파이썬!"));
		String hello = sayhello4("안녕하세요. 파이썬!");
		hello += "\n 작성일 : 2017.11.26";
		System.out.println(hello);

		// Date 클래스는 deprecate 예정이라 메서드에 취소선 표시
		Date today = sayhello5();
		System.out.println(today);
		System.out.println(today.getYear() + 1900);
		System.out.println(today.getMonth() + 1);
		System.out.println(today.getDate());
		System.out.println(today.getHours());
		System.out.println(today.getMinutes());
		System.out.println(today.getSeconds());

		Lotto645();

	}

	// 메서드 선언
	// 어떤 기능을 하는 문잘들을 블록으로 정의하고
	// 그것에 이름을 붙인 것
	// 가독성과 코드 재사용성을 높이기 위해 사용

	// 접근수정자 반환값 메서드이름(매개변수목록) {
	// 메서드를 구성하는 문장
	// }
	public static void printPoem() { // 코드 블럭화
		System.out.println("기이한 복받치는 감정을 느꼈네");
		System.out.println("그리고 감히 그것을 말하겠네");
		System.out.println("하지만, 연인의 귀에만 하겠네");
		System.out.println("내게 전에 일어났던 것을");

	}

	// 두개의 정수를 입력받아 합을 구하고 결과를 반환
	public static int add(int num1, int num2) {

		int sum/* , num1, num2 */;
		sum = num1 + num2;

		return sum;
	}

	// 메서드 정의하기 #1 - 매개변수 x, 반환값 x
	public static void sayhello() {
		System.out.println("Hello, Java!!");
	}

	// Hello, C#!!! 이라는 메세지를 출력하는 sayhello2 메서드
	public static void sayhello2() {
		System.out.println("Hello, C#!!!");
	}

	// 메서드 정의하기 #2 - 매개변수 o, 반환값 x
	public static void sayhello3(String msg) {
		System.out.println(msg);
	}

	// 메서드 정의하기 #3 - 매개변수 o, 반환값 o
	public static String sayhello4(String msg) {
		return msg;
	}

	// 메서드 정의하기 #4 - 매개변수 x, 반환값o
	public static Date sayhello5() {
		// 현재 시간을 계싼해서 출력
		return new Date();
	}

	// 로또 생성기를 메서드로 구현 - Lotto645
	public static void Lotto645() {
		Random r = new Random();

		int key1, key2, key3, key4, key5, key6;

		key1 = r.nextInt(45) + 1;
		key2 = r.nextInt(45) + 1;
		key3 = r.nextInt(45) + 1;
		key4 = r.nextInt(45) + 1;
		key5 = r.nextInt(45) + 1;
		key6 = r.nextInt(45) + 1;

		System.out.printf("%d %d %d %d %d %d\n", key1, key2, key3, key4, key5, key6);
		System.out.printf("%d %d %d %d %d %d\n", key1, key2, key3, key4, key5, key6);
		System.out.printf("%d %d %d %d %d %d\n", key1, key2, key3, key4, key5, key6);
		System.out.printf("%d %d %d %d %d %d\n", key1, key2, key3, key4, key5, key6);
		System.out.printf("%d %d %d %d %d %d\n", key1, key2, key3, key4, key5, key6);
	}

}
