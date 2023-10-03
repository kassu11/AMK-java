package object_oriented_programming.week_07.chapter_02.task_01.view;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import object_oriented_programming.week_07.chapter_02.task_01.controller.CurrencyController;
import object_oriented_programming.week_07.chapter_02.task_01.dao.CurrencyDao;

import java.util.List;

public class CurrencyView extends Application {
    private final ToggleGroup startGroup = new ToggleGroup();
    private final ToggleGroup endGroup = new ToggleGroup();
    private final TextField startCurrencyTextField = new TextField();
    private final TextField endCurrencyTextField = new TextField();
    private final Label errorLabel = new Label();
    private final String[] currencies = {"USD", "EUR", "JPY", "GBP"};
    private CurrencyDao currency;


    private CurrencyController controller;

    public void start(Stage stage) {
        stage.setTitle("Currency Converter.");
        VBox startingCurrencyContainer = currencySettings(new VBox(), "Choose a source currency: ", startGroup);
        VBox endingCurrencyContainer = currencySettings(new VBox(), "Choose a target currency: ", endGroup);

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

        convertButton.setOnAction(event -> {
            String startCurrency = startGroup.getSelectedToggle().getUserData().toString();
            String endCurrency = endGroup.getSelectedToggle().getUserData().toString();
            String startValue = startCurrencyTextField.getText();
            if (startValue.isEmpty()) {
                System.out.println("The search field is empty");
                errorLabel.setText("The search field is empty");
                return;
            }

            try {
                double startingValue = Double.parseDouble(startValue);
                controller.convert(startingValue, startCurrency, endCurrency);
                errorLabel.setText("");
            } catch (NumberFormatException e) {
                System.out.println("The search field is not a number");
                errorLabel.setText("The search field is not a number");
            }
        });

        VBox helpContainer = new VBox();
        helpContainer.setSpacing(5);
        helpContainer.paddingProperty().setValue(new Insets(16));
        Label helpHeader = new Label("How to Use the Currency Converter:");
        helpHeader.getStyleClass().add("help-header");
        helpContainer.setAlignment(Pos.CENTER);
        helpContainer.getChildren().addAll(
                helpHeader,
                new Label("1. Input the amount you want to convert in the first field."),
                new Label("2. Use the radio button menus to choose your source and target currencies."),
                new Label("3. Click the \"Convert\" button to see the converted amount in the second field.")
        );

        VBox mainContainer = new VBox();
        mainContainer.setSpacing(25);
        mainContainer.paddingProperty().setValue(new Insets(16));
        mainContainer.getChildren().addAll(currencyContainer, errorLabel, gridPane, helpContainer);
        errorLabel.getStyleClass().add("error-label");


        Scene scene = new Scene(mainContainer);
        scene.getStylesheets().add("week6/chapter-2.css");
        stage.setScene(scene);
        stage.show();
    }

    public void init() {
        controller = new CurrencyController(this);
        currency = controller.getCurrency();
    }

    public VBox currencySettings(VBox container, String header, ToggleGroup group) {
        container.getChildren().clear();
        container.getChildren().add(new Label(header));

        for (String currency : currency.getCurrencies()) {
            RadioButton radioButton = new RadioButton(currency);
            radioButton.setUserData(currency);
            radioButton.setToggleGroup(group);
            radioButton.setSelected(true);
            container.getChildren().add(radioButton);
        }

        return container;
    }

    public void setErrorLabel(String message) {
        errorLabel.setText(message);
    }

    public void convertAnswer(String answer) {
        endCurrencyTextField.setText(answer);
    }
}
