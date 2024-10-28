package LabWeek5ExceptionsAndFileIO;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String errorMessage) {
        super(errorMessage);
    }
}
