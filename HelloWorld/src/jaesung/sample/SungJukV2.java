package jaesung.sample;

import java.util.Scanner;

/*
*	Scanner 클래스를 이용해서
*	이름, 국어, 영어, 수학을 입력받아서
*	총점, 평균, 학점 계산 후 출력
*
*/
public class SungJukV2 {

	public static void main(String[] args) {
		// 변수선언
		String name;
		int kor, eng, mat, tot;
		double avg;
		char grd;

		// 성적 입력 받기
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("이름을 입력하세요.");
			name = sc.next();

			System.out.println("국어성적을 입력하세요.");
			kor = sc.nextInt();

			System.out.println("수학성적을 입력하세요.");
			mat = sc.nextInt();

			System.out.println("영어성적을 입력하세요.");
			eng = sc.nextInt();

			sc.close();
			// 총점,평균, 학점 계산
			tot = kor + eng + mat;
			avg = tot / 3.0;

			switch ((int) avg / 10) {
			case 10:
			case 9:
				grd = '수';
				break;
			case 8:
				grd = '우';
				break;
			case 7:
				grd = '미';
				break;
			case 6:
				grd = '양';
				break;
			default:
				grd = '가';
				break;
			}

			// 결과 출력
			System.out.printf("%s 의 총점은 %d, 평균은 %.2f, 학점은 %s 입니다.", name, tot, avg, grd);
		} while (kor <= 100 && eng <= 100 && mat <= 100 && avg <= 0);

	}
}
