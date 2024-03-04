package t2_array;

import java.util.Date;
import java.util.Scanner;

// ctrl + shift + o : import 단축키
public class Test6_3 {
	public static void main(String[] args) {
		Date now = new Date();

		System.out.println("now : " + now);
		// 윈도우에서 제공하는 기본 날짜 포맷으로 출력됨

		Scanner sc = new Scanner(System.in);
		String yn = "";

		System.out.print("계속할까요?(Yes/No) ");
		yn = sc.next();
		System.out.println("입력된 문자 : " + yn);

		for (int i = 0; i < yn.length(); i++) {
			if(yn.equals("Y")) {
				System.out.println("입력된 문자는 Y입니다.");
			} else {
				System.out.println("입력된 문자는 Y가 아닙니다.");
			}
		}
		sc.close();

	}
}
