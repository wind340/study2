package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
	
		//8393 n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int s = 0;
		
		for(int i =1; i<=n; i++) s+=i;
		
		System.out.println(s);
		
	}
}
