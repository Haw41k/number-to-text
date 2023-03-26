package ru.haw41k.tools.numbertotext.lib.exceptions;

public class NotValidValueGenderException extends NotValidValueException {
    public NotValidValueGenderException() {
    }

    public NotValidValueGenderException(String message) {
        super(message);
    }

    public NotValidValueGenderException(String message, Throwable cause) {
        super(message, cause);
    }
}
