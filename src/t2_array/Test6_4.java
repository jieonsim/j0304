package t2_array;

import java.util.Date;
import java.util.Scanner;

// ctrl + shift + o : import 단축키
public class Test6_4 {
	public static void main(String[] args) {
		Date now = new Date();

		System.out.println("now : " + now);
		// 윈도우에서 제공하는 기본 날짜 포맷으로 출력됨

		Scanner sc = new Scanner(System.in);
		String yn = "";

		System.out.print("계속할까요?(Yes/No) ");
		yn = sc.next();
		System.out.println("입력된 문자 : " + yn);

		// 문자 charAt는 == 로 비교해야하고, 문자열은 equals()으로 비교해야 함
		for (int i = 0; i < yn.length(); i++) {
			if(yn.charAt(i) == 'Y') {
				System.out.println("입력된 문자 중 Y가 있습니다.");
			} else {
				System.out.println("입력된 문자 중 Y가 없습니다.");
			}
		}
		sc.close();

	}
}
