package jaesung.sample;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		// 학생 1명
		// name, kor, eng, mat

		// 학생 3명
		// name1, kor1, eng1, mat1
		// name2, kor2, eng2, mat2
		// name3, kor3, eng3, mat3

		// 배열선언
		String[] name;
		int[] kor, eng, mat;

		// 배열의 크기는 상수(final)로 정의 가능
		final int TSIZE = 3; // 상수 선언
		int[] tot = new int[TSIZE];
		double[] avg = new double[TSIZE];
		char[] grd = new char[TSIZE];

		// String name;
		// name = "재성"; // 오류! - 데이터가 저장될 공간을 확보하지 않음
		// name = new String90;
		// naem = "재성";

		// 배열은 참조형이며 객체이므로
		// 변수 선언시 new 연산자로 메모리 영역을 생성해야 함
		name = new String[3]; // 3명의 이름을 저장할 공간 생성
		kor = new int[3];
		eng = new int[3];
		mat = new int[3];

		// 배열에 데이터 저장
		name[0] = "재성"; // 첫번째 name 요소
		name[1] = "준영";
		name[2] = "민재";

		kor[0] = 100;
		kor[1] = 99;
		kor[2] = 98;

		eng[0] = 98;
		eng[1] = 99;
		eng[2] = 100;

		mat[0] = 99;
		mat[1] = 100;
		mat[2] = 98;

		// 배열의 크기 알아보기 : length
		System.out.println(name.length);
		System.out.println(kor.length);
		System.out.println(eng.length);
		System.out.println(mat.length);

		// int[] age = null;
		// int age_size = age.length;
		// new 연산자를 사용하지 않은 상태에서는
		// 배열의 크기 length는 알 수 없다.

		// 배열 내 데이터 출력
		System.out.println("학생 #1 : " + name[0]);
		System.out.println("학생 #2 : " + name[1]);
		System.out.println("학생 #3 : " + name[2]);

		for (int i = 0; i <= 2; i++) {
			System.out.printf("국어 점수는 %d 입니다.\n", kor[i]);
		}
		for (int i = 0; i < mat.length; i++) {
			System.out.printf("수학 점수는 %d 입니다.\n", mat[i]);
		}
		/*
		 * for (int i = 0; i <= eng.length - 1; i++) {
		 * System.out.printf("영어 점수는 %d 입니다.\n", eng[i]); }
		 */
		for (int i = 0; i <= TSIZE - 1; i++) {
			System.out.printf("%s 학생의 국어 점수 : %d, 수학 점수 : %d, 영어 점수 : %d 입니다.\n", name[i], kor[i], mat[i], eng[i]);
		}

		// 배열 초기화
		// 배열 생성시 자동적으로 서언시 타입과 동일하게
		// 기본 값이 초기화된다.
		// int, double - 0
		// boolean - false
		// String -
		// 클래스 -

		int[] intArray = new int[3];
		boolean[] boolArray = new boolean[2];
		String[] strArray = new String[2];
		Person[] person = new Person[100];

		System.out.println("숫자배열 기본값 : " + intArray[0]);
		System.out.println("논리배열 기본값 : " + boolArray[0]);
		System.out.println("문자배열 기본값 : " + strArray[0]);
		System.out.println("??배열 기본값 : " + person[0]);

		// 명시적 배열 초기화
		String[] userid;
		userid = new String[] { "abc12", "xyz987", "java" };

		String[] passwd = { "123456", "987654", "qweasd", };

		// 배열의 index가 실제 배열크기보다 크면?
		// 오류발생! - java.lang.ArrayIndexOutOfBoundsException
		// System.out.println(passwd[5]);

		// 배열의 단점
		// 배열의 크기가 한번 결정되면 나중에 크기변경 불가
		// 만일, 변경하고 싶다면, 배열을 복사해서 처리

		int[] number = new int[100];
		number[99] = 99999;
		// number[100] = 1000000; // 오류!

		number = new int[1000];

		// 로또 생성기 - 배열x
		// 1 ~ 45 사이 6개의 임의의 숫자 추출
		// 중복 불가
		int key1, key2, key3, key4, key5, key6;
		System.out.println(Math.random());
		Random r = new Random(); // 난수 발생시킬 때

		System.out.println(r.nextInt());
		System.out.println(r.nextInt(45)); // 0 ~ 44
		System.out.println(r.nextInt(45) + 1); // 1 ~ 45

		key1 = r.nextInt(45) + 1;
		key2 = r.nextInt(45) + 1;
		key3 = r.nextInt(45) + 1;
		key4 = r.nextInt(45) + 1;
		key5 = r.nextInt(45) + 1;
		key6 = r.nextInt(45) + 1;

		System.out.printf("%d %d %d %d %d %d ", key1, key2, key3, key4, key5, key6);
		// 중복된 수가 나올 수 있다.

		// 로또 생성기 - 배열O

	}

}

class Person {

}