package ru.haw41k.tools.numbertotext.lib.exceptions;

public class NotValidValueNumberException extends NotValidValueException {
    public NotValidValueNumberException() {
    }

    public NotValidValueNumberException(String message) {
        super(message);
    }

    public NotValidValueNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
