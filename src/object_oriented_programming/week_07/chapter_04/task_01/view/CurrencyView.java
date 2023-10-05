package object_oriented_programming.week_07.chapter_04.task_01.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import object_oriented_programming.week_07.chapter_04.task_01.application.CurrencyApp;
import object_oriented_programming.week_07.chapter_04.task_01.dao.CurrencyDao;
import object_oriented_programming.week_07.chapter_04.task_01.entity.Currency1;

public class CurrencyView extends Application {
    private final ToggleGroup startGroup = new ToggleGroup();
    private final ToggleGroup endGroup = new ToggleGroup();
    private final TextField startCurrencyTextField = new TextField();
    private final TextField endCurrencyTextField = new TextField();
    private final Label errorLabel = new Label();
    private final String[] currencies = {"USD", "EUR", "JPY", "GBP"};
    private CurrencyDao currency;


    private CurrencyApp controller;

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
                controller.convertCurrency(startingValue, startCurrency, endCurrency);
                controller.addTransaction(startCurrency, endCurrency, startingValue);
                errorLabel.setText("");
            } catch (NumberFormatException e) {
                System.out.println("The search field is not a number");
                errorLabel.setText("The search field is not a number");
            }
        });

        Button addNewCurrencyButton = new Button("Add new currency");
        addNewCurrencyButton.setOnAction(event -> {
            Stage popupStage = new Stage();
            GridPane popupGridPane = new GridPane();
            Label isoLabel = new Label("ISO: ");
            TextField isoTextField = new TextField();
            Label symbolLabel = new Label("Symbol: ");
            TextField symbolTextField = new TextField();
            Label rateLabel = new Label("Rate: (1 USD = ) ");
            TextField rateTextField = new TextField();
            Button addButton = new Button("Add");
            Button closeButton = new Button("Close");
            Label popupErrorLabel = new Label();

            popupGridPane.add(isoLabel, 0, 0);
            popupGridPane.add(isoTextField, 1, 0);
            popupGridPane.add(symbolLabel, 0, 1);
            popupGridPane.add(symbolTextField, 1, 1);
            popupGridPane.add(rateLabel, 0, 2);
            popupGridPane.add(rateTextField, 1, 2);
            popupGridPane.add(addButton, 1, 3);
            popupGridPane.add(closeButton, 2, 3);
            popupGridPane.add(popupErrorLabel, 1, 4, 3, 1);
            popupGridPane.setPadding(new Insets(16));
            popupGridPane.setVgap(10);
            popupGridPane.setHgap(5);

            addButton.setOnAction(event1 -> {
                String iso = isoTextField.getText();
                String symbol = symbolTextField.getText();
                String rate = rateTextField.getText();
                if(iso.length() > 3) {
                    System.out.println("The ISO code is too long");
                    popupErrorLabel.setText("The ISO code is too long");
                    return;
                }
                if (iso.isEmpty()) {
                    System.out.println("The ISO code is empty");
                    popupErrorLabel.setText("The ISO code is empty");
                    return;
                }
                if (symbol.isEmpty()) {
                    System.out.println("The symbol is empty");
                    popupErrorLabel.setText("The symbol is empty");
                    return;
                }
                if (rate.isEmpty()) {
                    System.out.println("The rate is empty");
                    popupErrorLabel.setText("The rate is empty");
                    return;
                }

                try {
                    double rateValue = Double.parseDouble(rate);
                    controller.addCurrency(iso, symbol, rateValue);
                    popupErrorLabel.setText("Currency added successfully");

                    currencySettings(startingCurrencyContainer, "Choose a source currency: ", startGroup);
                    currencySettings(endingCurrencyContainer, "Choose a target currency: ", endGroup);
                } catch (NumberFormatException e) {
                    System.out.println("The rate field is not a number");
                    popupErrorLabel.setText("The rate field is not a number");
                }
            });

            closeButton.setOnAction(event2 -> {
                popupStage.close();
            });

            Scene popupScene = new Scene(popupGridPane);
            popupStage.setScene(popupScene);
            popupStage.showAndWait();
        });



        VBox mainContainer = new VBox();
        mainContainer.setSpacing(25);
        mainContainer.paddingProperty().setValue(new Insets(16));
        mainContainer.getChildren().addAll(currencyContainer, addNewCurrencyButton, errorLabel, gridPane);
        errorLabel.getStyleClass().add("error-label");


        Scene scene = new Scene(mainContainer);
        scene.getStylesheets().add("week6/chapter-2.css");
        stage.setScene(scene);
        stage.show();
    }

    public void init() {
        controller = new CurrencyApp(this);
    }

    public VBox currencySettings(VBox container, String header, ToggleGroup group) {
        container.getChildren().clear();
        container.getChildren().add(new Label(header));

        for (Currency1 currency1 : controller.getAllCurrencies()) {
            RadioButton radioButton = new RadioButton(currency1.getIso());
            radioButton.setUserData(currency1.getIso());
            radioButton.setToggleGroup(group);
            radioButton.setSelected(true);
            container.getChildren().add(radioButton);
        }

        return container;
    }

    public void setErrorLabel(String message) {
        errorLabel.setText(message);
    }

    public void setEndCurrencyTextField(String answer) {
        endCurrencyTextField.setText(answer);
    }
}
