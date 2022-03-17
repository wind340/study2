package templatemethod;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		System.out.println("디코드");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디/암호 확인 과정");
		return true;	//여기선 무조건 맞다고 하고 설정
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한 확인");
		//서버에서 유저 이름 유저 나이를 알수 있다.
		//10시이후라면 나이를 확인하고 권한을 없애자
		return 0;	//여기서도 게임 마스터
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속단계!!");
		return info;
	}

}
