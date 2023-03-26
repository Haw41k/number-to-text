package ru.haw41k.tools.numbertotext.lib.exceptions;

public class NotValidValueException extends Exception {
    public NotValidValueException() {
    }
    public NotValidValueException(String message) {
        super(message);
    }

    public NotValidValueException(String message, Throwable cause) {
        super(message, cause);
    }
}
