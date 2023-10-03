package object_oriented_programming.week_06.chapter_03.task_01.view;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import object_oriented_programming.week_06.chapter_03.task_01.controller.PetController;
import object_oriented_programming.week_06.chapter_03.task_01.model.PetImage;

public class CanvasView extends Application {
    private PetController controller;
    private GraphicsContext gc;
    private PetImage pet;

    public void start(Stage stage) {
        stage.setTitle("Canvas View");

        Canvas canvas = new Canvas(600, 600);
        gc = canvas.getGraphicsContext2D();

        PetImage pet = controller.createPet("week6/Duke3D.png", 10, 10, 100, 100);

        canvas.setOnMouseMoved(event -> {
            pet.setDestinationX((int) event.getX());
            pet.setDestinationY((int) event.getY());
        });

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                pet.movePet();
                renderPet(pet);
            }
        };
        timer.start();

        VBox vBox = new VBox(canvas);
        stage.setScene(new Scene(vBox));
        stage.show();
    }

    public void renderPet(PetImage pet) {
        gc.clearRect(0, 0, 600, 600);
        gc.drawImage(pet.getImage(), pet.getX(), pet.getY(), pet.getWidth(), pet.getHeight());
    }

    public void init() {
        this.controller = new PetController(this);
    }
}
