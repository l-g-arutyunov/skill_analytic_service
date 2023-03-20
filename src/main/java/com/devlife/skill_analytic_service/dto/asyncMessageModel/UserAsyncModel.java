package com.devlife.skill_analytic_service.dto.asyncMessageModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserAsyncModel implements Serializable {
    private Long id;
    private Long authUser;
    private LocalDate dateOfRegistration;
    private ProfileAsyncModel profile;
}
