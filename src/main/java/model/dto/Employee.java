package model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    private Long employeeId;
    private String name;
    private String gender;
    private String email;
    private String password;
    private String contact;
    private String role;
}
