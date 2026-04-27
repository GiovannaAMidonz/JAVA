package org.example.getstarted.excepition;

public class UserNotFoundException extends RuntimeException {
    String message;

    public UserNotFoundException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
