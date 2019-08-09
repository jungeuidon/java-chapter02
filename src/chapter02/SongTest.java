package chapter02;

public class SongTest {

	public static void main(String[] args) {
		Song song = new Song();
		song.setTitle("좋은날");
		song.setAlbum("real");
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setTrack(3);
		song.setYear(2010);
		
		song.show();
		
		Song song2 = new Song("노래명 :술이 문제야 ", "앨범명 : ", "가수 :장혜진,윤민수", "작곡가:류재현", 2019, 1);
		song2.show();
		
		Song song3 = new Song("사랑에 연습이 있었다면", "임재현");
		song3.show();
	} 

}
