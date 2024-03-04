package t2_array;

import java.util.Arrays;

public class Test6_2 {
	public static void main(String[] args) {
		char[] strArray = { 'k', 'o', 'r', 'e', 'a' };

		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		System.out.println();

		System.out.println(strArray);
		// char 타입 배열은 스트링 클래스가 된 것처럼 실행하면 문자열이 된다 . (출력결과 : korea)

		System.out.println("===================");

		System.out.println("strArray의 길이 : " + strArray.length);
		System.out.println();

		System.out.println("strArrary을 문자로 변환 : " + Arrays.toString(strArray));
		System.out.println();
		// 문자 배열을 문자열 배열로 처리해주는 메소드 Arrays.toString()

		for (int i = 0; i < strArray.length; i++) {
			System.out.println("strArray[" + i + "] = " + strArray[i]);
		}

		System.out.println();

		String str = "korea";
		// 현재 문자열 중에서 특정 인덱스에 위치한 문자를 반환? charAt()
		// 문자열을 문자 배열로는 못바꾸지만 문자 배열처럼 한개씩 꺼내기 위한 메소드 : charAt()
		// 한글자만 꺼내서 비교할 때 charAt을 많이 씀
		for (int i = 0; i < str.length(); i++) {
			System.out.println("str(" + i + ") = " + str.charAt(i));
		}

	}
}
