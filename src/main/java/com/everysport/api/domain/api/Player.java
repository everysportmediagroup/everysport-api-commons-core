package com.everysport.api.domain.api;

public class Player extends ApiBaseEntity {
    private String id;
    private String name;

    public Player() {
    }

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
