package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// 2562 9개의 정수가 주어진다.  최댓값과 몇번째 수인지 구하는 프로그램을 작성하시오.
		//첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] array = new int[9];

        for(int i =0; i<9; i++) {
        	st = new StringTokenizer(br.readLine());
        	array[i] = Integer.parseInt(st.nextToken());	
        }
        
        int max = 0;
        int index = 0;
        for(int i=0; i<array.length; i++) {
        	if(array[i]>max) {
        		max=array[i];
        		index = i+1;
        	};
       }
        StringBuilder sb = new StringBuilder();
        sb.append(max).append('\n').append(index);
        System.out.print(sb);
    }
}