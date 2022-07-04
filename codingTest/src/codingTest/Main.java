package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		//2741 1부터 입력받은 자연수 N까지 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
 
		for (int i = 1; i <= N; i++) {
			sb.append(i).append('\n');
		}
		br.close();
		System.out.println(sb);
	}
}