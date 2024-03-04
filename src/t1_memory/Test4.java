package t1_memory;

public class Test4 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		// name1과 다른 지번으로 갈 수 있도록 name2로 아예 객체 생성
		String name2 = new String("홍길동");
		
		if(name1 == name2) {
			System.out.println("name1과 name2는 같습니다.");
		} else {
			System.out.println("name1과 name2는 다릅니다.");
		}
		// 지번 주소 비교
		
		System.out.println();
		
		if(name1.equals("홍길동")) {
			System.out.println("name1은 홍길동입니다.");
		} else {
			System.out.println("name1은 홍길동이 아닙니다.");
		}
		System.out.println();

		if(name1.equals(name2)) {
			System.out.println("name1과 name2는 같습니다.");
		} else {
			System.out.println("name1과 name2는 다릅니다.");
		}
		// 주소 안에 들어있는 값 비교
	}
}
