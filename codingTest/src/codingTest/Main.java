package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		//시작하는 시간과 오븐구이를 하는데 필요한 시간을 주어졌을때
		//오븐구이가 끝나는 시각을 계산하는 프로그램 작성하시오
		//첫입력 현재시간 입력 A시 B분  0<=A<=23  , 0<=B<=59 이며 두 수 사이엔 공백이 들어간다.
		//두입력시간  필요한 시간 C분 으로 0<= C <=1000단위로 주어진다.
		//A 14 B 30
		//C 20
		//출력결과: 14 50
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a1 = br.readLine().split(" ");
		int a = Integer.parseInt(a1[0]);
		int b = Integer.parseInt(a1[1]);
		int c = Integer.parseInt(br.readLine());
		br.close();
		
		int sumMinutes = b + c;
		int hours = (a + sumMinutes / 60) % 24;
		int minutes = sumMinutes % 60;

		System.out.println(hours+" "+minutes);
		
	}

}
