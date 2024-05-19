
package com.iudigital.recursoshumanos.exceptions;

public class ApplicationExceptions extends RuntimeException{
    public ApplicationExceptions(String message){
        super(message);
    }
    public ApplicationExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
