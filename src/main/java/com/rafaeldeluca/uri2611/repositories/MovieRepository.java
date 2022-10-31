package com.rafaeldeluca.uri2611.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rafaeldeluca.uri2611.dto.MovieDTO;
import com.rafaeldeluca.uri2611.entities.Movie;
import com.rafaeldeluca.uri2611.projections.MovieIdNameProjection;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	@Query(nativeQuery = true, value ="SELECT movies.id, movies.name, genres.description "
			+ "FROM movies "
			+ "INNER JOIN genres "
			+ "ON movies.id_genres = genres.id "
			+ "WHERE genres.description = :genreName")
	List<MovieIdNameProjection> search1 (String genreName);
	
	@Query("SELECT new com.rafaeldeluca.uri2611.dto.MovieDTO(objeto.id, objeto.name, objeto.genre.description) "
			+ "FROM Movie objeto "			
			+ "WHERE objeto.genre.description = :genreName")
	List<MovieDTO> searchJPQL(String genreName);
	
}
