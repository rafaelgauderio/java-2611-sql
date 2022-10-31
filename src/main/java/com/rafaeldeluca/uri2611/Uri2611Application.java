package com.rafaeldeluca.uri2611;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafaeldeluca.uri2611.dto.MovieDTO;
import com.rafaeldeluca.uri2611.entities.Genre;
import com.rafaeldeluca.uri2611.projections.MovieIdNameProjection;
import com.rafaeldeluca.uri2611.repositories.GenreRepository;
import com.rafaeldeluca.uri2611.repositories.MovieRepository;

@SpringBootApplication
public class Uri2611Application implements CommandLineRunner {
	
	@Autowired
	private GenreRepository genreRepository;
	
	@Autowired
	private MovieRepository repository;	
	
	public static void main(String[] args) {
		SpringApplication.run(Uri2611Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		
		List<MovieIdNameProjection> movieList = repository.search1("Action");
		List<MovieDTO> resultMovie = movieList.stream().map(x -> new MovieDTO(x)).collect(Collectors.toList());
		
		List<MovieIdNameProjection> movieList2 = repository.search1("Drama");
		List<MovieDTO> resultMovie2 = movieList2.stream().map(m -> new MovieDTO(m)).collect(Collectors.toList());
		
		System.out.println("\nRESULTADO SQL RAIZ");
		for(MovieDTO nickname : resultMovie) {
			System.out.println(nickname);
		}
		
		System.out.println("\n");
		
		for(MovieDTO object : resultMovie2) {
			System.out.println(object);
		}
		
		
		
	}
}
