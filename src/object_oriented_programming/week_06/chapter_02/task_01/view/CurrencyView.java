package object_oriented_programming.week_06.chapter_02.task_01.view;


import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;
import object_oriented_programming.week_06.chapter_02.task_01.controller.CurrencyController;

public class CurrencyView extends Application {
    private final TextField startCurrencyTextField = new TextField();
    private final TextField endCurrencyTextField = new TextField();

    private CurrencyController controller;

    public void start(Stage stage) {
        stage.setTitle("Dictionary");

        String[] currencies = {"USD", "EUR", "JPY", "GBP"};

        final ToggleGroup startGroup = new ToggleGroup();
        VBox startingCurrencyContainer = new VBox();
        startingCurrencyContainer.getChildren().add(new Label("Choose a starting currency: "));

        for(String currency : currencies) {
            RadioButton radioButton = new RadioButton(currency);
            radioButton.setUserData(currency);
            radioButton.setToggleGroup(startGroup);
            radioButton.setSelected(true);
            startingCurrencyContainer.getChildren().add(radioButton);
        }

        final ToggleGroup endGroup = new ToggleGroup();
        VBox endingCurrencyContainer = new VBox();
        endingCurrencyContainer.getChildren().add(new Label("Choose a conversion currency: "));

        for(String currency : currencies) {
            RadioButton radioButton = new RadioButton(currency);
            radioButton.setUserData(currency);
            radioButton.setToggleGroup(endGroup);
            radioButton.setSelected(true);
            endingCurrencyContainer.getChildren().add(radioButton);
        }

        startGroup.selectedToggleProperty().addListener(test -> {
            String value = startGroup.getSelectedToggle().getUserData().toString();
            if (value.equals("Home")) {
                System.out.println("Home");
            } else if (value.equals("Calendar")) {
                System.out.println("Calendar");
            } else if (value.equals("Contacts")) {
                System.out.println("Contacts");
            }
        });

        endGroup.selectedToggleProperty().addListener(test -> {
            String value = endGroup.getSelectedToggle().getUserData().toString();
            if (value.equals("Home")) {
                System.out.println("Home");
            } else if (value.equals("Calendar")) {
                System.out.println("Calendar");
            } else if (value.equals("Contacts")) {
                System.out.println("Contacts");
            }
        });

        HBox currencyContainer = new HBox();
        currencyContainer.setAlignment(Pos.CENTER);
        currencyContainer.setSpacing(25);
        currencyContainer.getChildren().addAll(startingCurrencyContainer, endingCurrencyContainer);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(5);

        Label startCurrencyLabel = new Label("Starting currency: ");
        Label endCurrencyLabel = new Label("Conversion currency: ");
        Button convertButton = new Button("Convert");

        gridPane.add(startCurrencyLabel, 0, 0);
        gridPane.add(startCurrencyTextField, 0, 1);
        gridPane.add(endCurrencyLabel, 2, 0);
        gridPane.add(endCurrencyTextField, 2, 1);
        gridPane.add(convertButton, 1, 1);

//        searchButton.setOnAction(event -> {
//            controller.getTranslation(searchTextField.getText());
//        });


//        addMeaningButton.setOnAction(event -> {
//            controller.addTranslation(addWordTextField.getText(), addMeaningTextField.getText());
//        });



        VBox mainContainer = new VBox();
        mainContainer.setSpacing(50);
        mainContainer.paddingProperty().setValue(new Insets(16));
        mainContainer.getChildren().addAll(currencyContainer, gridPane);

        Scene scene = new Scene(mainContainer);
        stage.setScene(scene);
        stage.show();
    }

    public void init() {
        controller = new CurrencyController(this);
    }

//    public void searchAnswer(String answer) {
//        searchAnswer.setText(answer);
//    }

//    public void addingStatusLabel(String status) {
//        addingStatusLabel.setText(status);
//    }
}
