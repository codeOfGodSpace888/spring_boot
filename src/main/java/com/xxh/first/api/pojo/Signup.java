package com.xxh.first.api.pojo;

import javax.persistence.Id;

public class Signup {
    //集成了IdsMapper<T>，所以需要在这里进行配置
    @Id
    private Long id;

    private String username;

    private String password;

    public Signup(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Signup() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}