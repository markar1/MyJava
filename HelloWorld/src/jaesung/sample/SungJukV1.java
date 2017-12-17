package jaesung.sample;

/*
성적처리프로그램 v1
이름, 국어, 영어, 수학 점수에 대한
총점, 평규늘 계산하고 출력
 * 작성일 : 2017. 11. 12
 * */

public class SungJukV1 {
	public static void main(String[] args) {
		// 변수선언
		String name;
		int kor;
		int eng;
		int mat;
		int tot;
		double avg;

		// 성적처리
		// 변수 값 대입
		name = "이재성";
		kor = 99;
		eng = 99;
		mat = 100;
		tot = kor + eng + mat;
		avg = tot / 3d;

		// 결과 출력
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(tot);
		System.out.println(avg);

	}
}
