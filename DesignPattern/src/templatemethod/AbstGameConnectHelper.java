package templatemethod;

public abstract class AbstGameConnectHelper {
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password); 
	protected abstract int authorization(String userName); 
	protected abstract String connection(String info);
	
	//템플릿 메소드
	public String requestConnection(String encodedInfo) {
		//보안 작업 - > 암호화된 문자열을 복호화
		String decodedInfo=doSecurity(encodedInfo);
		//반환된 값으로 아이디 암호 할당 
		String id = "aaa";	//패턴을 보기때문에 임시로넘어간다
		String password = "bbb";
		
		//인증
		if(!authentication(id, password)) {
			throw new Error("일치하지 않습니다");
		}
		String userName = "userName";
		
		//권한
		int i = authorization(userName);
		switch(i) {
		case -1:
			throw new Error("셧다운");
		case 0:	//게임마스터 
			break;
		case 1: //유료회원
			break;
		case 2:	//무료회원
			break;
		case 3:	//권한없음 
			break;
		default:	//기타 상황 대비
			break;
		}
		
		return connection(decodedInfo);
	}
}
