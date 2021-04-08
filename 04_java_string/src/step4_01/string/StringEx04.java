package step4_01.string;

// 문자열 관련 데이터 형변환

public class StringEx04 {

	public static void main(String[] args) {

		// [1] 문자열 > 숫자 형변환
		String sNum = "10";
		System.out.println(sNum + 1);		// 101
		int nNum = Integer.parseInt(sNum);  // Integer.parseInt("문자열")메서드 사용
		System.out.println(nNum + 1);		// 11
		
		
		System.out.println("====================");
		 
		// [2] 숫자 > 문자열 형변환
		char ch = 'a';
		int aNum = (int)ch;
		System.out.println(aNum);
		
		ch = (char)(aNum + 1);
		System.out.println(ch);
		System.out.println("============");
		
		// 2-1) + "" 사용
		String str1 = nNum + "";
		System.out.println(str1 + 1); // 101
		
		// 2-2) Integer.toString(숫자)메서드 기능
		String str2 = Integer.toString(nNum);
		System.out.println(str2 + 1); // 101
		
		
		// 2-3) String.valueOf(숫자) 사용
		String str3 = String.valueOf(nNum);
		System.out.println(str3 + 1); // 101
		System.out.println("=================");
		
		
		//참고 ) 구글에서 ASCII 코드표 검색 ( 65 : 'A' , 97 : 'a' 상식으로 암기)
		
		//문자 > 숫자
		char ch1 = 'a';
		int n1 = (int)ch1;
		System.out.println(ch1+" / " + n1);
		
		char ch2 = 'A';
		int n2 = (int)ch2;
		System.out.println(ch2 + " / " + n2);
		
		//숫자 > 문자 
		int n3 = 100;
		char ch3 = (char)n3;
		System.out.println(n3 + " / " + ch3);
		System.out.println();
		
		System.out.println((int)'s'+ 3);   //115+3
		System.out.println((char)(n3+3));	//d + 3 == g
		
		
		
		
	}

}



