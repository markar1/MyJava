package jaesung.sample;

public class Starcraft {

	public static void main(String[] args) {

	}

}

// class Marine {
// int x, y;
//
// void move(int x, int y) { // x,y만큼 이동
// }
//
// void stop() {
// }
//
// void attack() {
// }
//
// void stimPack() {
// }
// }
//
// class Tank {
// int x, y;
//
// void move(int x, int y) { // x*2, y*2만큼 이동
// }
//
// void stop() {
// }
//
// void attack() {
// }
//
// void changeMode() {
// }
// }
//
// class Dropship {
// int x, y;
//
// void move(int x, int y) { // x*10, y*10 만큼 이동
// }
//
// void stop() {
// }
//
// void load() {
// }
//
// void unload() {
// }
//
// }

// 추상클래스
abstract class Unit {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
	};
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		System.out.println("머린은 1m 이동했다!");
	}
	
	public static void stimPack() {
		System.out.println("머린은 5초동안 5배 공격력을 갖는다.");
	}
}

class Tank extends Unit{

	@Override
	void move(int x, int y) {
		System.out.println("시즈탱크는 5m 이동했다!");
	}
	public static void chagneMode() {
		System.out.println("공격범위가 10m, 10배 공격력을 갖는다");
	}
	
}

class Dropship extends Unit{
	@Override
	void move(int x, int y) {
		System.out.println("드랍쉽은 10m 이동했다!");
	}
	public static void load() {
		System.out.println("드랍쉽이 유닛을 태웠다");
	}
	public static void unload() {
		System.out.println("드랍쉽이 유닛을 내렸다");
	}
}