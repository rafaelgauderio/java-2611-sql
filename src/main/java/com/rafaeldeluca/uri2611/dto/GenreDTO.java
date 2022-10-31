package com.rafaeldeluca.uri2611.dto;

import com.rafaeldeluca.uri2611.projections.GenreIdDescriptionProjection;

public class GenreDTO {
	
	private Long id;
	private String description;
	
	public GenreDTO () {
		
	}

	public GenreDTO(Long id, String description) {
		
		this.id = id;
		this.description = description;
	}
	
	public GenreDTO(GenreIdDescriptionProjection projection) {
		
		this.id = projection.getId();
		this.description = projection.getDescription();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Genre [id= " + id + ", Gênero= " + description + "]";
	}	
	
	
}
