package com.example.notetakingapp.exception;

public class NoteNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 6792706141413390385L;

	public NoteNotFoundException(Long id) {
        super("Note not found with id: " + id);
    }
}
