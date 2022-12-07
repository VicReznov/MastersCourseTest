package org.example;

import java.util.List;

public class TestController {

    public void start() {
        System.out.println("원의 크기는?");
        int circleSize = UserInput.readCircleSize();
        Game game = new Game(circleSize);
        game.printCircle();

        List<Integer> arr = UserInput.readDate();
        SolarGame solarGame = new SolarGame(arr.get(0), arr.get(1));
        solarGame.printSpace();
    }

}
