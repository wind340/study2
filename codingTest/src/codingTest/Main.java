package codingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		
		//8958 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		//둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
		//이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		//각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
		
		//예제입력
		//5
		//5 50 50 70 80 100
		//7 100 95 90 80 70 60 50
		//3 70 90 80
		//3 70 90 81
		//9 100 99 98 97 96 95 94 93 91
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		String[] arr = new String[n];

		for(int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
		for(int i=0; i<arr.length; i++) {
			int sum =0;
			double per = 0;
			double cnt =0;
			String[] ar = arr[i].split(" ");
			for(int j=1; j<ar.length; j++) {
				sum+=Integer.parseInt(ar[j]);
			}
			per = sum/Integer.parseInt(ar[0]);
			for(int k=1; k<ar.length; k++) {
				if(Integer.parseInt(ar[k])>per) {
					cnt+=1;
				}
			}
			
			String result= String.format("%.3f", cnt/Integer.parseInt(ar[0])*100);
			sb.append(result).append("%").append('\n');
		}
		System.out.println(sb);
	}
}