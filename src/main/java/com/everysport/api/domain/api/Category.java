package com.everysport.api.domain.api;

public class Category extends ApiNamedEntity {

    private Sport sport;

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
}
