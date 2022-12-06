package org.example;

public class Game {

    private final int circleSize;
    private final int radius;

    public Game(int circleSize) {
        this.circleSize = circleSize;
        this.radius = circleSize / 2 + circleSize % 2;
    }

    public void printCircle() {
        StringBuilder sb = new StringBuilder();
        for (int i = -radius; i <= radius; i++) {
            if (i == 0) continue;
            for (int j = -radius - 1; j <= radius + 1; j++) {
                if (j == 0) continue;
                if (i * i + j * j < (radius + 0.5) * (radius + 0.5) && i * i + j * j > (radius - 0.5) * (radius - 0.5)) {
                    sb.append("-");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
