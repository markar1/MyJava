package jaesung.sample;

/*
 * 파일이름 : primitive
 * 용도 : 간단한 변수 설정
 * 작성자 : 이재성
 * 작성일 : 2017. 11. 12
 * */
public class Primitive {
	public static void main(String[] args) {
		int num1 = 123; // 정수형 변수 선언
		int num2 = 1111;
		byte num3 = 0b1111; // 2진수 변수 선언 (접두사 0b)
		long jumin = 1234561234567L; // long을 의미하는 접미사 'L'

		int result = num1 + num2;
		System.out.println(result);

		result = num1 - num2;
		System.out.println(result);

		result = num1 * num2;
		System.out.println(result);

		result = num1 / num2;
		System.out.println(result);

		result = num1 % num2;
		System.out.println(result);

		System.out.println(jumin);

		System.out.println(num3);
	}
}
