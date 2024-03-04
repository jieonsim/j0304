package ex;

/*
3,6,9 게임
1~100까지의 수를 차례로 출력하되 3, 6, 9 자리는 숫자가 아닌, '짝'이라는 문자로 대치하시오.

1 2 짝 4 5 짝 7 8 짝 10 
11 12 짝 14 15 짝 17 18 짝 20 
21 22 짝 24 25 짝 27 28 짝 짝 
짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40
41 42 짝 44 45 짝 47 48 짝 50 
51 52 짝 54 55 56 57 58 59 짝 
짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 70 
71 72 짝 74 75 짝 77 78 짝 80 
81 82 짝 84 85 86 87 88 짝 짝
짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 100 

 */
public class Test1 {
	public static void main(String[] args) {
		int[][] numbers = new int[10][10];

		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				cnt++;
				numbers[i][j] = cnt;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
}