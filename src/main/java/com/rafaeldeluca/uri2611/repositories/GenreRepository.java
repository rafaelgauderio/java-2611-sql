package com.rafaeldeluca.uri2611.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rafaeldeluca.uri2611.entities.Genre;
import com.rafaeldeluca.uri2611.projections.GenreIdDescriptionProjection;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{
	
	@Query(nativeQuery = true, value ="SELECT movies.id, movies.name, genres.description "
			+ "FROM genres "
			+ "INNER JOIN movies "
			+ "ON movies.id_genres = genres.id "
			+ "WHERE genres.description = :genreName")
	List<GenreIdDescriptionProjection> search1 (String genreName);
	
}
