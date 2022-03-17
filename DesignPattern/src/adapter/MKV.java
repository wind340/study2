package adapter;

public class MKV implements VideoPlayer{
	@Override
	public void play(String filename) {
		System.out.println("Playing MKV File ▶ : "+ filename);
	}
}
