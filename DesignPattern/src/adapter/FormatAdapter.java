package adapter;

public class FormatAdapter implements AudioPlayer{

	private VideoPlayer media;
	
	public FormatAdapter(VideoPlayer video) {
		this.media = video;
	}
	
	@Override
	public void play(String filename) {
		media.play(filename);
	}

}
