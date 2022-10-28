package com.rafaeldeluca.uri2611.dto;

import com.rafaeldeluca.uri2611.projections.MovieIdNameProjection;

public class MovieDTO {
	
	private Long id;
	private String name;
	 
	public MovieDTO () {
		
	}

	public MovieDTO(Long id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public MovieDTO(MovieIdNameProjection projection) {
		this.id = projection.getId();
		this.name = projection.getName();
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

	@Override
	public String toString() {
		return "Movie [id= " + id + ", Nome do filme= " + name + "]";
	}
	
	
	
	
	
	

}
