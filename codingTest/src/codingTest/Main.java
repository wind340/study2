package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		//2439 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
        	for(int j = t- 1; j>=i; j--) {
        		sb.append(" ");
        	}
        	for(int j= 1; j<=i; j++) {
        		sb.append("*");
        	}
        	sb.append("\n");
        }
        System.out.println(sb);
	}
}