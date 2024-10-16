package ru.practicum.diplom2.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class UserRequest {
    private String email;
    private String name;
    private String password;
}
