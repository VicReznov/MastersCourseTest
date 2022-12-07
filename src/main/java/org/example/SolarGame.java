package org.example;

public class SolarGame {

    private static final int EARTH_RADIUS = 10;
    private static final int MOON_RADIUS = 3;
    private static final int SUN_POSITION = 25;

    private final int month;
    private final int date;

    public char[][] space = new char[50][50];

    public SolarGame(int month, int date) {
        this.month = month;
        this.date = date;
        checkAll(month, date);
    }

    public void printSpace() {
        for(int i=0; i<space.length; i++) {
            for(int j=0; j<space.length; j++) {
                System.out.print(space[i][j]);
            }
            System.out.println();
        }
    }

    private void checkAll(int month, int date) {
        checkSun();
        int[] earthPos = checkEarth(month);
        checkMoon(date, earthPos);
    }

    private void checkSun() {
        for (int i = SUN_POSITION - 2; i < SUN_POSITION + 2; i++) {
            for (int j = SUN_POSITION - 2; j < SUN_POSITION + 2; j++) {
                space[i][j] = '*';
            }
        }
    }

    private int[] checkEarth(int month) {
        int x = (int)Math.cos((360/12)*(month-1)) * EARTH_RADIUS;
        int y = (int)Math.sin((360/12)*(month-1)) * EARTH_RADIUS;

        int[] earthPos = new int[]{SUN_POSITION + x, SUN_POSITION + y};

        space[earthPos[0]][earthPos[1]] = 'e';

        return earthPos;
    }

    private int[] checkMoon(int date, int[] earthPos) {
        int x = (int)Math.cos((360/27)*(date-1)) * MOON_RADIUS;
        int y = (int)Math.sin((360/27)*(date-1)) * MOON_RADIUS;

        int[] moonPos = new int[]{earthPos[0] + x, earthPos[1] + y};

        space[moonPos[0]][moonPos[1]] = 'm';

        return moonPos;
    }
}
