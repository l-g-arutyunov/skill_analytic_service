package com.devlife.skill_analytic_service.exception;

import java.util.Arrays;

public class UserNotFoundException extends RequestApiException {
    public UserNotFoundException(String... s) {
        super("User not found \n " + Arrays.toString(s));
    }
}
