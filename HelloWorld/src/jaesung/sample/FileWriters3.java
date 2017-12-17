package jaesung.sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters3 {

	public static void main(String[] args) throws IOException {
		// 객체를 파일에 써보자 - 문자 스트림
		//
		// 클래스에 대한 객체를 만들고 그것을 파일에 저장

		// 객체를 문자를 저장할 파일 지정
		String fpath = "c:/java/mydata2.txt";

		FileWriter fw = new FileWriter(fpath, true);
		BufferedWriter bw = new BufferedWriter(fw);

		SungJukV6DTO sj = new SungJukV6DTO("수지", 74, 65, 87);

		String line = sj.getName() + " / " + sj.getKor() + " / " + sj.getEng() + " / " + sj.getMat() + "\r\n";
		bw.write(line);

		bw.close();
		fw.close();
	}

}