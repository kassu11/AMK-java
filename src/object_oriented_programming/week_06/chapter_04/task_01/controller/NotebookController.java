package object_oriented_programming.week_06.chapter_04.task_01.controller;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import object_oriented_programming.week_06.chapter_04.task_01.model.Note;
import object_oriented_programming.week_06.chapter_04.task_01.model.Notebook;
import object_oriented_programming.week_06.chapter_04.task_01.view.NotebookView;

import java.net.URL;
import java.util.ResourceBundle;

public class NotebookController implements Initializable {
    public ListView notesLisView;
    public Button SaveNoteButton;
    public Button removeNoteButton;
    public TextField loadedNoteTitleTextField;
    public TextField loadedNoteContentTextFiel;
    public TextField noteTitleField;
    public TextField noteContentField;
    public Label noteAddingStatusLabel;
    public Button saveNoteButton;
    public Label loadedNoteStatusLabel;

    private Notebook notebook = new Notebook();
    private Note selectedNote = null;

    public void initialize(URL arg0, ResourceBundle arg1) {
        notesLisView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            String title = (String) notesLisView.getSelectionModel().getSelectedItem();
            Note note = notebook.search(title);
            if (note == null) return;

            loadedNoteTitleTextField.setText(note.getTitle());
            loadedNoteContentTextFiel.setText(note.getText());
            selectedNote = note;
        });
    }

    public void addNote() {
        String title = noteTitleField.getText();
        String content = noteContentField.getText();

        if(title.isEmpty()) changeNoteAddingStatus("Add note title");
        else if(content.isEmpty()) changeNoteAddingStatus("Add note content");
        else if(notebook.search(title) != null) changeNoteAddingStatus("Note with this title already exists");
        else {
            Note note = new Note(title, content);
            notebook.add(note);
            notesLisView.getItems().add(note.getTitle());
            changeNoteAddingStatus(String.format("Note \"%s\" added", note.getTitle()));
        }
    }

    public void changeNoteAddingStatus(String status) {
        noteAddingStatusLabel.setText(status);
    }

    public void changeLoadedNoteLabel(String status) {
        loadedNoteStatusLabel.setText(status);
    }

    public void removeNote() {
        if(selectedNote == null) {
            changeLoadedNoteLabel("Select note to remove");
            return;
        };

        String title = selectedNote.getTitle();
        notebook.remove(selectedNote);
        selectedNote = null;

        notesLisView.getItems().remove(title);

        if (selectedNote == null) {
            loadedNoteTitleTextField.setText("");
            loadedNoteContentTextFiel.setText("");
        }
    }

    public void editNote() {
        if(selectedNote == null) {
            changeLoadedNoteLabel("Select note to edit");
            return;
        };

        String title = loadedNoteTitleTextField.getText();
        String content = loadedNoteContentTextFiel.getText();

        if(title.isEmpty()) changeLoadedNoteLabel("Add note title");
        else if(content.isEmpty()) changeLoadedNoteLabel("Add note content");
        else if(notebook.search(title) != null && selectedNote != notebook.search(title)) changeLoadedNoteLabel("Note with this title already exists");
        else {
            String oldTitle = selectedNote.getTitle();
            notebook.edit(selectedNote, title, content);
            selectedNote = null;

            changeLoadedNoteLabel(String.format("Note \"%s\" edited", title));
            notesLisView.getItems().remove(oldTitle);
            notesLisView.getItems().add(title);

            if (selectedNote == null) {
                loadedNoteTitleTextField.setText("");
                loadedNoteContentTextFiel.setText("");
            }
        }
    }

    public static void main(String[] args) {
        NotebookView.launch(NotebookView.class);
    }
}
