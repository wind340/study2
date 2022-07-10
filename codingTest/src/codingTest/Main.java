package codingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		
		//15596 함수. 정수 N개의 합 구하기
		//정수 n개가 주어졌을때 n개의 합을 구하는
		//Java: long sum(int[] a); (클래스 이름: Test)
		//a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
		//리턴값: a에 포함되어 있는 정수 n개의 합

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++) {
			
		}

	}

	public class Test {
		public long sum(int[] a) {
			long sum=0;
			for(int i=0; i<a.length; i++) {
				sum += a[i];
			}
			return sum;
		}
	}
}

