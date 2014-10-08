package com.everysport.api.domain.api;

public class Category extends ApiIdEntity {

    private String name;
    private Sport sport;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
}
