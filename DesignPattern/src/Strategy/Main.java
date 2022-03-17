package Strategy;

public class Main {
	
	public static void main(String[] args) {
		AInterface ainterface = new AInterfaceImpl();
		
		//인터페이스구현
		ainterface.funcA();
		
		//델리게이트구현
		AObj aObj = new AObj();
		aObj.funcAA();
	}
}
