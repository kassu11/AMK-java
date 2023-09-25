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
    private final ToggleGroup startGroup = new ToggleGroup();
    private final ToggleGroup endGroup = new ToggleGroup();
    private final TextField startCurrencyTextField = new TextField();
    private final TextField endCurrencyTextField = new TextField();
    private final Label errorLabel = new Label();
    private final String[] currencies = {"USD", "EUR", "JPY", "GBP"};

    private CurrencyController controller;

    public void start(Stage stage) {
        stage.setTitle("Dictionary");
        VBox startingCurrencyContainer = currencySettings(new VBox(), "Choose a starting currency: ", startGroup);
        VBox endingCurrencyContainer = currencySettings(new VBox(), "Choose a conversion currency: ", endGroup);

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

        errorLabel.setTextFill(javafx.scene.paint.Color.RED);
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

        VBox mainContainer = new VBox();
        mainContainer.setSpacing(25);
        mainContainer.paddingProperty().setValue(new Insets(16));
        mainContainer.getChildren().addAll(currencyContainer, errorLabel, gridPane);

        Scene scene = new Scene(mainContainer);
        stage.setScene(scene);
        stage.show();
    }

    public void init() {
        controller = new CurrencyController(this);
    }

    public VBox currencySettings(VBox container, String header, ToggleGroup group) {
        container.getChildren().add(new Label(header));

        for (String currency : currencies) {
            RadioButton radioButton = new RadioButton(currency);
            radioButton.setUserData(currency);
            radioButton.setToggleGroup(group);
            radioButton.setSelected(true);
            container.getChildren().add(radioButton);
        }

        return container;
    }

    public void convertAnswer(String answer) {
        endCurrencyTextField.setText(answer);
    }
}
