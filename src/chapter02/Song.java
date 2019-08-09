package chapter02;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song() { //생성자
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public void show() {
		System.out.println(
				artist + " " +
				"(" +title + " " +
				album + " " +
				year + " " +
				track + "번, " +
				composer + "작곡"+")" 
				);
	}
	
	
	public Song(String title, String album, String artist, String composer, int year, int track) { //생성자
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.composer = composer;
		this.year = year;
		this.track = track;
		//some code1
		//some code2
		//some code3
	}
	 
	public Song(String title, String artist){
		this(title, null, artist, null, 0, 0);  //기존에 만들어져 있는 생성자를 재사용하는것.
		// == this.title = title;
		// == this.artist = artist;
		
		//some code1
		//some code2
		//some code3
	}
	
}
