package org.example;

import java.util.Scanner;

public class UserInput {

    private static Scanner scanner= new Scanner(System.in);

    public UserInput() {
    }

    public static int readCircleSize() {
        String input = scanner.nextLine();
        CircleSizeValidator circleSizeValidator = new CircleSizeValidator();
        circleSizeValidator.validate(input);

        return Integer.parseInt(input);
    }

}
