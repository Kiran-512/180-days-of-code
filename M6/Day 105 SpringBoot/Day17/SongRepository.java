package com.cdac.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cdac.entity.Song;

public interface SongRepository extends CrudRepository<Song, Integer> {

	@Query("select s from Song s where s.artist = ?1")
	public List<Song> fetchSongsSungBy(String artist);
	
	//public List<Song> findSongByArtist(String artist);
}
