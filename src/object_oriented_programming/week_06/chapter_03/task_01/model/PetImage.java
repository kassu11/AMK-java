package object_oriented_programming.week_06.chapter_03.task_01.model;

import javafx.scene.image.Image;

public class PetImage {
    private Image image;
    private int x, y, width, height, destinationX, destinationY;

    public PetImage(String imgPath, int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.image = new Image(imgPath);
    }

    public Image getImage() {
        return image;
    }

    public void setDestinationX(int destinationX) {
        this.destinationX = destinationX;
    }

    public void setDestinationY(int destinationY) {
        this.destinationY = destinationY;
    }

    public void movePet() {
        int deltaX = destinationX - x - width / 2;
        int deltaY = destinationY - y - height / 2;
        x += deltaX / 20;
        y += deltaY / 20;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
