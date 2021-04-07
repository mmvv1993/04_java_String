package step4_01.string;

// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_문제 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		
		for(int i=0; i<names.length; i++) {
			
			String correctname = names[i];
			int nameidx = i;
			
			for(int j=i; j<names.length; j++) {
				if(correctname.compareTo(names[j]) > 0) {
					correctname = names[j];
					nameidx = j;
				}
			}
		String temp = names[i];
		names[i] = names[nameidx];
		names[nameidx] = temp;
		}
		
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
