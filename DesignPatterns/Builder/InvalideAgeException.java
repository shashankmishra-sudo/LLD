package DesignPatterns.Builder;

public class InvalideAgeException extends RuntimeException{
    public InvalideAgeException() {
    }

    public InvalideAgeException(String message) {
        super(message);
    }

    public InvalideAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalideAgeException(Throwable cause) {
        super(cause);
    }

    public InvalideAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
