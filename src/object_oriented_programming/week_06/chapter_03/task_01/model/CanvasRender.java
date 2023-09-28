package object_oriented_programming.week_06.chapter_03.task_01.model;

import object_oriented_programming.week_06.chapter_03.task_01.view.CanvasView;

public class CanvasRender extends Thread {
    private PetImage pet;
    private CanvasView view;
    private boolean running = false;

    public CanvasRender(PetImage pet, CanvasView view) {
        this.pet = pet;
        this.view = view;
    }

    public void close() {
        running = false;
    }

    @Override
    public void run() {
        running = true;
        while(running) {
            try {
                Thread.sleep(16);
                pet.movePet();
                view.renderPet(pet);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
