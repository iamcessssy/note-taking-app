package com.example.notetakingapp.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

//import javax.validation.constraints.NotEmpty;

@Data
public class Note {
    private Long id;

    @NotEmpty(message = "Title must not be empty")
    private String title;
    
	@NotEmpty(message = "Body must not be empty")
    private String body;

    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}