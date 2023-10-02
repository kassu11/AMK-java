package object_oriented_programming.week_06.chapter_04.task_01.model;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    List<Note> notes = new ArrayList<>();

    public void add(Note note) {
        notes.add(note);
    }

    public void remove(Note note) {
        notes.remove(note);
    }

    public void edit(Note note, String title, String text) {
        note.setTitle(title);
        note.setText(text);
    }

    public Note search(String title) {
        for (Note note : notes) {
            if (note.getTitle().equals(title)) {
                return note;
            }
        }
        return null;
    }

    public void displayNotes() {
        for (Note note : notes) {
            System.out.println(note.getTitle() + " " + note.getText());
        }
    }
}
