package ru.practicum.diplom2.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessPatchUserResponse {
    private boolean success;
    private NestedUserInfo user;
}
