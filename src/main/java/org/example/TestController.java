package org.example;

public class TestController {

    public void start() {
        System.out.println("원의 크기는?");
        int circleSize = UserInput.readCircleSize();
        Game game = new Game(circleSize);
        game.printCircle();
    }

}
