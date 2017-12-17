package jaesung.sample;

public interface SungJukV6Impl {

	// 성적처리에 대한 기본 뼈대
	// 총점total, 평균average, 학점grade

	// JDK8부터 인터페이스에 static 추가 가능
	// 람다식을 추하가면서 설계 변경이 이유
	void Total(SungJukV6VO sj);

	void Average(SungJukV6VO sj);

	void Grade(SungJukV6VO sj);

	// 공유 목적으로 만드는 메서드
	static void sharedTotal(SungJukV6VO sj) {
	};

	static void sharedAverage(SungJukV6VO sj) {
	};

	static void sharedGrade(SungJukV6VO sj) {
	};
}
