package jaesung.sample;

public class DataTpye {
	public static void main(String[] args) {
		// 기본자료형 Primitive
		// 정수 : int
		int int1 = 21;
		int int2 = 021; // 8진수를 의미하는 접두사 0
		int int3 = 0;
		int int4 = 00; // 8진수
		int int5 = 0x123; // 16진수를 의미하는 접두사 x
		int int6 = 0x10;
		int int7 = 0xdecafe;
		int int8 = 0x1a2b;
		int int9 = 0b10101; // 2진수를 의마하는 접두사 b
		int int10 = 0b10;
		int int11 = 0b00000010;
		int int12 = 51966;
		int int13 = 01453576;
		int int14 = 0xCAFE;
		int int15 = 0b1100101011111110;

		int int16 = Integer.MAX_VALUE; // 상수
		int int17 = Integer.MIN_VALUE;

		int a;
		final int B;
		a = 1;
		a = 2;
		a = 3;

		B = 1;
		// B = 2; // 상수이므로 값변경 불가

		// long
		long long1 = 0L; // long으로 저장하려면 접미사 L
		long long2 = 401L;
		long long3 = -3556L;
		long long4 = 89898L;
		long long5 = -105L;
		long long6 = 25L;
		long long7 = 031L;
		long long8 = 0X19L;
		long long9 = 0b11001L;
		// long long10 = 12345678912345678912L; // 범위초과

		int int18 = 10;
		long long11 = 20;
		long11 = int18; // long(64bit) 변수에 int(32bit)값 저장
						// 자동형확대 변환
		int int19 = 10;
		long long12 = 2147483655L;
		// int19 = long12; // int(32bit) 변수에 long(64bit)값 저장
		// 축소형변환 - 불가 (데이터손실)

		int int20 = 5;
		long long13 = 25L; // 접미사가 붙던 안붙던 불가
		// int20 = long13; // 불가

		int18 = (int) long11; // 명시적 형변환
								// (변환타입) : cast 연산자
		int20 = (int) long12;

		long longmax = Long.MAX_VALUE;
		long longmin = Long.MIN_VALUE;

		// byte
		byte bytemax = Byte.MAX_VALUE;
		byte bytemin = Byte.MIN_VALUE;

		// short
		short shortmax = Short.MAX_VALUE;
		short shortmin = Short.MIN_VALUE;

		// char
		// 문자 하나 저장, ' ' 를 사용
		char char1 = 'A';
		char char2 = 'a';
		char char3 = '5';
		char char4 = '수';
		char char5 = '?';

		// escape sequence
		// 문자 리터럴로 처리하지 않고
		// 문자 그대로 처리하고 싶을 때 사용
		char char6 = '/';
		char char7 = '\\'; // \를 표기
		char char8 = '\n'; // 줄바꿈
		char char9 = '\r'; // 라인피드
		char char10 = '\b'; // beep
		char char11 = '\t'; // 탭문자
		char char12 = '\''; // 작은 따옴표
		char char13 = '\"'; // 큰 따옴표

		// unicode
		// 다국어를 표기하기 위한 문자집합
		char char14 = '\u0041';
		char char15 = '\uAC00';

		// byte and char
		byte byte123 = 10;
		short short123 = 15;
		int int123 = 150;
		long long123 = 20L;
		char char123 = 'A';

		// byte123 = char123; // 형변환 오류
		byte123 = (byte) char123;
		// char123 = short123; // 형변환 오류
		char123 = (char) short123;

		int123 = char123;
		int123 = (int) char123;

		char charmax = Character.MAX_VALUE;
		char charmin = Character.MIN_VALUE;

		int int100 = 65;
		char char100 = 'A';
		// 아스키코드 0 - 9 : 48 - 57
		// 아스키코드 a - z : 97 - 122
		// 아스키코드 A - Z : 65 - 90

		// boolean - 논리값 저장 (true, false만 입력가능)
		boolean bool1 = true;
		boolean bool2 = false;
		// boolean bool3 = 123;
		// boolean bool4 = 'a';

		// float (정밀도에 주의)
		// float 형 리터럴 선언시 접미사 f, F(추천!)
		float float1 = 296 / 3.0f;
		float float2 = 8F;
		float float3 = 8.F;
		float float4 = 8.0F;
		float float5 = 3.14F;

		float floatmax = Float.MAX_VALUE;
		float floatmin = Float.MIN_VALUE;
		float floatInf = Float.POSITIVE_INFINITY;
		float floatNaN = Float.NaN;

		// double (정밀도에 주의)
		// double 형 리터럴 선언시 접미사 d, D(추천!)
		double double1 = 296 / 3.0;
		double double2 = 8D;
		double double3 = 8;
		double double4 = 8.0;
		double double5 = 8.0D;
		double double6 = 78.9867;

		double doublemax = Double.MAX_VALUE;
		double doublemin = Double.MIN_VALUE;
		double doubleInf = Double.POSITIVE_INFINITY;
		double doubleNaN = Double.NaN;

		// underscore
		// 숫자 표기시 자릿수를 나타내기 위해 사용
		// JDK 7 이상부터 지원하기 시작
		int x1 = 1_234;
		int x2 = 1__234;

		// int y1 = _1234; _로 시작하면 오류
		// int y2 = 1234_; _로 끝나면 오류

		System.out.println("int1 = " + int1);
		System.out.println("int2 = " + int2);
		System.out.println("int3 = " + int3);
		System.out.println("int4 = " + int4);
		System.out.println("int5 = " + int5);
		System.out.println("int6 = " + int6);
		System.out.println("int7 = " + int7);
		System.out.println("int8 = " + int8);
		System.out.println("int9 = " + int9);
		System.out.println("int10 = " + int10);
		System.out.println("int11 = " + int11);
		System.out.println("int12 = " + int12);
		System.out.println("int13 = " + int13);
		System.out.println("int14 = " + int14);
		System.out.println("int15 = " + int15);
		System.out.println("정수최대 = " + int16);
		System.out.println("정수최소 = " + int17);

		System.out.println("long1 = " + long1);
		System.out.println("long2 = " + long2);
		System.out.println("long3 = " + long3);
		System.out.println("long4 = " + long4);
		System.out.println("long5 = " + long5);
		System.out.println("long6 = " + long6);
		System.out.println("long7 = " + long7);
		System.out.println("long8 = " + long8);
		System.out.println("long9 = " + long9);

		System.out.println("형태변환int = " + int18);
		System.out.println("형태변환long = " + long11);
		System.out.println("long최대 = " + longmax);
		System.out.println("long최소 = " + longmin);
		System.out.println("byte최대 = " + bytemax);
		System.out.println("byte최소 = " + bytemin);
		System.out.println("short최대 = " + shortmax);
		System.out.println("short최소 = " + shortmin);

		System.out.println("줄바꿈\n\n\n\n\n");
		System.out.println("탭\t탭\t탭\t탭\t탭\t탭");
		System.out.println("u0041 = " + char14);
		System.out.println("uAC00 = " + char15);
		System.out.println("char최대 = " + charmax);
		System.out.println("char최소 = " + charmin);
		System.out.println("char최대 = " + (int) charmax);
		System.out.println("char최소 = " + (int) charmin);

		System.out.println("A의 int는? = " + (int) char100);
		System.out.println("65의 char는? = " + (char) int100);
		System.out.println("bool1은? " + bool1);
		System.out.println("bool2은? " + bool2);

		System.out.println("F계산 값은? " + float1);
		System.out.println("D계산 값은? " + double1);
		System.out.println(float2);
		System.out.println(float3);
		System.out.println(float4);
		System.out.println(float5);
		System.out.println(floatmax);
		System.out.println(floatmin);
		System.out.println(floatInf);
		System.out.println(floatNaN);

		System.out.println(double2);
		System.out.println(double3);
		System.out.println(double4);
		System.out.println(double5);
		System.out.println(double6);
		System.out.println(doublemax);
		System.out.println(doublemin);
		System.out.println(doubleInf);
		System.out.println(doubleNaN);
		System.out.println(x1);
		System.out.println(x2);

		// System.out.print('A', +6.5);
		System.out.printf("296/3의 float = %f\n", float1);
		System.out.printf("296/3의 float = %10f\n", float1);
		System.out.printf("296/3의 float = %.2f\n", float1);

	}
}
