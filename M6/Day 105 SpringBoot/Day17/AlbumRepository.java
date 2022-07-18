package com.cdac.repository;

import org.springframework.data.repository.CrudRepository;

import com.cdac.entity.Album;

//Repository is another name for Dao
public interface AlbumRepository extends CrudRepository<Album, Integer> {

}
