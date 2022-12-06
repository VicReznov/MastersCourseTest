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
            printCircleRow(i, sb);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private void printCircleRow(int row, StringBuilder sb) {
        for (int j = -radius - 1; j <= radius + 1; j++) {
            if (j == 0) continue;
            if (row * row + j * j < (radius + 0.5) * (radius + 0.5) && row * row + j * j > (radius - 0.5) * (radius - 0.5)) {
                sb.append("-");
            } else {
                sb.append(" ");
            }
        }
    }
}
