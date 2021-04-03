package com.example.springdtovalidation.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDto {

    private long id;

    @NotEmpty
    @Size(min = 5, message = "User name should at least 5 characters.")
    private String name;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(min = 8, message = "Password should at least 8 characters.")
    private String password;

    public UserDto() {
    }

    public UserDto(String name, String email, String password) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
