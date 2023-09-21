package demos.demo_14_Maven.controller;

import demos.demo_14_Maven.model.Dice;
import demos.demo_14_Maven.view.DiceGUI;

public class DiceController {

    private DiceGUI gui;
    private Dice dice = new Dice(6);

    // constructor
    public DiceController(DiceGUI gui) {
        this.gui = gui;
    }

    // cast the dice
    public void cast() {
        int sides = gui.getSides();
        dice.setSides(sides);
        int result = dice.cast();
        gui.setResult(result);
    }

    public static void main(String[] args) {
        DiceGUI.launch(DiceGUI.class);
    }
}