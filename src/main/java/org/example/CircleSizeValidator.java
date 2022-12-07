package org.example;

public class CircleSizeValidator {

    private static final int CIRCLE_SIZE_MAX = 80;
    private static final int CIRCLE_SIZE_MIN = 1;

    private static final String ERROR_CIRCLE_SIZE_NUMBER = "[ERROR] 숫자를 입력해야 합니다.";
    private static final String ERROR_CIRCLE_SIZE_RANGE = "[ERROR] 원의 크기는 1~80 이어야 합니다.";

    public void validate(String size) {
        if (!isNumber(size)) {
            throw new IllegalArgumentException(ERROR_CIRCLE_SIZE_NUMBER);
        }
        validateRange(size);
    }

    private boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private void validateRange(String input) {
        int size = Integer.parseInt(input);
        if (size < CIRCLE_SIZE_MIN || size > CIRCLE_SIZE_MAX) {
            throw new IllegalArgumentException(ERROR_CIRCLE_SIZE_RANGE);
        }
    }

}
