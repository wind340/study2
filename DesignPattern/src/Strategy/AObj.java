package Strategy;

public class AObj {
		
	AInterface ainterface;
	
	public AObj() {
		ainterface = new AInterfaceImpl();
	}
	
	public void funcAA() {
		//위임
		ainterface.funcA();
		ainterface.funcA();
		
		//System.out.println("AAA");
		//System.out.println("AAA");
		
	}
	
}
