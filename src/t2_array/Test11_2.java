package t2_array;

/* 2차원 배열 (불규칙 저장)
 
    100  90  80  50
    80   50  90  100
    90  10  20  90
   100  10  20  30
 */
public class Test11_2 {
	public static void main(String[] args) {
		int[][] atom = 
			{ 
				{ 100, 90, 80, 50 }, 
				{ 80, 50, 90, 100 }, 
				{ 90, 10, 20, 90 } ,
				{ 100, 10, 20, 30 }
			};

		// 배열에 저장된 형태 그대로 출력하기
		// 배열명.length : 행의 크기
		// 배열명[이름?].length : 열의 크기
		for (int i = 0; i < atom.length; i++) {
			for (int j = 0; j < atom[0].length; j++) {
				System.out.print(atom[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
