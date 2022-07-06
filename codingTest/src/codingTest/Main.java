package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		// 2577 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에
		// 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mul = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
        
        int[] arr = new int[10];
        
        while(mul!=0) {
        	arr[mul%10]++;
        	mul/=10;
        }
        
        for(int result :arr) {
        	System.out.println(result);
        }
        
	}
}