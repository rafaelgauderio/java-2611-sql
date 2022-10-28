package com.rafaeldeluca.uri2611.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rafaeldeluca.uri2611.entities.Movie;
import com.rafaeldeluca.uri2611.projections.MovieIdNameProjection;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	@Query(nativeQuery = true, value ="SELECT movies.id, movies.name, genres.description AS gênero "
			+ "FROM movies "
			+ "INNER JOIN genres "
			+ "ON movies.id_genres = genres.id "
			+ "WHERE genres.description = :genreName")
	List<MovieIdNameProjection> search1 (String genreName);
	
}
