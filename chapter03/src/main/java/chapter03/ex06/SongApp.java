package chapter03.ex06;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song();
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setAlbum("Real");
		song.setYear(2010);
		song.setTrack(3);
		
		song.show();
	}
	
}
