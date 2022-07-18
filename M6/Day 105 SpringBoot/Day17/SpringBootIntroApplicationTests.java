package com.cdac;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cdac.entity.Album;
import com.cdac.entity.Song;
import com.cdac.repository.AlbumRepository;
import com.cdac.repository.SongRepository;

@SpringBootTest
class SpringBootIntroApplicationTests {

	@Autowired
	private AlbumRepository albumRepository;
	
	@Autowired
	private SongRepository songRepository;
	
	@Test
	void addAlbum() {
		Album album = new Album();
		album.setName("Hits of 2020");
		album.setReleaseDate(LocalDate.of(2020, 12, 30));
		album.setCopyright("Amazon Music");
		
		albumRepository.save(album);
		//asserts missing right now
	}
	
	@Test
	void addSong() {
		Album album = albumRepository.findById(1).get();
		
		Song song = new Song();
		song.setTitle("Title 4");
		song.setArtist("Taylor Swift");
		song.setDuration(2.45);
		song.setAlbum(album);
		
		songRepository.save(song);
		
	}

	@Test
	void fetchSongs() {
		List<Song> list = songRepository.fetchSongsSungBy("Taylor Swift");
		for(Song song : list)
			System.out.println(song.getTitle() + " " + song.getDuration());
	}
}
