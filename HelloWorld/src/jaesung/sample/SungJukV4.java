package jaesung.sample;

public class SungJukV4 {
	String name;
	int kor, mat, eng;

	private int tot;
	private double avg;
	private char grd;

	public SungJukV4() {
		this("혜교", 99, 98, 99);
		// name = "혜교";
		// kor = 99;
		// mat = 98;
		// eng = 99;
	}

	public SungJukV4(String name, int kor, int mat, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}

}
