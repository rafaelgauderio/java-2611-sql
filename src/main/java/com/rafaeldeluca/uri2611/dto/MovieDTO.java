package com.rafaeldeluca.uri2611.dto;

import com.rafaeldeluca.uri2611.projections.MovieIdNameProjection;

public class MovieDTO {
	
	private Long id;
	private String name;
	private String genre;
	
	 
	public MovieDTO () {
		
	}

	public MovieDTO(Long id, String name) {
		
		this.id = id;
		this.name = name;
			
	}	
	
	

	public MovieDTO(Long id, String name, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
	}

	public MovieDTO(MovieIdNameProjection projection ) {
		this.id = projection.getId();
		this.name = projection.getName();
		this.genre = projection.getGenre();
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", genre=" + genre + "]";
	}

	
	
	
	



}
