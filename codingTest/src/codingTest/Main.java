package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		//11022  각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. 
		//x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            String str = br.readLine();
            sb.append("Case #").append(i).append(": ")
	            .append(str.charAt(0)).append(" + ").append(str.charAt(2))
	            .append(" = ").append(str.charAt(0)-'0'+str.charAt(2)-'0').append('\n');
        }
        System.out.println(sb);

	}
}