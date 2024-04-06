package DesignPatterns.Builder;

public class InvalidGradeYearExceptionn extends RuntimeException{
    public InvalidGradeYearExceptionn() {
    }

    public InvalidGradeYearExceptionn(String message) {
        super(message);
    }

    public InvalidGradeYearExceptionn(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGradeYearExceptionn(Throwable cause) {
        super(cause);
    }

    public InvalidGradeYearExceptionn(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
