package ATM.controller;

public class ShortageException extends Exception{

    public ShortageException(String message) {
        super(message);
    }
}
