package demos.demo_14_Maven.view;

import demos.demo_14_Maven.controller.DiceController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Spinner;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class DiceGUI extends Application {

    // initialize components that need to be accessed from multiple methods
    private Label result = new Label("0");
    private Spinner<Integer> sidesSpinner = new Spinner<Integer>(1, 20, 6);
    private DiceController controller;

    public void start(Stage stage) {

        Button castButton = new Button("Cast");
        FlowPane pane = new FlowPane();

        stage.setTitle("Dice");

        // add outside margins for components
        Insets insets = new Insets(10, 10, 10, 10);
        pane.setMargin(result, insets);
        pane.setMargin(castButton, insets);
        pane.setMargin(sidesSpinner, insets);

        // reserve space for result
        result.setMinWidth(30);
        result.setAlignment(Pos.CENTER);

        // add components to the pane
        pane.getChildren().add(sidesSpinner);
        pane.getChildren().add(result);
        pane.getChildren().add(castButton);

        // create the scene and add it to the stage
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        // initialize the controller
        castButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                controller.cast();
            }
        });

        stage.show();
    }

    // initialize the controller
    public void init() {
        controller = new DiceController(this);
    }

    // getters and setters
    public int getSides() {
        // return Integer.parseInt(sides.getText());
        return sidesSpinner.getValue();
    }

    public void setResult(int result) {
        // set the result to the label
        this.result.setText(String.valueOf(result));
    }
}