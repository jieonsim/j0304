package ex;

import java.util.Scanner;

/*
 가위/바위/보 게임
컴퓨터에게 랜덤하게 '가위/바위/보'중의 하나를 기억시켜놓고,
사용자가 '가위/바위/보'중에서 하나를 입력하면, 누가 이겼는지를 출력처리한다.
(단, '그만'을 입력하면 프로그램을 종료처리한다)
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("가위, 바위, 보 중에 하나를 입력하세요('그만'을 입력하면 종료됩니다) : ");
			String userInput = sc.nextLine();

			if (userInput.equals("그만")) {
				System.out.println("프로그램 종료");
				break;
			}

			int randomNumber = (int) (Math.random() * 3);
			String[] rockPaperScissors = { "가위", "바위", "보" };
			String computerChoice = rockPaperScissors[randomNumber];

			if (userInput.equals(computerChoice)) {
				System.out.println("비겼습니다.");
			} else if ((userInput.equals("가위")) && (computerChoice.equals("보"))
					|| (userInput.equals("바위")) && (computerChoice.equals("가위"))
					|| (userInput.equals("보")) && (computerChoice.equals("주먹"))) {
				System.out.println("컴퓨터 : " + computerChoice + " | 사용자 : " + userInput + "\n사용자가 이겼습니다.");
			} else {
				System.out.println("컴퓨터 : " + computerChoice + " | 사용자 : " + userInput + "\n컴퓨터가 이겼습니다.");
			}
		}
		sc.close();
	}
}
