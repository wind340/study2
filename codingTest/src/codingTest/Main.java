package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// 10818 N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        
        int min = 1000000;
        int max = -1000000;
        st = new StringTokenizer(br.readLine());
        for (int nIndex = 0; nIndex < n; nIndex++) {
            int num = Integer.parseInt(st.nextToken());
            if (min > num) min = num;
            if (max < num) max = num;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(min).append(' ').append(max);
        System.out.print(sb);
    }
}