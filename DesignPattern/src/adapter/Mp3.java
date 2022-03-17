package adapter;

public class Mp3 implements AudioPlayer {
	@Override
	public void play(String filename) {
		System.out.println("Playing Mp3 File ♪ : " + filename);
	}
}
