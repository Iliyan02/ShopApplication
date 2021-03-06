package com.prep.softuni.models.binding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterBindingModel {
    private String username;
    private String email;
    private String password;
    private String confirmPassword;
}
