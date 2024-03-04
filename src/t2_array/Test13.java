package t2_array;

import java.util.Scanner;

// 2차원 배열에 입력된 값 주입하기
// 입력 자료 : 세 학생의 번호, 국어, 영어, 수학 점수가 입력된다. 입력된 값들을 모두 출력하시오
public class Test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][4]; // 3명의 학생의 1번호 2국어 3영어 4수학 점수
		String[] scores = { "번호", "국어", "영어", "수학" };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < scores.length; j++) {
				System.out.print((i + 1) + "번 자료 " + scores[j] + "를 입력하세요(종료:999) : ");
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("* 출력 자료 *");
		System.out.println("번호\t국어\t영어\t수학");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < scores.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
