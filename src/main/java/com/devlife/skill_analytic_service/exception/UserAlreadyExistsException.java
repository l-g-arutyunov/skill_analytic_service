package com.devlife.skill_analytic_service.exception;

public class UserAlreadyExistsException extends RequestApiException {
    public UserAlreadyExistsException(Long externalId) {
        super("User with externalId [" + externalId + "] already exists");
    }
}
