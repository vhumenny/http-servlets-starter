package com.dmdev.http.exception;

import com.dmdev.http.validator.Error;
import com.dmdev.http.validator.ValidationResult;
import lombok.Getter;

import java.util.List;

public class ValidationException extends RuntimeException {
    @Getter
    private final List<Error> errors;

    public ValidationException(List<Error> errors) {
        this.errors = errors;
    }
}
