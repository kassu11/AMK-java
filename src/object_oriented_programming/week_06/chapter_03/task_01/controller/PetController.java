package object_oriented_programming.week_06.chapter_03.task_01.controller;

import object_oriented_programming.week_06.chapter_03.task_01.model.PetImage;
import object_oriented_programming.week_06.chapter_03.task_01.view.CanvasView;

public class PetController {
    CanvasView view;

    public PetController(CanvasView view) {
        this.view = view;
    }

    public PetImage createPet(String path, int x, int y, int width, int height) {
        return new PetImage(path, x, y, width, height);
    }

    public static void main(String[] args) {
        CanvasView.launch(CanvasView.class);
    }
}
