package com.afym.manual.doc02;

public class UserEntity {
    private String name;
    private String email;

    public UserEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public UserEntity(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return this.name.concat(" / ").concat(this.email);
    }
}
