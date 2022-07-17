package com.dto;

import com.sun.istack.NotNull;
import lombok.*;
import models.Role;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class UserDto {

    private int id;

    @NotEmpty(message = "mandatoryParametersMissing")
    @NotNull
    @NotBlank
    @Pattern(regexp = "^[0-9]{12}$")
    //@SqlInjectionSafe
    private String phone;

    private boolean isActive;

    private Role role;

    private LocalDateTime created;

    private LocalDateTime updated;
}
