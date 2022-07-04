package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		//10871 X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < n; i++) {
        	int a = Integer.parseInt(st.nextToken());
        	if(a<x) {
        		sb.append(a).append(" ");
        	}
        }
        
        System.out.println(sb);
	}
}