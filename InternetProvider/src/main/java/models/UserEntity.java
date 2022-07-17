package models;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
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
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "mandatoryParametersMissing")
    @NotNull
    @NotBlank
    @Pattern(regexp = "^[0-9]{12}$")
    //@SqlInjectionSafe
    @Column(unique = true, nullable = false, updatable = false)
    private String phone;

    @Column
    private boolean isActive;
    @Column
    private Role role;
    @Column
    private LocalDateTime created;
    @Column
    private LocalDateTime updated;
}
