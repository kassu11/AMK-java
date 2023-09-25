package object_oriented_programming.week_06.chapter_01.task_01.view;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
import object_oriented_programming.week_06.chapter_01.task_01.controller.DictionaryController;


public class DictionaryView extends Application {
    private final Label searchLabel = new Label("Search translation: ");
    private final TextField searchTextField = new TextField();
    private final Button searchButton = new Button("Search");
    private final Label searchAnswer = new Label("Search result: ");

    private final Label addWordLabel = new Label("Add a word:");
    private final TextField addWordTextField = new TextField();
    private final Label addMeaningLabel = new Label("Enter a meaning for the word: ");
    private final TextField addMeaningTextField = new TextField();
    private final Button addMeaningButton = new Button("Add");
    private final Label addingStatusLabel = new Label("");
    private DictionaryController controller;

    public void start(Stage stage) {
        stage.setTitle("Dictionary");

        GridPane gridPane = new GridPane();

        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(5);

        gridPane.add(searchLabel, 0, 0);
        gridPane.add(searchTextField, 1, 0);
        gridPane.add(searchButton, 2, 0);
        gridPane.add(searchAnswer, 0, 1);

        searchButton.setOnAction(event -> {
            controller.getTranslation(searchTextField.getText());
        });

        gridPane.add(addWordLabel, 0, 2);
        gridPane.add(addWordTextField, 1, 2);
        gridPane.add(addMeaningLabel, 0, 3);
        gridPane.add(addMeaningTextField, 1, 3);
        gridPane.add(addMeaningButton, 0, 4);
        gridPane.add(addingStatusLabel, 0, 5);

        addMeaningButton.setOnAction(event -> {
            controller.addTranslation(addWordTextField.getText(), addMeaningTextField.getText());
        });

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();
    }

    public void init() {
        controller = new DictionaryController(this);
    }

    public void searchAnswer(String answer) {
        searchAnswer.setText(answer);
    }

    public void addingStatusLabel(String status) {
        addingStatusLabel.setText(status);
    }
}
