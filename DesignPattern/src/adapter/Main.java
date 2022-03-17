package adapter;

public class Main {
	
	public static void main(String[] args) {
		
		AudioPlayer mp3Player = new Mp3();
		mp3Player.play("file.mp3");
		
		mp3Player = new FormatAdapter(new Mp4());
		mp3Player.play("file.mp4");
		
		mp3Player = new FormatAdapter(new MKV());
		mp3Player.play("file.mkv");
		
	}
	
}
