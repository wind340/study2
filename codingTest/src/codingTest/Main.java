package codingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		
		//8958 첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 
		//길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
		/*
			5
			OOXXOXXOOO
			OOXXOOXXOO
			OXOXOXOXOXOXOX
			OOOOOOOOOO
			OOOOXOOOOXOOOOX
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		String[] arr = new String[n];
		

		for(int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i=0; i<n; i++) {
			int cnt = 0;
			int sum = 0;
			
			for(int j=0; j<arr[i].length(); j++ ) {
				if(arr[i].charAt(j)=='O') {
					cnt++;
				}
				else {
					cnt = 0;
				}
				sum+=cnt;
			}
			sb.append(sum).append('\n');
		}
		System.out.println(sb);
	}
}