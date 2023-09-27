package object_oriented_programming.week_06.chapter_03.task_01.model;

import object_oriented_programming.week_06.chapter_03.task_01.view.CanvasView;

public class CanvasRender extends Thread {
    private PetImage pet;
    private CanvasView view;

    public CanvasRender(PetImage pet, CanvasView view) {
        this.pet = pet;
        this.view = view;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(10);
                pet.movePet();
                view.renderPet(pet);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
