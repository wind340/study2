package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
	
		//2739 문제 N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());	
		br.close();
		
		StringBuilder sb = new StringBuilder();
        
		for(int i = 1; i<10;i++) {
			sb.append(a).append(' ').append('*').append(' ').append(i);
			sb.append(' ').append('=').append(' ').append(a*i).append('\n');
		}
		System.out.print(sb);
	}

}
