package t2_array;

public class Test6_1 {
	public static void main(String[] args) {
		char[] strArray = { 'k', 'o', 'r', 'e', 'a' };
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		
		System.out.println(strArray);
		// char 타입 배열은 스트링 클래스가 된 것처럼 실행하면 문자열이 된다 . (출력결과 : korea)
	}
}
