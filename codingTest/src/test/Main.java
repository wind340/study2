package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] st = br.readLine().split(" ");
		//상근이가 설정한 시간 H시 M분
		int H = Integer.parseInt(st[0]);
		int M = Integer.parseInt(st[1]);
		
		if(M-45<0) {
			H = H - 1;
			M = 60-45+M;
		}else{
			M = M-45;
		}
		if(H<0) {
			H=23;
		}
		System.out.println(H+" "+M);
	}
}
