package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
	
		//10950 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			String[] num = br.readLine().split(" ");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			int sum = a+b;
			sb.append(sum);
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
