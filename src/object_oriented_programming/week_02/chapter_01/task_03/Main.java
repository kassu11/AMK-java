package object_oriented_programming.week_02.chapter_01.task_03;

public class Main {
	public static void main(String[] args) {
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		
		coffeeMaker.onOff();
		coffeeMaker.changeAmount(50);
		coffeeMaker.changeType("espresso");
		coffeeMaker.onOff();
		coffeeMaker.changeAmount(50);
		coffeeMaker.changeType("espresso");
	}
}
