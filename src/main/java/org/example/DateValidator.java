package org.example;

import java.util.regex.Pattern;

public class DateValidator {

    private static final String ERROR_DATE = "[ERROR] 날짜 입력이 잘못되었습니다.";

    public void validate(String input) {
        if(!validateDate(input)) {
            throw new IllegalArgumentException(ERROR_DATE);
        }
    }

    private boolean validateDate(String date) {
        String pattern =  "([1-9]|1[012])[월]\\s([1-9]|[12][0-9]|3[01])[일]";
        return Pattern.matches(pattern, date);
    }

}
