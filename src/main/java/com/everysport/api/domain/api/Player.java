package com.everysport.api.domain.api;

public class Player extends ApiBaseEntity {
    private Integer id;
    private String name;

    public Player() {
    }

    public Player(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
