package dev.sagar.wordsmith.exception;

/**
 * Exception thrown when an attempt is made to create a resource
 * that already exists in the system.
 *
 * <p>This exception is typically used in scenarios such as user registration,
 * where a username or email already exists.</p>
 */
public class AlreadyExistException extends RuntimeException {

    public AlreadyExistException(String message) {
        super(message);
    }
}
