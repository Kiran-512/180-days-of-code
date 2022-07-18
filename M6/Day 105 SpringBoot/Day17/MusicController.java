package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entity.Album;
import com.cdac.entity.Song;
import com.cdac.service.MusicService;

@RestController
public class MusicController {

	@Autowired
	private MusicService musicService;
	
	@PostMapping("/add-album")
	/*
	 * The URL to test this code would be: localhost:8080/add-album
	 * In PostMan, go to the Body of the request and send the data
	 * in JSON format like this:
	 * 	{
    		"name" : "Hits of 2021",
    		"releaseDate" : "2021-12-25",
    		"copyright" : "Sony Music"
		}
		Spring will automatically read the request body and copy it into the Album object
	 */
	public String addAlbum(@RequestBody Album album) {
		musicService.save(album);
		return "Album added successfully!";
	}
	
	/*
	 * The JSON for this code would look like this:
	 * 
	 * {
    	"title" : "Some Title",
    	"artist" : "Beyounce",
	    "duration" : 4,
	    "album" : {
	        "id" : 2
	    }
	   }
	 */
	@PostMapping("/add-song")
	public String addSong(@RequestBody Song song) {
		musicService.save(song);
		return "Song added successfully!";
	}
	
	/*
	 * {
	    "id" : 5,
	    "title" : "Some Different Title",
	    "artist" : "Beyounce",
	    "duration" : 3.30,
	    "album" : {
	        "id" : 2
	    }
	}
	 */
	@PutMapping("/update-song")
	public String updateSong(@RequestBody Song song) {
		musicService.save(song);
		return "Song updated successfully!";
	}
	
	
	@DeleteMapping("/delete-song")
	public String deleteSong(@RequestParam("id")int id) {
		musicService.deleteSong(id);
		return "Song deleted successfully!";
	}
}
