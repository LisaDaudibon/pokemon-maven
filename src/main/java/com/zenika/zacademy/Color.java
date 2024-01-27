package com.zenika.zacademy;

public enum Color {
    RESET("\u001B[0m"),
    RED_BACKGROUND_BRIGHT ("\033[0;101m"), //RED
    GREEN_BACKGROUND_BRIGHT("\033[0;102m"),   // GREEN
    YELLOW_BACKGROUND_BRIGHT("\033[0;103m"),    // YELLOW
    BLUE_BACKGROUND_BRIGHT("\033[0;104m"),      // BLUE
    WHITE_BG("\u001B[47m"),
    BLACK_TEXT("\u001B[30m");

    private final String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
