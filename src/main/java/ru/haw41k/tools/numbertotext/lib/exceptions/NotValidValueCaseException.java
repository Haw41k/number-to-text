package ru.haw41k.tools.numbertotext.lib.exceptions;

public class NotValidValueCaseException extends NotValidValueException {
    public NotValidValueCaseException() {
    }

    public NotValidValueCaseException(String message) {
        super(message);
    }

    public NotValidValueCaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
