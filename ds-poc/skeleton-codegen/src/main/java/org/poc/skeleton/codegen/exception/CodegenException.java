
package org.poc.skeleton.codegen.exception;

public class CodegenException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    /**
     * status
     */
    private int status = 500;

    private String message;

    public CodegenException(String message) {
        super(message);
        this.message = message;
    }

    public CodegenException(int status, String message) {
        super(message);
        this.status = status;
        this.message = message;
    }

    public CodegenException(String message, Throwable cause) {
        super(message);
        this.status = status;
        this.message = message;
    }

    public CodegenException(int status,String message, Throwable cause) {
        super(message, cause);
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
