package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

    public static List<Integer> readDate() {
        System.out.println("Sun, Earth, Moon");
        System.out.println("날짜를 입력하세요.");
        String input = scanner.nextLine();

        DateValidator dateValidator = new DateValidator();
        dateValidator.validate(input);

        List<Integer> arr = Arrays.stream(input.replaceAll("([월|일])", "").split(" ")).map(Integer::parseInt).collect(
                Collectors.toUnmodifiableList());

        return arr;
    }

}
