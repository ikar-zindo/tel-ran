package org.example._2023_09_15.refactor_code.dryKissYagni;

import java.util.stream.Collectors;


public class StringUtils {
    public static String toUpperCase(String input) {

        return input.chars()
                .mapToObj(Character::toString)
                .map(s -> {
                    if (s.equals(" ")) {
                        return " ";
                    } else {
                        return s.toUpperCase();
                    }
                })
                .collect(Collectors.joining());
    }
}