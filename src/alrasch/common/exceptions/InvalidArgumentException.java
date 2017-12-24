package alrasch.common.exceptions;

public class InvalidArgumentException extends Exception {
    private String message;
    private String explanation;

    public InvalidArgumentException(String message, String explanation) {
        super(message);
        this.message = message;
        this.explanation = explanation;
    }

    public void printFullMessage() {
        System.out.println(message);
        System.out.println(explanation);
    }
}
