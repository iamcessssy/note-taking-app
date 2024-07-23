package com.example.notetakingapp.service;

import com.example.notetakingapp.exception.NoteNotFoundException;
import com.example.notetakingapp.model.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class NoteService {
    private List<Note> notes = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();

    public Note create(Note note) {
        note.setId(counter.incrementAndGet());
        notes.add(note);
        return note;
    }

    public List<Note> findAll() {
        return notes;
    }

    public Note findById(Long id) {
        return notes.stream().filter(note -> note.getId().equals(id))
                    .findFirst().orElseThrow(() -> new NoteNotFoundException(id));
    }

    public Note update(Long id, Note newNote) {
        Note existingNote = findById(id);
        existingNote.setTitle(newNote.getTitle());
        existingNote.setBody(newNote.getBody());
        return existingNote;
    }

    public void delete(Long id) {
        Note note = findById(id);
        notes.remove(note);
    }
}