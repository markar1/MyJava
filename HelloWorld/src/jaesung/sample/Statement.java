package jaesung.sample;

import java.util.Scanner;

public class Statement {

	public static void main(String[] args) {
		; // 빈문장

		{ // 블록 시작
			String name;
			int kor;
			int mat;
			int eng;
		} // 블록 끝

		// 문장의 개념 (;으로 끝남)
		int num; // 선언문
		int num2 = 100; // 선언 및 초기화
		String str; // 선언

		// 99 + 98 + 99; // 표현식만으로는 문장성립X
		// 99 + 98 + 99 // 표현식
		num = 99 + 98 + 99;
		++num; // num = num + 1
		System.out.println(num); // 출력문

		{
		} // 빈 블록

		// 변수의 유효범위
		// 블록 내 선언한 변수는 기본적으로 지역변수
		// 지역변수는 해당 블록을 벗어나면 사용불가
		// 변수의 유효범위scope를 주의함
		{
			int int1 = 20; // 블록 내 변수선언
			++int1; // 사용
		}

		int int2; // 블록 밖 변수선언
		{
			int2 = 55; // 사용
		}

		{
			int int3 = 10;
			{
				int3 = 45;
				int int4 = 50;
				int4 = 90;
			}
			// int4 사용가능?
			// int4 = 100; 내부에서 선언된 것은 사용불가
			int int4;
		}

		// 조건문
		int num1 = 3;
		if (num1 > 0) { // 조건식의 결과가 참이면
			System.out.println("0보다 큼");
		}

		if (num1 > 0) {

		} else { // 조건식의 결과가 참이 아니면
			System.out.println("0영보다 작음");
		}

		// 짝수인지 아닌지 조건문
		int A = 7;
		if (A % 2 == 0) {
			System.out.printf("%d는 짝수입니다.\n", A);
		} else {
			System.out.printf("%d는 홀수입니다.\n", A);
		}

		// 5의 배수인지 여부 확인 조건문
		int B = 18;
		if (B % 5 == 0) {
			System.out.printf("%d는 5의 배수 입니다.\n", B);
		} else {
			System.out.printf("%d는 5의 배수가 아닙니다.\n", B);
		}

		// 제어문에서 조건문의 중요성
		if (true) {
			;
			;
		} else
			; // 문장이 하나인 경우 { } 는 생략가능

		// 중첩 if문
		int num0 = 55;
		if (num0 % 5 == 0) {
			System.out.println("5배수");
			if (num0 % 10 == 0) {
				System.out.println("10배수");
			} else {
				System.out.println("10배수 아님");
			}
		}

		// 아이디 비밀번호 체크
		// 아이디/비번 일치 - 로그인 성공!
		// 아이디/비번 불일치 - 로그인 실패!
		// 아이디 : apple, 비밀번호 : java
		// userid == "apple" (x)
		// userid.equals("apple") (O)
		String userid = "ididid";
		String passwd = "pwpwpw";

		// 중첩 if
		if (userid.equals("apple")) {
			if (passwd.equals("java")) {
				System.out.printf("로그인 성공!\n");
			} else {
				System.out.printf("로그인 실패! - 비밀번호 틀림\n");
			}
		} else {
			System.out.printf("로그인 실패! - 아이디 틀림\n");
		}

		// 논리 연산자
		if (userid.equals("apple") && passwd.equals("java")) {
			System.out.printf("로그인 성공!\n");
		} else {
			System.out.printf("로그인 실패!\n");
		}

		// 애매모호한 if문
		if (num % 5 == 0)
			if (num % 2 == 0)
				System.out.println("5배수 & 2배수");
			else
				System.out.println("5배수 아님");

		if (num % 5 == 0) {
			if (num % 2 == 0)
				System.out.println("5배수 & 2배수");
		} else {
			System.out.println("5배수 아님");
		}

		// 학점 계산
		// 평균 90 이상 : A
		// 평균 80 이상 : B
		// 평균 70 이상 : C
		// 평균 60 이상 : D
		// 기타 : F
		double avg = 95.4;
		char grd = 'F';
		if (avg >= 90) {
			grd = 'A';
		} else if (avg >= 80) {
			grd = 'B';
		} else if (avg >= 70) {
			grd = 'C';
		} else if (avg >= 60) {
			grd = 'D';
		} else {
			grd = 'F';
		}

		// switch : 다중 if문을 세련된 조건식으로 작성
		int num3 = 5;
		switch (num3 % 2) { // 수식의 결과값이 정수
		case 0:
			System.out.printf("%d은 2의 배수\n", num3);
			break; // 여기까지만 실행, switch문 밖으로 벗어남
		case 1:
			System.out.printf("%d은 2의 배수 아님\n", num3);
			break;
		}

		// double tmp = 1.1;
		// switch(tmp) {
		// } // swich문의 수식에 double은 사용불가

		String days = "월요일";
		switch (days) {
		case "월요일":
			System.out.println("출근하는 날...ㅠㅠ");
			break;
		case "금요일":
			System.out.println("불타는 금요일!!!");
			break;
		case "일요일":
			System.out.println("야구보는날~");
			break;
		}

		// 성적처리 switch
		avg = 95.1;
		grd = 'A';
		switch ((int) avg / 10) { // 정수 수식 또는 문자열 변수
		case 10:
		case 9:
			grd = 'A';
			break;
		case 8:
			grd = 'B';
			break;
		case 7:
			grd = 'C';
			break;
		case 6:
			grd = 'D';
			break;
		default:
			grd = 'F';
			break;
		}
		System.out.printf("학점 : %s \n", grd);

		// for문
		// 반복문 내에 변수명은 i,j,k,l,m을 사용
		for (int i = 1; i <= 10; ++i) { // 1부터 100까지 1씩 증가
			// 반복 실행할 코드
			System.out.println("선생님, 안녕하세요.");
		}

		// 1부터 100사이 짝수 출력
		for (int j = 2; j <= 100; j += 2) {
			System.out.println(j);
		}
		for (int j = 1; j <= 100; ++j) {
			if (j % 2 == 0)
				System.out.println(j);
		}
		// 1부터 500사이 5배수 출력
		for (int k = 5; k <= 500; k += 5) {
			System.out.println(k);
		}

		// 무한반복문 - 초기식,조건식,증감식을 ;으로 작성 시
		// for(;;) { ; }

		// 반복문에 break, continue 사용하기
		// 반복문 정상 종료 할 때 - 조건식이 거짓
		// 반복문 강제 종료 할 때 - break 사용
		// 반복문 일시적으로 건너뛸 때 - continue 사용

		for (int i = 0; i <= 100; ++i) {
			i = 999; // 반복실행 종료를 위한 문장
			System.out.println(i); // 출력?
		}

		for (int i = 0; i <= 100; ++i) {
			// break; // 아래문장 실행 안됨 - 오류!
			System.out.println(i); // 출력??
			// break; // 반복실행 강제중지
		}

		for (int i = 0; i <= 100; ++i) {
			// continue; // 아래문장 실행 안됨 - 오류!
			if (i % 3 != 0)
				continue;
			System.out.println(i); // 출력??
		}

		// 중첩 for문
		// 십구구단 중 5단 출력
		// 5 X 1 = 5
		// 5 X 2 = 10
		// 5 X 3 = 15
		// ... ...
		// 5 X 19 = 95
		for (int i = 1; i <= 19; ++i) {
			System.out.printf("5 X %d = %d\n", i, 5 * i);
		}

		// 십구구단 중 14,15,16단 출력
		// 14 X 1 = 14 15 X 1 = 15 16 X 1 = 16
		// 14 X 2 = 28 15 X 2 = 30 16 X 2 = 36
		// 14 X 3 = 42 15 X 3 = 45 16 X 3 = 48
		// ... ...
		// 14 X 19 = 266 15 X 19 = 285 16 X 19 = 304
		for (int i = 1; i <= 19; ++i) {
			System.out.printf(" 14 X %2d = %3d \t", i, 14 * i);
			System.out.printf(" 15 X %2d = %3d \t", i, 15 * i);
			System.out.printf(" 16 X %2d = %3d \n", i, 16 * i);
		}

		for (int j = 14; j <= 16; ++j) {
			for (int i = 1; i <= 19; ++i) {
				System.out.printf(" %2d X %2d = %3d \t", j, i, j * i);
			}
			System.out.println();
		}

		for (int i = 1; i <= 19; ++i) {
			for (int j = 2; j <= 19; ++j) {
				System.out.printf(" %2d X %2d = %3d \t", j, i, j * i);
			}
			System.out.println();
		}

		// for문으로 만들어보기
		// *
		// **
		// ***
		// ****
		// *****

		// *****
		// ****
		// **
		// *

		// while - 조건에 의해
		// while (true) { // 무한루프
		// System.out.println("안녕하세요!");
		// }

		// while(false) { // 실행할 수 없는 반복문
		// System.out.println("글이 보이나요?");
		// }

		// 1 ~ 100 출력
		int i = 1; // 초기화식
		while (i <= 100) { // 조건식
			System.out.println(i);
			++i; // 증감식
		}

		// 1 부터 100사이 홀수 출력
		int j = 1;
		while (j <= 100) {
			System.out.println(j);
			j += 2;
		}

		// 1000부터 1까지 7의 배수 출력
		int k = 1000;
		while (k >= 1) {
			if (k % 7 == 0)
				System.out.println(k);
			--k;
		} // 나머지 연산자

		k = 994;
		while (k >= 1) {
			if (k % 7 == 0)
				System.out.println(k);
			k -= 7;
		}

		// While문에서 break 사용
		// 1 ~ 100 사이 짝수 출력
		// 단, 82이 되면 반복문 종료

		int l = 2;
		while (l <= 100) {
			if (l > 82)
				break; // 강제종료
			System.out.println(l);
			l += 2;
		}

		// do-while : 반복문장을 먼저 실행하고 반복조건 검사
		// 1 ~ 100사이 홀수 출력
		int m = 1; // 초기화식
		do {
			System.out.println(m);
			m += 2; // 증감식
		} while (m <= 100); // 조건식

		// Scanner를 이용해서 외부 입력 처리
		Scanner sc = new Scanner(System.in);
		int month;
		do {
			System.out.println("월을 입력하세요.");
			month = sc.nextInt();

			if (month == 0) {
				System.out.println("do-while 종료");
				break;
			}

			System.out.printf("당신은 %d 월을 입력하셨네요!\n", month);
		} while (month > 1 || month < 12);
		sc.close(); // 키입력 종료 - 자원해제

	}
}
