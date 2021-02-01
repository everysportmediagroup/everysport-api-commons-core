package com.everysport.api.domain.api;

public class PlayerPosition {
    private String type;
    private String name;

    public PlayerPosition() {
    }

    public PlayerPosition(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
