package com.luciano.apirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "usuario")
public class UserModel {
    @Id
    public Integer code;
    @Column(nullable = false, length = 60)
    public String user;
    @Column(nullable = false, length = 10)
    public String login;
    @Column(nullable = false, length = 10)
    public String password;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
