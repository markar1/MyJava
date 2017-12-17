package jaesung.sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileReadStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 스트림 형태로 파일에 기록된 객체 읽어오기
		String fpath = "c:/java/users.dat";

		FileInputStream fis = new FileInputStream(fpath);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Users u = (Users) ois.readObject();

		System.out.println(u.getName());
		System.out.println(u.getUserid());
		System.out.println(u.getPasswd());
		System.out.println(u.getAge());

		ois.close();
		fis.close();
	}

}
