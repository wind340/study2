package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		//11021  각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다..
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= t; i++) {
            String str = br.readLine();
            sb.append("Case #").append(i).append(": ")
                    .append(str.charAt(0)-'0'+str.charAt(2)-'0').append('\n');
        }
        System.out.println(sb);

	}
}